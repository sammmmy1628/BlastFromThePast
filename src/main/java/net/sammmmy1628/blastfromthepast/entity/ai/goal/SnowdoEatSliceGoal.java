package net.sammmmy1628.blastfromthepast.entity.ai.goal;

import java.util.EnumSet;
import java.util.List;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.sammmmy1628.blastfromthepast.entity.living.SnowdoEntity;
import net.sammmmy1628.blastfromthepast.item.BFTPItems;

public class SnowdoEatSliceGoal extends Goal {
    private final SnowdoEntity animal;
    private ItemEntity targetItem;
    private int timer;
    private boolean hasPickedUp;
    private int slicesEatenCount = 0;

    private static final int ANIMATION_DURATION = 24;
    private static final int PICKUP_TICK = 10;
    private static final int SEED_DROP_TICK = 14;

    public SnowdoEatSliceGoal(SnowdoEntity animal) {
        this.animal = animal;
        this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        if (this.animal.eatSliceCooldown > 0) return false;

        if (this.animal.isBaby() || this.animal.isVehicle()) return false;

        List<ItemEntity> list = this.animal.level().getEntitiesOfClass(ItemEntity.class, this.animal.getBoundingBox().inflate(8.0D, 8.0D, 8.0D), (entity) -> {
            return entity.getItem().is(BFTPItems.GELIMELON_SLICE.get()) && entity.isAlive();
        });

        if (!list.isEmpty()) {
            this.targetItem = list.get(0);
            return true;
        }
        return false;
    }

    @Override
    public void start() {
        this.timer = 0;
        this.hasPickedUp = false;
        this.slicesEatenCount = 0;
        this.animal.getNavigation().moveTo(this.targetItem, 1.0D);
    }

    @Override
    public void tick() {
        if (!this.hasPickedUp && (this.targetItem == null || !this.targetItem.isAlive())) {
            this.stop();
            return;
        }

        if (!this.hasPickedUp && this.targetItem != null) {
            this.animal.getLookControl().setLookAt(this.targetItem);
        }

        double distSq = (this.targetItem != null) ? this.animal.distanceToSqr(this.targetItem) : 0;

        if (this.hasPickedUp || distSq < 3.60D) {
            this.animal.getNavigation().stop();
            this.timer++;

            if (this.timer == 1) {
                this.animal.setEatingSlice(true);
            }

            if (this.timer >= PICKUP_TICK && !this.hasPickedUp) {
                if (this.targetItem != null && this.targetItem.isAlive()) {
                    ItemStack stack = this.targetItem.getItem();
                    this.slicesEatenCount = stack.getCount();
                    this.targetItem.discard();

                    this.hasPickedUp = true;
                    this.animal.playSound(SoundEvents.ITEM_PICKUP, 1.0f, 1.0f);
                }
            }

            if (this.timer > PICKUP_TICK && this.timer < SEED_DROP_TICK && this.timer % 4 == 0) {
                this.animal.playSound(SoundEvents.GENERIC_EAT, 1.0f, 1.0f);
            }

            if (this.timer == SEED_DROP_TICK) {
                if (this.slicesEatenCount > 0) {
                    ItemStack seeds = new ItemStack(BFTPItems.GELIMELON_SEEDS.get(), this.slicesEatenCount);
                    this.animal.spawnAtLocation(seeds);
                }
                this.animal.playSound(SoundEvents.PLAYER_BURP, 1.0f, 1.0f);
            }

        } else {
            if (this.targetItem != null && !this.hasPickedUp) {
                if (this.animal.getNavigation().isDone() || this.timer == 0) {
                    this.animal.getNavigation().moveTo(this.targetItem, 1.0D);
                }
            }
        }
    }

    @Override
    public boolean canContinueToUse() {
        if (this.hasPickedUp) {
            return this.timer < ANIMATION_DURATION;
        }
        return this.targetItem != null && this.targetItem.isAlive();
    }

    @Override
    public void stop() {
        if (this.hasPickedUp) {
            this.animal.resetEatSliceCooldown();
        }

        this.targetItem = null;
        this.timer = 0;
        this.hasPickedUp = false;
        this.slicesEatenCount = 0;
        this.animal.setEatingSlice(false);
    }
}