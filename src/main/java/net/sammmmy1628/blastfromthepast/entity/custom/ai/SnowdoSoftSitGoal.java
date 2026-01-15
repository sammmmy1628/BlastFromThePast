package net.sammmmy1628.blastfromthepast.entity.custom.ai;

import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.sammmmy1628.blastfromthepast.entity.custom.SnowdoEntity;

import java.util.EnumSet;

public class SnowdoSoftSitGoal extends Goal {
    private final SnowdoEntity entity;

    public SnowdoSoftSitGoal(SnowdoEntity entity) {
        this.entity = entity;
        this.setFlags(EnumSet.of(Flag.MOVE, Flag.JUMP, Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        if (this.entity.sitController.isSitting()) return true;

        if (this.entity.isPassenger() || this.entity.isVehicle() || this.entity.isInWater()) return false;

        if (this.entity.getRandom().nextInt(200) != 0) return false;

        BlockPos pos = this.entity.blockPosition().below();
        BlockState state = this.entity.level().getBlockState(pos);
        boolean isSoftBlock = state.is(Blocks.GRASS_BLOCK) || state.is(BlockTags.WOOL);

        return this.entity.onGround() && isSoftBlock;
    }

    @Override
    public boolean canContinueToUse() {
        return this.entity.sitController.isSitting();
    }

    @Override
    public void start() {
        this.entity.sitController.startSitting();
    }

    @Override
    public void stop() {
        this.entity.sitController.stopSitting();
    }
}