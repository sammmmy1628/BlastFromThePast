package net.sammmmy1628.blastfromthepast.world.biome;

import java.util.LinkedHashMap;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.sammmmy1628.blastfromthepast.world.BFTPBiomes;

public class BiomeGenerationConfig
{
    public static final LinkedHashMap<ResourceKey<Biome>, BiomeGenerationNoiseCondition> BIOMES = new LinkedHashMap<>();

    static
    {
        BIOMES.put(BFTPBiomes.FROSTBITE_FOREST, new BiomeGenerationNoiseCondition(0.7D, 180.0D, 260.0D, 0, new float[]{-0.05F, 0.85F}, new float[]{0.0F, 0.7F}, new float[]{0.1F, 1.0F}, new float[]{-1.0F, -0.45F}, new float[]{-0.5F, 0.5F}, null, new String[]{"minecraft:overworld"}));
    }

    public static int getBiomeCount()
    {
        return BIOMES.size();
    }
}
