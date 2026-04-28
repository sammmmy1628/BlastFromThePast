package net.sammmmy1628.blastfromthepast.network;

import java.util.UUID;
import java.util.function.Supplier;

import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.Entity;
import net.minecraftforge.network.NetworkEvent;
import net.sammmmy1628.blastfromthepast.entity.AbstractBFTPAnimal;
import net.sammmmy1628.blastfromthepast.util.BFTPUtil;

public class UpdateAnimalJukeboxPacket 
{
	private final UUID entityUUID;
	private final BlockPos pos;

	public UpdateAnimalJukeboxPacket(UUID uuid, BlockPos pos) 
	{
		this.entityUUID = uuid;
		this.pos = pos;
	}

	public static UpdateAnimalJukeboxPacket read(FriendlyByteBuf buf)
	{
		return new UpdateAnimalJukeboxPacket(buf.readUUID(), buf.readBlockPos());
	}

	public void write(FriendlyByteBuf buf)
	{
		buf.writeUUID(this.entityUUID);
		buf.writeBlockPos(this.pos);
	}

	public static boolean handle(UpdateAnimalJukeboxPacket message, Supplier<NetworkEvent.Context> ctx)
	{
		ctx.get().enqueueWork(() ->
		{
			if(ctx.get().getDirection().getReceptionSide().isServer())
			{
				Entity entity = BFTPUtil.getEntityByUUID(ctx.get().getSender().level, message.entityUUID);
				if(entity instanceof AbstractBFTPAnimal dragon) 
				{
					dragon.setJukeboxPos(message.pos);
				}
			}
		});
		ctx.get().setPacketHandled(true);
		return true;
	}
}
