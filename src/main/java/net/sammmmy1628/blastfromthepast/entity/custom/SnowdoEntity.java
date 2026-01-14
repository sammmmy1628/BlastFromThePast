package net.sammmmy1628.blastfromthepast.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.IForgeShearable;
import net.sammmmy1628.blastfromthepast.entity.custom.ai.SnowdoBreedGoal;
import net.sammmmy1628.blastfromthepast.init.entity.BFTPEntities;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SnowdoEntity extends Animal implements IForgeShearable {

    private static final EntityDataAccessor<Boolean> IS_SPRINTING = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_SHEARED = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_TRIPPING = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_GLIDING = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);

    public final AnimationState idleState = new AnimationState();
    public final AnimationState tripState = new AnimationState();
    public final AnimationState fallState = new AnimationState();
    public final AnimationState tailState = new AnimationState();

    public float sprintProgress = 0.0F;
    private int shearTimer;
    private int tripTicks;

    public int rideCooldown = 0;
    private int tailAnimationCooldown = 80;

    public SnowdoEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(IS_SPRINTING, false);
        this.entityData.define(IS_SHEARED, false);
        this.entityData.define(IS_TRIPPING, false);
        this.entityData.define(IS_GLIDING, false);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 2.0D) {
            @Override
            public void start() {
                super.start();
                SnowdoEntity.this.setSprinting(true);
            }

            @Override
            public void stop() {
                super.stop();
                SnowdoEntity.this.setSprinting(false);
            }
        });

        this.goalSelector.addGoal(2, new SnowdoBreedGoal(this, 1.0D));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.25D, Ingredient.of(Items.MELON_SEEDS), false));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.18D)
                .add(Attributes.FOLLOW_RANGE, 16.0D);
    }

    @Override
    public void tick() {
        super.tick();

        if (this.level().isClientSide()) {
            this.updateSprintProgress();
            this.updateAnimations();

            if (this.getVehicle() instanceof Player && !this.isGliding()) {
                if (this.tailAnimationCooldown > 0) {
                    this.tailAnimationCooldown--;
                } else {
                    this.tailAnimationCooldown = 80;
                    this.tailState.start(this.tickCount);
                }
            } else {
                this.tailState.stop();
            }
        }

        if (this.getVehicle() instanceof Player player) {

            this.setYBodyRot(player.yBodyRot);
            this.setYRot(player.getYRot());
            this.setXRot(player.getXRot() * 0.5F);
            this.yHeadRot = this.yBodyRot;
            this.yHeadRotO = this.yBodyRot;

            Vec3 vec3 = player.getDeltaMovement();
            if (!player.onGround() && vec3.y < 0.0) {
                player.setDeltaMovement(vec3.multiply(1.0, 0.6, 1.0));
                player.resetFallDistance();
                this.setGliding(true);
            } else {
                this.setGliding(false);
            }

        } else {
            Vec3 vec3 = this.getDeltaMovement();
            if (!this.onGround() && vec3.y < 0.0) {
                this.setDeltaMovement(vec3.multiply(1.0, 0.6, 1.0));
            }
            this.setGliding(!this.onGround() && vec3.y < 0.0);
        }

        if (!this.level().isClientSide) {

            if (this.rideCooldown > 0) {
                this.rideCooldown--;
            }

            if (this.getVehicle() == null) {
                if (this.isTripping()) {
                    this.tripTicks--;
                    if (this.tripTicks <= 0) {
                        this.setTripped(false);
                    }
                } else {
                    if (this.getRandom().nextInt(500) == 0
                            && this.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6D
                            && this.onGround()) {
                        this.setTripped(true);
                    }
                }
            }

            if (this.isSheared()) {
                if (this.shearTimer > 0) {
                    this.shearTimer--;
                } else {
                    this.setSheared(false);
                }
            }
        }
    }

    @Override
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);

        if (this.rideCooldown > 0) {
            return InteractionResult.FAIL;
        }

        if (itemstack.isEmpty() && !this.isBaby() && player.getPassengers().isEmpty()) {
            this.startRiding(player, true);
            return InteractionResult.sidedSuccess(this.level().isClientSide);
        }

        else if (itemstack.is(Items.SHEARS)) {
            if (!this.level().isClientSide && !this.isSheared()) {
                this.level().playSound(null, this, SoundEvents.SHEEP_SHEAR, SoundSource.NEUTRAL, 1.0F, 1.0F);
                this.setSheared(true);
                this.shearTimer = this.random.nextInt(1200) + 1800;
                this.spawnAtLocation(new ItemStack(Items.FEATHER, this.random.nextIntBetweenInclusive(1, 3)));
                itemstack.hurtAndBreak(1, player, (p) -> p.broadcastBreakEvent(hand));
                return InteractionResult.SUCCESS;
            }
            return InteractionResult.CONSUME;
        }

        return super.mobInteract(player, hand);
    }

    // ... Resto de métodos (causeFallDamage, aiStep, get/set, etc.) sin cambios ...

    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        if (this.isGliding()) {
            return false;
        }
        return super.causeFallDamage(pFallDistance, pMultiplier, pSource);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (!this.level().isClientSide && this.isSheared()) {
            if (this.shearTimer > 0) {
                this.shearTimer--;
            } else {
                this.setSheared(false);
            }
        }
    }

    public void setTripped(boolean tripped) {
        this.entityData.set(IS_TRIPPING, tripped);
        if (tripped) {
            Objects.requireNonNull(this.getAttribute(Attributes.MOVEMENT_SPEED)).setBaseValue(0.0D);
            this.tripTicks = this.isBaby() ? 40 : 36;
            this.getNavigation().stop();
        } else {
            Objects.requireNonNull(this.getAttribute(Attributes.MOVEMENT_SPEED)).setBaseValue(0.18D);
            this.tripTicks = 0;
        }
    }

    public boolean isTripping() {
        return this.entityData.get(IS_TRIPPING);
    }

    public void setSprinting(boolean sprinting) {
        this.entityData.set(IS_SPRINTING, sprinting);
    }

    public boolean isSprinting() {
        return this.entityData.get(IS_SPRINTING);
    }

    public boolean isSheared() {
        return this.entityData.get(IS_SHEARED);
    }

    public void setSheared(boolean sheared) {
        this.entityData.set(IS_SHEARED, sheared);
    }

    public void setGliding(boolean gliding) {
        this.entityData.set(IS_GLIDING, gliding);
    }

    public boolean isGliding() {
        return this.entityData.get(IS_GLIDING);
    }

    public boolean isMoving() {
        return this.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6;
    }

    private void updateSprintProgress() {
        if (this.isSprinting() && this.isMoving()) {
            this.sprintProgress = Math.min(1.0F, this.sprintProgress + 0.1F);
        } else {
            this.sprintProgress = Math.max(0.0F, this.sprintProgress - 0.1F);
        }
    }

    protected void updateAnimations() {
        if (this.isPassenger()) {
            if (this.isGliding()) {
                this.fallState.startIfStopped(this.tickCount);
                this.idleState.stop();
            } else {
                this.fallState.stop();
                this.idleState.startIfStopped(this.tickCount);
            }
            return;
        }

        if (!this.isMoving() && !this.isGliding()) {
            this.idleState.startIfStopped(this.tickCount);
        } else {
            this.idleState.stop();
        }
        if (this.isTripping()) {
            this.tripState.startIfStopped(this.tickCount);
        } else {
            this.tripState.stop();
        }
        if (this.isGliding()) {
            this.fallState.startIfStopped(this.tickCount);
            this.idleState.stop();
        } else {
            this.fallState.stop();
        }
    }

    @Override
    public boolean isShearable(@NotNull ItemStack item, Level world, BlockPos pos) {
        return this.isAlive() && !this.isBaby() && !this.isSheared();
    }

    @Override
    public List<ItemStack> onSheared(@Nullable Player player, @NotNull ItemStack item, Level world, BlockPos pos, int fortune) {
        world.playSound(null, this, SoundEvents.SHEEP_SHEAR, player == null ? SoundSource.BLOCKS : SoundSource.PLAYERS, 1.0F, 1.0F);

        if (!world.isClientSide) {
            this.setSheared(true);
            this.shearTimer = this.random.nextInt(1200) + 1800;
        }

        int count = 1 + this.random.nextInt(3);
        List<ItemStack> drops = new ArrayList<>();
        drops.add(new ItemStack(Items.FEATHER, count));
        return drops;
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.putBoolean("Sheared", this.isSheared());
        tag.putInt("ShearTimer", this.shearTimer);
        tag.putBoolean("Tripped", this.isTripping());
        tag.putInt("TripTicks", this.tripTicks);
        // Guardamos el cooldown por si el servidor se cierra
        tag.putInt("RideCooldown", this.rideCooldown);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        this.setSheared(tag.getBoolean("Sheared"));
        this.shearTimer = tag.getInt("ShearTimer");
        if (tag.getBoolean("Tripped")) {
            this.setTripped(true);
            this.tripTicks = tag.getInt("TripTicks");
        }
        this.rideCooldown = tag.getInt("RideCooldown");
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(Items.MELON_SEEDS);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return BFTPEntities.SNOWDO.get().create(level);
    }
}