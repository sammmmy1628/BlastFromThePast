package net.sammmmy1628.blastfromthepast.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.entity.custom.SnowdoEntity;
import net.sammmmy1628.blastfromthepast.network.DismountPayload;
import net.sammmmy1628.blastfromthepast.network.ModMessages;

@Mod.EventBusSubscriber(modid = BlastFromThePast.MOD_ID, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void onKeyInput(InputEvent.Key event) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null) return;

        if (mc.options.keyShift.consumeClick()) {
            if (!mc.player.getPassengers().isEmpty()) {
                if (mc.player.getFirstPassenger() instanceof SnowdoEntity snowdo) {
                    snowdo.stopRiding();
                    ModMessages.sendToServer(new DismountPayload(snowdo.getId()));
                }
            }
        }
    }
}