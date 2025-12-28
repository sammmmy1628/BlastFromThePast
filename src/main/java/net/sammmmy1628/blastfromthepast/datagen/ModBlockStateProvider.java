package net.sammmmy1628.blastfromthepast.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.init.BFTPBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BlastFromThePast.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(((RotatedPillarBlock) BFTPBlocks.CEDAR_LOG.get()));
        axisBlock((RotatedPillarBlock) BFTPBlocks.CEDAR_STRIPPED_LOG.get(), blockTexture(BFTPBlocks.CEDAR_STRIPPED_LOG.get()),
                modLoc("block/cedar_stripped_log_top"));

        blockItem(BFTPBlocks.CEDAR_LOG);
        blockItem(BFTPBlocks.CEDAR_STRIPPED_LOG);
        blockWithItem(BFTPBlocks.CEDAR_PLANKS);
        stairsBlock(((StairBlock) BFTPBlocks.CEDAR_STAIRS.get()), blockTexture(BFTPBlocks.CEDAR_PLANKS.get()));
        slabBlock(((SlabBlock) BFTPBlocks.CEDAR_SLAB.get()), blockTexture(BFTPBlocks.CEDAR_PLANKS.get()), blockTexture(BFTPBlocks.CEDAR_PLANKS.get()));
        buttonBlock(((ButtonBlock) BFTPBlocks.CEDAR_BUTTON.get()), blockTexture(BFTPBlocks.CEDAR_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) BFTPBlocks.CEDAR_PRESSURE_PLATE.get()), blockTexture(BFTPBlocks.CEDAR_PLANKS.get()));
        fenceBlock(((FenceBlock) BFTPBlocks.CEDAR_FENCE.get()), blockTexture(BFTPBlocks.CEDAR_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) BFTPBlocks.CEDAR_FENCE_GATE.get()), blockTexture(BFTPBlocks.CEDAR_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) BFTPBlocks.CEDAR_DOOR.get()), modLoc("block/cedar_door_bottom"), modLoc("block/cedar_door_top"),"cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) BFTPBlocks.CEDAR_TRAPDOOR.get()), modLoc("block/cedar_trapdoor"), true,"cutout");
        signBlock(((StandingSignBlock) BFTPBlocks.CEDAR_SIGN.get()), ((WallSignBlock) BFTPBlocks.CEDAR_WALL_SIGN.get()),
                blockTexture(BFTPBlocks.CEDAR_PLANKS.get()));
        hangingSignBlock(BFTPBlocks.CEDAR_HANGING_SIGN.get(), BFTPBlocks.CEDAR_WALL_HANGING_SIGN.get(), blockTexture(BFTPBlocks.CEDAR_PLANKS.get()));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(BlastFromThePast.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()) {
        });
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}