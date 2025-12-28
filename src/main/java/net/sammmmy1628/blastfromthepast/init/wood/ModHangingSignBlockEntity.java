package net.sammmmy1628.blastfromthepast.init.wood;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.sammmmy1628.blastfromthepast.init.entity.BFTPBlockEntities;

public class ModHangingSignBlockEntity extends SignBlockEntity {

    public ModHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {

        super(BFTPBlockEntities.MOD_HANGING_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return BFTPBlockEntities.MOD_HANGING_SIGN.get();
    }
}
