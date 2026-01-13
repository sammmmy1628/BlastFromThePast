package net.sammmmy1628.blastfromthepast.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.sammmmy1628.blastfromthepast.init.BFTPBlocks;
import net.sammmmy1628.blastfromthepast.init.BFTPItems;

public class GelimelonStemBlock extends CropBlock {
    // CAMBIO: Usamos AGE_4 porque tienes 5 etapas (0, 1, 2, 3, 4)
    public static final IntegerProperty AGE = BlockStateProperties.AGE_4;

    public GelimelonStemBlock(Properties properties) {
        super(properties);
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 4; // El máximo es 4
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return BFTPItems.GELIMELON_SEEDS.get();
    }

    @Override
    public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
        super.onPlace(pState, pLevel, pPos, pOldState, pIsMoving);
        pLevel.scheduleTick(pPos, this, 200); // 10 segundos
    }

    @Override
    public void tick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        if (!pLevel.isAreaLoaded(pPos, 1)) return;
        if (pLevel.getRawBrightness(pPos, 0) < 9) return;

        int currentAge = this.getAge(pState);

        if (currentAge < this.getMaxAge()) {
            // Avanzar etapa (0->1, 1->2, 2->3, 3->4)
            pLevel.setBlock(pPos, this.getStateForAge(currentAge + 1), 2);
            pLevel.scheduleTick(pPos, this, 200);
        } else {
            // Si está en Stage 4 y pasaron 10s -> Transformar
            pLevel.setBlock(pPos, BFTPBlocks.GELIMELON_BLOCK.get().defaultBlockState(), 2);
        }
    }

    @Override
    public void performBonemeal(ServerLevel pLevel, RandomSource pRandom, BlockPos pPos, BlockState pState) {
        int currentAge = this.getAge(pState);
        if (currentAge < this.getMaxAge()) {
            pLevel.setBlock(pPos, this.getStateForAge(currentAge + 1), 2);
            pLevel.scheduleTick(pPos, this, 200);
        } else {
            pLevel.setBlock(pPos, BFTPBlocks.GELIMELON_BLOCK.get().defaultBlockState(), 2);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}