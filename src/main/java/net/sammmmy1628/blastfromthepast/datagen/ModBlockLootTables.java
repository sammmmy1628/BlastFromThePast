package net.sammmmy1628.blastfromthepast.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.init.BFTPBlocks;
import net.sammmmy1628.blastfromthepast.init.BFTPItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.add(BFTPBlocks.GELIMELON_BLOCK.get(), block ->
                createSilkTouchDispatchTable(block,
                        this.applyExplosionDecay(block,
                                LootItem.lootTableItem(BFTPItems.GELIMELON_SLICE.get())
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(3.0F, 7.0F)))
                                        .apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE))
                        )
                )
        );

        this.add(BFTPBlocks.GELIMELON_STEM.get(),
                block -> createStemDrops(block, BFTPItems.GELIMELON_SEEDS.get()));

        this.dropSelf(BFTPBlocks.CEDAR_LOG.get());
        this.dropSelf(BFTPBlocks.CEDAR_STRIPPED_LOG.get());
        this.dropSelf(BFTPBlocks.CEDAR_PLANKS.get());
        this.dropSelf(BFTPBlocks.CEDAR_STAIRS.get());
        this.dropSelf(BFTPBlocks.CEDAR_BUTTON.get());
        this.dropSelf(BFTPBlocks.CEDAR_PRESSURE_PLATE.get());
        this.dropSelf(BFTPBlocks.CEDAR_TRAPDOOR.get());
        this.dropSelf(BFTPBlocks.CEDAR_FENCE.get());
        this.dropSelf(BFTPBlocks.CEDAR_FENCE_GATE.get());
        this.dropSelf(BFTPBlocks.CEDAR_CONE.get());

        this.add(BFTPBlocks.CEDAR_SLAB.get(),
                block -> createSlabItemTable(BFTPBlocks.CEDAR_SLAB.get()));

        this.add(BFTPBlocks.CEDAR_DOOR.get(),
                block -> createDoorTable(BFTPBlocks.CEDAR_DOOR.get()));

        this.add(BFTPBlocks.CEDAR_SIGN.get(), block ->
                createSingleItemTable(BFTPItems.CEDAR_SIGN.get()));
        this.add(BFTPBlocks.CEDAR_WALL_SIGN.get(), block ->
                createSingleItemTable(BFTPItems.CEDAR_SIGN.get()));

        this.add(BFTPBlocks.CEDAR_HANGING_SIGN.get(), block ->
                createSingleItemTable(BFTPItems.CEDAR_HANGING_SIGN.get()));
        this.add(BFTPBlocks.CEDAR_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(BFTPItems.CEDAR_HANGING_SIGN.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BFTPBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}