package net.sammmmy1628.blastfromthepast.entity.ai.goal;

import java.util.EnumSet;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.sammmmy1628.blastfromthepast.entity.living.SnowdoEntity;

public class SnowdoSoftSitGoal extends Goal {
    private final SnowdoEntity entity;

    public SnowdoSoftSitGoal(SnowdoEntity entity) {
        this.entity = entity;
        this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        if (this.entity.isSoftSitting()) return true;

        if (this.entity.isPassenger() || this.entity.isVehicle() || this.entity.isInWater()) return false;

        if (this.entity.getRandom().nextInt(200) != 0) return false;

        BlockPos pos = this.entity.blockPosition().below();
        BlockState state = this.entity.level().getBlockState(pos);
        boolean isSoftBlock = state.is(Blocks.GRASS_BLOCK) || state.is(BlockTags.WOOL);

        return this.entity.onGround() && isSoftBlock;
    }

    @Override
    public boolean canContinueToUse() {
        return this.entity.isSoftSitting();
    }

    @Override
    public void start() {
        this.entity.startSoftSit();
    }

    @Override
    public void stop() {
        this.entity.stopSoftSit();
    }
}