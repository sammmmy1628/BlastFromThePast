package net.sammmmy1628.blastfromthepast.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;

public class BFTPSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BlastFromThePast.MOD_ID);

    public static final RegistryObject<SoundEvent> MUSIC_DISC_BFTP = SOUND_EVENTS.register("music_disc_bftp",
            () -> SoundEvent.createVariableRangeEvent(
                    ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MOD_ID, "music_disc_bftp")));

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}


