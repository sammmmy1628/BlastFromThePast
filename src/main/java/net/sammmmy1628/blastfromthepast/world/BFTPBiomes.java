package net.sammmmy1628.blastfromthepast.world;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;

public class BFTPBiomes {
	public static final ResourceKey<Biome> FROSTBITE_FOREST = register("frostbite_forest");
	   
	public static ResourceKey<Biome> register(String name) {
		return ResourceKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, name));
	}
}
