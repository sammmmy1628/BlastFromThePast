package net.sammmmy1628.blastfromthepast.network;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;

public class ModMessages {
    private static SimpleChannel INSTANCE;
    private static int packetId = 0;

    private static int id() {
        return packetId++;
    }

    public static void register() {
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(BlastFromThePast.MOD_ID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = net;

        net.messageBuilder(DismountPayload.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(buffer -> {
                    return new DismountPayload(buffer);
                })
                .encoder((msg, buffer) -> {
                    msg.toBytes(buffer);
                })
                .consumerMainThread(DismountPayload::handle)
                .add();

    }

    public static <MSG> void sendToServer(MSG message) {
        if (INSTANCE != null) {
            INSTANCE.sendToServer(message);
        }
    }
}