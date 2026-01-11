package net.sammmmy1628.blastfromthepast.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.block.custom.eggs.SnowdoEggBlock;
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

        simpleBlock(BFTPBlocks.CEDAR_CONE.get(),
                models().getExistingFile(modLoc("block/cedar_cone")));
        blockItem(BFTPBlocks.CEDAR_CONE);

        createSnowdoEggs();

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

    private void createSnowdoEggs() {
        BlockModelBuilder three_eggs_smooth = models().withExistingParent("three_eggs_smooth", modLoc("block/snowdo_eggs")).texture("1", modLoc("block/three_eggs_smooth"));
        BlockModelBuilder three_eggs_chipped = models().withExistingParent("three_eggs_chipped", modLoc("block/snowdo_eggs")).texture("1", modLoc("block/three_eggs_chipped"));
        BlockModelBuilder three_eggs_cracked = models().withExistingParent("three_eggs_cracked", modLoc("block/snowdo_eggs")).texture("1", modLoc("block/three_eggs_cracked"));

        BlockModelBuilder two_eggs_smooth = models().withExistingParent("two_eggs_smooth", modLoc("block/snowdo_eggs")).texture("1", modLoc("block/two_eggs_smooth"));
        BlockModelBuilder two_eggs_chipped = models().withExistingParent("two_eggs_chipped", modLoc("block/snowdo_eggs")).texture("1", modLoc("block/two_eggs_chipped"));
        BlockModelBuilder two_eggs_cracked = models().withExistingParent("two_eggs_cracked", modLoc("block/snowdo_eggs")).texture("1", modLoc("block/two_eggs_cracked"));

        BlockModelBuilder one_egg_smooth = models().withExistingParent("one_egg_smooth", modLoc("block/snowdo_eggs")).texture("1", modLoc("block/one_egg_smooth"));
        BlockModelBuilder one_egg_chipped = models().withExistingParent("one_egg_chipped", modLoc("block/snowdo_eggs")).texture("1", modLoc("block/one_egg_chipped"));
        BlockModelBuilder one_egg_cracked = models().withExistingParent("one_egg_cracked", modLoc("block/snowdo_eggs")).texture("1", modLoc("block/one_egg_cracked"));

        getVariantBuilder(BFTPBlocks.SNOWDO_EGG.get()).forAllStates(state -> {
            int hatch = state.getValue(BlockStateProperties.HATCH);
            int eggs = state.getValue(SnowdoEggBlock.EGGS);

            BlockModelBuilder modelBuilder;
            if (eggs == 3) {
                modelBuilder = switch (hatch) {
                    case 1 -> three_eggs_chipped;
                    case 2 -> three_eggs_cracked;
                    default -> three_eggs_smooth;
                };
            } else if (eggs == 2) {
                modelBuilder = switch (hatch) {
                    case 1 -> two_eggs_chipped;
                    case 2 -> two_eggs_cracked;
                    default -> two_eggs_smooth;
                };
            } else {
                modelBuilder = switch (hatch) {
                    case 1 -> one_egg_chipped;
                    case 2 -> one_egg_cracked;
                    default -> one_egg_smooth;
                };
            }

            return ConfiguredModel.builder()
                    .modelFile(modelBuilder)
                    .uvLock(false)
                    .build();
        });
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