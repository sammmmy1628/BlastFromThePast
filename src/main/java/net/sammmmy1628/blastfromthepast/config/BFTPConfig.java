package net.sammmmy1628.blastfromthepast.config;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;

public class BFTPConfig 
{
	public static final BFTPConfig CONFIG;
	public static final ForgeConfigSpec CONFIG_SPEC;

	public static ForgeConfigSpec.BooleanValue cameraShakes;
	
    static 
    {
    	Pair<BFTPConfig, ForgeConfigSpec> pair = new ForgeConfigSpec.Builder().configure(BFTPConfig::new);
    	CONFIG = pair.getLeft();
    	CONFIG_SPEC = pair.getRight();
    }
	
    public BFTPConfig(ForgeConfigSpec.Builder config) 
    {
    	config.push("Client Settings");
    	cameraShakes = config.comment("disable/enable camera shakes in various place").define("cameraShakes", true);
        config.pop();
    }
}
