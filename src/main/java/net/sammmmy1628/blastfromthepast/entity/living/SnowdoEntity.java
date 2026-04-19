package net.sammmmy1628.blastfromthepast.entity.living;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.IForgeShearable;
import net.sammmmy1628.blastfromthepast.entity.BFTPEntities;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.SnowdoBreakMelonGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.SnowdoBreedGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.SnowdoDanceGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.SnowdoEatSliceGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.SnowdoSoftSitGoal;
import net.sammmmy1628.blastfromthepast.item.BFTPItems;

public class SnowdoEntity extends Animal implements IForgeShearable {

    private static final EntityDataAccessor<Boolean> IS_SPRINTING = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_SHEARED = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_TRIPPING = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_GLIDING = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_BREAKING = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_EATING_SLICE = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_DANCING = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);
    private static final EntityDataAccessor<Boolean> IS_SITTING_COMPLEX = SynchedEntityData.defineId(SnowdoEntity.class, EntityDataSerializers.BOOLEAN);

    public final AnimationState idleState = new AnimationState();
    public final AnimationState tripState = new AnimationState();
    public final AnimationState fallState = new AnimationState();
    public final AnimationState tailState = new AnimationState();
    public final AnimationState breakingState = new AnimationState();
    public final AnimationState eatingState = new AnimationState();
    public final AnimationState danceState = new AnimationState();
    public final AnimationState sitStartState = new AnimationState();
    public final AnimationState sitLoopState = new AnimationState();
    public final AnimationState sitEndState = new AnimationState();

    public float sprintProgress = 0.0F;
    private int shearTimer;
    private int tripTicks;

    public int rideCooldown = 0;
    private int tailAnimationCooldown = 80;
    public int breakMelonCooldown = 0;
    public int eatSliceCooldown = 0;

    public int eggTime = this.random.nextInt(6000) + 6000;

    public static final int SIT_TICKS_START = 20;
    public static final int SIT_TICKS_END = 16;
    public static final int SIT_TICKS_LOOP_MIN = 120;

    private int sitStateTimer = 0;
    private int sitDuration = 0;

    private boolean prevSittingClient = false;
    private int clientSitTick = 0;
    private int clientSitEndingTick = 0;

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
        this.entityData.define(IS_BREAKING, false);
        this.entityData.define(IS_EATING_SLICE, false);
        this.entityData.define(IS_DANCING, false);
        this.entityData.define(IS_SITTING_COMPLEX, false);
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

        this.goalSelector.addGoal(2, new SnowdoDanceGoal(this));
        this.goalSelector.addGoal(3, new SnowdoBreedGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new SnowdoEatSliceGoal(this));
        this.goalSelector.addGoal(5, new SnowdoBreakMelonGoal(this));

        this.goalSelector.addGoal(6, new SnowdoSoftSitGoal(this));

        this.goalSelector.addGoal(7, new TemptGoal(this, 1.25D, Ingredient.of(BFTPItems.GELIMELON_ICE_CREAM.get()), false));
        this.goalSelector.addGoal(8, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
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
            boolean currentSitting = this.isSittingComplex();

            if (currentSitting && !this.prevSittingClient) {
                this.clientSitTick = 0;
                this.clientSitEndingTick = 0;
            } else if (!currentSitting && this.prevSittingClient) {
                this.clientSitEndingTick = 1;
                this.clientSitTick = 0;
            }

            if (currentSitting) {
                this.clientSitTick++;
            } else if (this.clientSitEndingTick > 0) {
                this.clientSitEndingTick++;
                if (this.clientSitEndingTick > SIT_TICKS_END) {
                    this.clientSitEndingTick = 0;
                }
            }
            this.prevSittingClient = currentSitting;

            this.updateSprintProgress();
            this.updateAnimations();
        }

        if (this.getVehicle() instanceof Player player) {
            this.setYBodyRot(player.yBodyRot);
            this.setYRot(player.getYRot());
            this.setXRot(player.getXRot() * 0.5F);
            this.yHeadRot = this.yBodyRot;
            this.yHeadRotO = this.yBodyRot;

            Vec3 vec3 = player.getDeltaMovement();

            if (!player.onGround() && vec3.y < -0.1) {
                player.setDeltaMovement(vec3.multiply(1.0, 0.6, 1.0));
                player.resetFallDistance();
                this.setGliding(true);
            } else {
                this.setGliding(false);
            }
        } else {
            Vec3 vec3 = this.getDeltaMovement();

            if (!this.onGround() && vec3.y < -0.1) {
                this.setDeltaMovement(vec3.multiply(1.0, 0.6, 1.0));
            }

            double threshold = this.isGliding() ? -0.05 : -0.1;

            if (!this.onGround() && vec3.y < threshold) {
                this.setGliding(true);
            } else {
                this.setGliding(false);
            }
        }

        if (!this.level().isClientSide) {

            if (this.breakMelonCooldown > 0) {
                this.breakMelonCooldown--;
            }
            if (this.eatSliceCooldown > 0) {
                this.eatSliceCooldown--;
            }

            this.tickSoftSitServer();

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
        if (this.rideCooldown > 0) return InteractionResult.FAIL;

        if (itemstack.isEmpty() && !this.isBaby() && player.getPassengers().isEmpty()) {
            this.startRiding(player, true);
            return InteractionResult.sidedSuccess(this.level().isClientSide);
        } else if (itemstack.is(Items.SHEARS)) {
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

        if (this.isFood(itemstack)) {
            int i = this.getAge();
            if (!this.level().isClientSide && i == 0 && this.canFallInLove()) {
                this.usePlayerItem(player, hand, itemstack);
                this.setInLove(player);
                return InteractionResult.SUCCESS;
            }
        }

        return super.mobInteract(player, hand);
    }

    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        if (this.isGliding()) return false;
        return super.causeFallDamage(pFallDistance, pMultiplier, pSource);
    }

    @Override
    public void aiStep() {
        super.aiStep();
        if (!this.level().isClientSide) {
            if (this.isSheared()) {
                if (this.shearTimer > 0) this.shearTimer--;
                else this.setSheared(false);
            }

            if (this.isAlive() && !this.isBaby() && !this.isSheared()) {
                if (--this.eggTime <= 0) {
                    this.playSound(SoundEvents.CHICKEN_EGG, 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
                    this.spawnAtLocation(BFTPItems.SNOWDO_EGG.get());
                    this.eggTime = this.random.nextInt(6000) + 6000;
                }
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
    public boolean isTripping() { return this.entityData.get(IS_TRIPPING); }
    public void setSprinting(boolean sprinting) { this.entityData.set(IS_SPRINTING, sprinting); }
    public boolean isSprinting() { return this.entityData.get(IS_SPRINTING); }
    public boolean isSheared() { return this.entityData.get(IS_SHEARED); }
    public void setSheared(boolean sheared) { this.entityData.set(IS_SHEARED, sheared); }
    public void setGliding(boolean gliding) { this.entityData.set(IS_GLIDING, gliding); }
    public boolean isGliding() { return this.entityData.get(IS_GLIDING); }
    public void setBreaking(boolean breaking) { this.entityData.set(IS_BREAKING, breaking); }
    public boolean isBreaking() { return this.entityData.get(IS_BREAKING); }
    public void setEatingSlice(boolean eating) { this.entityData.set(IS_EATING_SLICE, eating); }
    public boolean isEatingSlice() { return this.entityData.get(IS_EATING_SLICE); }
    public boolean isMoving() { return this.getDeltaMovement().horizontalDistanceSqr() > 1.0E-6; }
    public void setDancing(boolean dancing) {this.entityData.set(IS_DANCING, dancing);}
    public boolean isDancing() {return this.entityData.get(IS_DANCING);}
    public void setSittingComplex(boolean state) {this.entityData.set(IS_SITTING_COMPLEX, state);}
    public boolean isSittingComplex() {return this.entityData.get(IS_SITTING_COMPLEX);}

    public boolean isSoftSitting() {
        return this.isSittingComplex();
    }

    public void startSoftSit() {
        if (!this.isSittingComplex()) {
            this.sitDuration = SIT_TICKS_LOOP_MIN;
            this.sitStateTimer = 0;
            this.setSittingComplex(true);
        }
    }

    public void stopSoftSit() {
        if (this.isSittingComplex()) {
            this.setSittingComplex(false);
            this.sitStateTimer = 0;
        }
    }

    private void tickSoftSitServer() {
        if (this.level().isClientSide || !this.isSittingComplex()) {
            return;
        }

        this.sitStateTimer++;
        this.getNavigation().stop();

        if (this.sitStateTimer >= SIT_TICKS_START && this.sitStateTimer < this.sitDuration + SIT_TICKS_START && this.getRandom().nextInt(100) == 0) {
            this.heal(1.0F);
        }

        if (this.sitStateTimer >= this.sitDuration + SIT_TICKS_START) {
            this.stopSoftSit();
        }
    }

    private void updateSprintProgress() {
        if (this.isSprinting() && this.isMoving()) {
            this.sprintProgress = Math.min(1.0F, this.sprintProgress + 0.1F);
        } else {
            this.sprintProgress = Math.max(0.0F, this.sprintProgress - 0.1F);
        }
    }

    protected void updateAnimations() {
        if (this.isDancing()) {
            this.danceState.startIfStopped(this.tickCount);
            this.idleState.stop();
            this.sitStartState.stop();
            this.sitLoopState.stop();
            this.sitEndState.stop();
            return;
        } else {
            this.danceState.stop();
        }
        if (this.isPassenger()) {
            if (this.isGliding()) {
                this.fallState.startIfStopped(this.tickCount);
            } else {
                this.idleState.startIfStopped(this.tickCount);
            }
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
        } else {
            if (!this.isMoving() && !this.isGliding()) {
                this.idleState.startIfStopped(this.tickCount);
            }

            if (this.isGliding()) {
                this.fallState.startIfStopped(this.tickCount);
            }
        }

        if (this.isTripping()) {
            this.tripState.startIfStopped(this.tickCount);
            this.idleState.stop();
            this.fallState.stop();
            this.sitStartState.stop();
            this.sitLoopState.stop();
            this.sitEndState.stop();
        } else {
            this.tripState.stop();
        }

        if (this.isBreaking()) {
            this.breakingState.startIfStopped(this.tickCount);
        } else {
            this.breakingState.stop();
        }

        if (this.isEatingSlice()) {
            this.eatingState.startIfStopped(this.tickCount);
        } else {
            this.eatingState.stop();
        }

        boolean isSitting = this.isSittingComplex();
        boolean isSitStarting = isSitting && this.clientSitTick <= SIT_TICKS_START;
        boolean isSitLoop = isSitting && this.clientSitTick > SIT_TICKS_START;
        boolean isSitEnding = !isSitting && this.clientSitEndingTick > 0;

        boolean isSitPlaying = (isSitStarting || isSitLoop || isSitEnding) && !this.isDancing() && !this.isTripping();

        if (isSitPlaying) {
            this.sitStartState.animateWhen(isSitStarting, this.tickCount);
            this.sitLoopState.animateWhen(isSitLoop, this.tickCount);
            this.sitEndState.animateWhen(isSitEnding, this.tickCount);
            
            // Override idle while sitting
            this.idleState.stop();
        } else {
            this.sitStartState.stop();
            this.sitLoopState.stop();
            this.sitEndState.stop();
        }
    }

    @Override
    public void onSyncedDataUpdated(EntityDataAccessor<?> pKey) {
        super.onSyncedDataUpdated(pKey);
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
        tag.putInt("RideCooldown", this.rideCooldown);
        tag.putInt("EggTime", this.eggTime);
        tag.putInt("BreakMelonCooldown", this.breakMelonCooldown);
        tag.putInt("EatSliceCooldown", this.eatSliceCooldown);
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
        if (tag.contains("EggTime")) {
            this.eggTime = tag.getInt("EggTime");
        }
        if (tag.contains("BreakMelonCooldown")) {
            this.breakMelonCooldown = tag.getInt("BreakMelonCooldown");
        }
        if (tag.contains("EatSliceCooldown")) {
            this.eatSliceCooldown = tag.getInt("EatSliceCooldown");
        }
    }

    public void resetBreakMelonCooldown() {this.breakMelonCooldown = 1200 + this.random.nextInt(2401);}

    public void resetEatSliceCooldown() {this.eatSliceCooldown = 1200 + this.random.nextInt(2401);}

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(BFTPItems.GELIMELON_ICE_CREAM.get());
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return BFTPEntities.SNOWDO.get().create(level);
    }

    @Override
    public boolean hurt(@NotNull DamageSource pSource, float pAmount) {
        if (this.isPassenger() && this.getVehicle() instanceof Player) {
            if (pSource.is(DamageTypes.IN_WALL)) {
                return false;
            }
        }
        return super.hurt(pSource, pAmount);
    }
}
