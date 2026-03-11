package net.sammmmy1628.blastfromthepast.network;

import java.util.UUID;
import java.util.function.Supplier;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkEvent;
import net.sammmmy1628.blastfromthepast.entity.IAnimatable;
import net.sammmmy1628.blastfromthepast.misc.BFTPEntityDataSerializers;
import net.sammmmy1628.blastfromthepast.util.BFTPUtil;

public class UpdatePosArrayPacket 
{
	private final UUID entityUUID;
	private final int array;
	private final Vec3 pos;

	public UpdatePosArrayPacket(UUID uuid, Vec3 pos, int array) 
	{
		this.entityUUID = uuid;
		this.pos = pos;
		this.array = array;
	}

	public static UpdatePosArrayPacket read(FriendlyByteBuf buf)
	{
		return new UpdatePosArrayPacket(buf.readUUID(), BFTPEntityDataSerializers.readVec3(buf), buf.readInt());
	}

	public void write(FriendlyByteBuf buf)
	{
		buf.writeUUID(this.entityUUID);
		BFTPEntityDataSerializers.writeVec3(buf, this.pos);
		buf.writeInt(this.array);
	}

	public static boolean handle(UpdatePosArrayPacket message, Supplier<NetworkEvent.Context> ctx)
	{
		ctx.get().enqueueWork(() ->
		{
			if(ctx.get().getDirection().getReceptionSide().isServer())
			{
				Entity entity = BFTPUtil.getEntityByUUID(ctx.get().getSender().level, message.entityUUID);
				if(entity instanceof IAnimatable mob) 
				{
					mob.getPosArray()[message.array] = message.pos;
				}
			}
			else
			{
				BFTPUtil.getClientLevel(t -> 
				{
					Entity entity = BFTPUtil.getEntityByUUID(t, message.entityUUID);
					if(entity instanceof IAnimatable mob) 
					{
						mob.getPosArray()[message.array] = message.pos;
					}
				});
			}
		});
		ctx.get().setPacketHandled(true);
		return true;
	}
}
