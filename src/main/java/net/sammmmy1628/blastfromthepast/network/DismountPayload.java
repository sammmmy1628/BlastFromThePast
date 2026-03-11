package net.sammmmy1628.blastfromthepast.network;

import java.util.function.Supplier;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.NetworkEvent;
import net.sammmmy1628.blastfromthepast.entity.living.SnowdoEntity;

public class DismountPayload {
    private final int entityId;

    public DismountPayload(int entityId) {
        this.entityId = entityId;
    }

    public DismountPayload(FriendlyByteBuf buffer) {
        this.entityId = buffer.readInt();
    }

    public void toBytes(FriendlyByteBuf buffer) {
        buffer.writeInt(entityId);
    }

    public static void handle(DismountPayload msg, Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer player = ctx.get().getSender();
            if (player != null) {
                Entity entity = player.level().getEntity(msg.entityId);

                if (entity instanceof SnowdoEntity snowdo) {
                    if (snowdo.getVehicle() == player) {
                        snowdo.stopRiding();
                        snowdo.rideCooldown = 20;
                    }
                }
            }
        });
        ctx.get().setPacketHandled(true);
    }
}