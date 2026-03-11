package net.sammmmy1628.blastfromthepast.world;

import java.util.Set;

import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;

public interface BiomeSourceAccessor {
    void bftp_expandBiomesWith(Set<Holder<Biome>> set);
}
