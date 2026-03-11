package net.sammmmy1628.blastfromthepast.entity.ai.goal;

import java.util.EnumSet;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.sammmmy1628.blastfromthepast.block.BFTPBlocks;
import net.sammmmy1628.blastfromthepast.entity.living.SnowdoEntity;

public class SnowdoBreakMelonGoal extends Goal {
    private final SnowdoEntity animal;
    private final Level level;
    private BlockPos targetBlock = null;
    private int timer = 0;
    private boolean successfulBreak = false;

    private static final int ANIMATION_LENGTH = 25;
    private static final int BREAK_TICK = 15;

    public SnowdoBreakMelonGoal(SnowdoEntity animal) {
        this.animal = animal;
        this.level = animal.level();
        this.setFlags(EnumSet.of(Flag.MOVE, Flag.LOOK));
    }

    @Override
    public boolean canUse() {

        if (this.animal.breakMelonCooldown > 0) return false;

        if (this.animal.isBaby() || this.animal.isVehicle()) return false;

        if (this.animal.getRandom().nextInt(20) != 0) return false;

        this.targetBlock = findNearbyMelon();
        return this.targetBlock != null;
    }

    @Override
    public void start() {
        this.timer = 0;
        this.successfulBreak = false;
        if (this.targetBlock != null) {
            this.animal.getNavigation().moveTo(this.targetBlock.getX() + 0.5D, this.targetBlock.getY(), this.targetBlock.getZ() + 0.5D, 1.0D);
        }
    }

    @Override
    public void tick() {
        if (this.targetBlock == null) return;

        this.animal.getLookControl().setLookAt(this.targetBlock.getX() + 0.5, this.targetBlock.getY(), this.targetBlock.getZ() + 0.5);

        double distSq = this.animal.distanceToSqr(this.targetBlock.getX() + 0.5D, this.targetBlock.getY(), this.targetBlock.getZ() + 0.5D);

        if (distSq <= 4.0D) {
            this.animal.getNavigation().stop();
            this.timer++;

            if (this.timer == 1) {
                this.animal.setBreaking(true);
            }

            if (this.timer == BREAK_TICK) {
                BlockState state = this.level.getBlockState(this.targetBlock);
                if (state.is(BFTPBlocks.GELIMELON_BLOCK.get())) {
                    this.level.levelEvent(2001, this.targetBlock, Block.getId(state));
                    this.level.playSound(null, this.targetBlock, SoundEvents.ZOMBIE_BREAK_WOODEN_DOOR, SoundSource.HOSTILE, 1.0f, 1.0f);
                    this.level.destroyBlock(this.targetBlock, true);

                    this.successfulBreak = true;
                }
            }
        }
    }

    @Override
    public boolean canContinueToUse() {
        return this.targetBlock != null && this.timer < ANIMATION_LENGTH && (this.timer >= BREAK_TICK || this.level.getBlockState(this.targetBlock).is(BFTPBlocks.GELIMELON_BLOCK.get()));
    }

    @Override
    public void stop() {
        if (this.successfulBreak) {
            this.animal.resetBreakMelonCooldown();
        }

        this.targetBlock = null;
        this.timer = 0;
        this.animal.setBreaking(false);
        this.successfulBreak = false;
    }

    private BlockPos findNearbyMelon() {
        BlockPos pos = this.animal.blockPosition();
        for (BlockPos nearbyPos : BlockPos.betweenClosed(pos.offset(-8, -2, -8), pos.offset(8, 2, 8))) {
            if (this.level.getBlockState(nearbyPos).is(BFTPBlocks.GELIMELON_BLOCK.get())) {
                return nearbyPos.immutable();
            }
        }
        return null;
    }
}