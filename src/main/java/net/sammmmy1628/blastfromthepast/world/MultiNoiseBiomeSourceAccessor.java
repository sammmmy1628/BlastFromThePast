package net.sammmmy1628.blastfromthepast.world;

import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;

public interface MultiNoiseBiomeSourceAccessor {
    void bftp_setRegistryAccess(RegistryAccess registryAccess);

    void bftp_setLastSampledDimension(ResourceKey<Level> key);
    
    void bftp_setLastSampledWorldSeed(long seed);
}
