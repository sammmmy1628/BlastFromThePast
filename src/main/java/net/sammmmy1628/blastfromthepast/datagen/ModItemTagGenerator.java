package net.sammmmy1628.blastfromthepast.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.init.BFTPBlocks;

import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> lookupProvider,
                               CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, lookupProvider, blockTags, BlastFromThePast.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.SLABS).add(
                BFTPBlocks.CEDAR_SLAB.get().asItem()
        );

        this.tag(ItemTags.WOODEN_BUTTONS).add(
                BFTPBlocks.CEDAR_BUTTON.get().asItem()
        );

        this.tag(ItemTags.WOODEN_FENCES).add(
                BFTPBlocks.CEDAR_FENCE.get().asItem()
        );

        this.tag(ItemTags.WOODEN_DOORS).add(
                BFTPBlocks.CEDAR_DOOR.get().asItem()
        );

        this.tag(ItemTags.WOODEN_SLABS).add(
                BFTPBlocks.CEDAR_SLAB.get().asItem()
        );

        this.tag(ItemTags.WOODEN_STAIRS).add(
                BFTPBlocks.CEDAR_STAIRS.get().asItem()
        );

        this.tag(ItemTags.WOODEN_PRESSURE_PLATES).add(
                BFTPBlocks.CEDAR_PRESSURE_PLATE.get().asItem()
        );

        this.tag(ItemTags.WOODEN_TRAPDOORS).add(
                BFTPBlocks.CEDAR_TRAPDOOR.get().asItem()
        );

        this.tag(ItemTags.LOGS_THAT_BURN).add(
                BFTPBlocks.CEDAR_LOG.get().asItem()
        );

        this.tag(ItemTags.PLANKS).add(
                BFTPBlocks.CEDAR_PLANKS.get().asItem());
    }
}