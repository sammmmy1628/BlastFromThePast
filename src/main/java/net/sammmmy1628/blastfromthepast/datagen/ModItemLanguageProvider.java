package net.sammmmy1628.blastfromthepast.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.init.BFTPBlocks;
import net.sammmmy1628.blastfromthepast.init.BFTPItems;

public class ModItemLanguageProvider extends LanguageProvider {
    public ModItemLanguageProvider(PackOutput output, String locale) {
        super(output, BlastFromThePast.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add("creativetab.blast_from_the_past_items", "Blast From The Past");

        add(BFTPBlocks.CEDAR_LOG.get(), "Cedar Log");
        add(BFTPBlocks.CEDAR_STRIPPED_LOG.get(), "Stripped Cedar Log");
        add(BFTPBlocks.CEDAR_PLANKS.get(), "Cedar Planks");
        add(BFTPBlocks.CEDAR_STAIRS.get(), "Cedar Stairs");
        add(BFTPBlocks.CEDAR_SLAB.get(), "Cedar Slab");
        add(BFTPBlocks.CEDAR_BUTTON.get(), "Cedar Button");
        add(BFTPBlocks.CEDAR_PRESSURE_PLATE.get(), "Cedar Pressure Plate");
        add(BFTPBlocks.CEDAR_FENCE.get(), "Cedar Fence");
        add(BFTPBlocks.CEDAR_FENCE_GATE.get(), "Cedar Fence Gate");
        add(BFTPBlocks.CEDAR_DOOR.get(), "Cedar Door");
        add(BFTPBlocks.CEDAR_TRAPDOOR.get(), "Cedar Trapdoor");
        add(BFTPBlocks.CEDAR_CONE.get(), "Cedar Cone");

        add(BFTPItems.SNOWDO_SPAWN_EGG.get(), "Snowdo Spawn Egg");
        add(BFTPBlocks.SNOWDO_EGG.get(), "Snowdo Egg");

        add(BFTPItems.CEDAR_SIGN.get(), "Cedar Sign");
        add(BFTPItems.CEDAR_HANGING_SIGN.get(), "Cedar Hanging Sign");

        add("entity.blastfromthepast.snowdo", "Snowdo");
    }
}