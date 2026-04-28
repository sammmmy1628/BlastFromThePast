package net.sammmmy1628.blastfromthepast.world.biome;

import java.util.List;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.phys.Vec3;
import net.sammmmy1628.blastfromthepast.misc.VoronoiGenerator;

public class BiomeGenerationNoiseCondition
{
    private final double offsetAmount;
    private final double biomeSize;
    private final double separationDistance;
    private final int rarityOffset;
    private final float[] continentalness;
    private final float[] erosion;
    private final float[] humidity;
    private final float[] temperature;
    private final float[] weirdness;
    private final float[] depth;
    private final List<String> dimensions;

    public BiomeGenerationNoiseCondition(double offsetAmount, double biomeSize, double separationDistance, int rarityOffset, float[] continentalness, float[] erosion, float[] humidity, float[] temperature, float[] weirdness, float[] depth, String[] dimensions)
    {
        this.offsetAmount = offsetAmount;
        this.biomeSize = biomeSize * 0.25D;
        this.separationDistance = this.biomeSize + separationDistance * 0.25D;
        this.rarityOffset = rarityOffset;
        this.continentalness = continentalness;
        this.erosion = erosion;
        this.humidity = humidity;
        this.temperature = temperature;
        this.weirdness = weirdness;
        this.depth = depth;
        this.dimensions = List.of(dimensions);
    }

    public boolean test(int x, int y, int z, float unquantizedDepth, Climate.Sampler climateSampler, ResourceKey<Level> dimension, VoronoiGenerator.VoronoiInfo info)
    {
        Vec3 rareBiomeCenter = BFTPBiomeRarity.getRareBiomeCenter(info, this.separationDistance);
        if(rareBiomeCenter == null)
        {
            return false;
        }

        Climate.TargetPoint centerTargetPoint = climateSampler.sample((int) Math.floor(rareBiomeCenter.x), y, (int) Math.floor(rareBiomeCenter.z));
        float c = Climate.unquantizeCoord(centerTargetPoint.continentalness());
        if(this.continentalness != null && this.continentalness.length >= 2 && (c < this.continentalness[0] || c > this.continentalness[1]))
        {
            return false;
        }
        float e = Climate.unquantizeCoord(centerTargetPoint.erosion());
        if(this.erosion != null && this.erosion.length >= 2 && (e < this.erosion[0] || e > this.erosion[1]))
        {
            return false;
        }
        float h = Climate.unquantizeCoord(centerTargetPoint.humidity());
        if(this.humidity != null && this.humidity.length >= 2 && (h < this.humidity[0] || h > this.humidity[1]))
        {
            return false;
        }
        float t = Climate.unquantizeCoord(centerTargetPoint.temperature());
        if(this.temperature != null && this.temperature.length >= 2 && (t < this.temperature[0] || t > this.temperature[1]))
        {
            return false;
        }
        float w = Climate.unquantizeCoord(centerTargetPoint.weirdness());
        if(this.weirdness != null && this.weirdness.length >= 2 && (w < this.weirdness[0] || w > this.weirdness[1]))
        {
            return false;
        }
        if(this.depth != null && this.depth.length >= 2 && (unquantizedDepth < this.depth[0] || unquantizedDepth > this.depth[1]))
        {
            return false;
        }
        if(dimension != null && !this.dimensions.contains(dimension.location().toString()))
        {
            return false;
        }
        return true;
    }

    public double getOffsetAmount()
    {
        return this.offsetAmount;
    }

    public double getBiomeSize()
    {
        return this.biomeSize;
    }

    public double getSeparationDistance()
    {
        return this.separationDistance;
    }

    public int getRarityOffset()
    {
        return this.rarityOffset;
    }
}
