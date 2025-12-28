package net.sammmmy1628.blastfromthepast.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.init.BFTPBlocks;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BlastFromThePast.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(@NotNull HolderLookup.Provider pProvider) {
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(BFTPBlocks.CEDAR_LOG.get())
                .add(BFTPBlocks.CEDAR_STRIPPED_LOG.get());

        this.tag(BlockTags.PLANKS)
                .add(BFTPBlocks.CEDAR_PLANKS.get());

        this.tag(BlockTags.WOODEN_FENCES)
                .add(BFTPBlocks.CEDAR_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(BFTPBlocks.CEDAR_FENCE_GATE.get());

        this.tag(BlockTags.WOODEN_SLABS)
                .add(BFTPBlocks.CEDAR_SLAB.get());

        this.tag(BlockTags.WOODEN_STAIRS)
                .add(BFTPBlocks.CEDAR_STAIRS.get());

        this.tag(BlockTags.WOODEN_DOORS)
                .add(BFTPBlocks.CEDAR_DOOR.get());

        this.tag(BlockTags.WOODEN_BUTTONS)
                .add(BFTPBlocks.CEDAR_BUTTON.get());

        this.tag(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BFTPBlocks.CEDAR_PRESSURE_PLATE.get());

        this.tag(BlockTags.WOODEN_TRAPDOORS)
                .add(BFTPBlocks.CEDAR_TRAPDOOR.get());

        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                BFTPBlocks.CEDAR_FENCE.get(),
                BFTPBlocks.CEDAR_FENCE_GATE.get(),
                BFTPBlocks.CEDAR_BUTTON.get(),
                BFTPBlocks.CEDAR_PRESSURE_PLATE.get(),
                BFTPBlocks.CEDAR_DOOR.get(),
                BFTPBlocks.CEDAR_TRAPDOOR.get(),
                BFTPBlocks.CEDAR_SLAB.get(),
                BFTPBlocks.CEDAR_STAIRS.get(),
                BFTPBlocks.CEDAR_SIGN.get(),
                BFTPBlocks.CEDAR_WALL_HANGING_SIGN.get(),
                BFTPBlocks.CEDAR_WALL_SIGN.get(),
                BFTPBlocks.CEDAR_SIGN.get()
        );
    }
}