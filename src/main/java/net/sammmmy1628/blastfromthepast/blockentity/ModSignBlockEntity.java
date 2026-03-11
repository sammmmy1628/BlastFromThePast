package net.sammmmy1628.blastfromthepast.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.sammmmy1628.blastfromthepast.block.BFTPBlocks;

public class ModSignBlockEntity extends SignBlockEntity {
    public ModSignBlockEntity(BlockPos pPos, BlockState pBlockState) {

        super(BFTPBlocks.MOD_SIGN.get(), pPos, pBlockState);
    }
    @Override
    public BlockEntityType<?> getType() {
        return BFTPBlocks.MOD_SIGN.get();
    }
}
