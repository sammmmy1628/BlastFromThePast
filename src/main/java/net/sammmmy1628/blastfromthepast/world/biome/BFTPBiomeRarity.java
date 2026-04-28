package net.sammmmy1628.blastfromthepast.world.biome;

import java.util.List;

import javax.annotation.Nullable;

import com.google.common.collect.ImmutableList;

import net.minecraft.world.level.levelgen.XoroshiroRandomSource;
import net.minecraft.world.level.levelgen.synth.PerlinSimplexNoise;
import net.minecraft.world.phys.Vec3;
import net.sammmmy1628.blastfromthepast.misc.VoronoiGenerator;

public class BFTPBiomeRarity
{
	private static final List<Integer> BIOME_OCTAVES = ImmutableList.of(0);
	private static final PerlinSimplexNoise NOISE_X = new PerlinSimplexNoise(new XoroshiroRandomSource(1234L), BIOME_OCTAVES);
	private static final PerlinSimplexNoise NOISE_Z = new PerlinSimplexNoise(new XoroshiroRandomSource(4321L), BIOME_OCTAVES);
	private static final VoronoiGenerator VORONOI_GENERATOR = new VoronoiGenerator(42L);
	
	@Nullable
	public static VoronoiGenerator.VoronoiInfo getRareBiomeInfoForQuad(double offsetAmount, double biomeSize, double separationDistance, long worldSeed, int x, int z)
	{
		VORONOI_GENERATOR.setOffsetAmount(offsetAmount);
		VORONOI_GENERATOR.setSeed(worldSeed);
		double sampleX = x / separationDistance;
		double sampleZ = z / separationDistance;
		double positionOffsetX = 0.15D * NOISE_X.getValue(sampleX, sampleZ, false);
		double positionOffsetZ = 0.15D * NOISE_Z.getValue(sampleX, sampleZ, false);
		VoronoiGenerator.VoronoiInfo info = VORONOI_GENERATOR.get2(sampleX + positionOffsetX, sampleZ + positionOffsetZ);
		return info.distance() < (biomeSize / separationDistance) ? info : null;
	}
	
	@Nullable
	public static Vec3 getRareBiomeCenter(VoronoiGenerator.VoronoiInfo voronoiInfo, double separationDistance)
	{
		return voronoiInfo.cellPos().scale(separationDistance);
	}
	
	public static int getRareBiomeOffsetId(VoronoiGenerator.VoronoiInfo voronoiInfo, int biomeCount)
	{
		return (int) (((voronoiInfo.hash() + 1.0D) * 0.5D) * biomeCount);
	}
}
