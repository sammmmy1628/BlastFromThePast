package net.sammmmy1628.blastfromthepast.misc;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;

public class BFTPWoodTypes 
{
    public static final BlockSetType CDEAR_SET_TYPE = BlockSetType.register(new BlockSetType("cedar"));
    public static final WoodType CEDAR = WoodType.register(new WoodType(BlastFromThePast.MODID + ":cedar", CDEAR_SET_TYPE));
}
