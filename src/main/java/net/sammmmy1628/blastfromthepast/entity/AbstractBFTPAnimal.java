package net.sammmmy1628.blastfromthepast.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.JukeboxBlockEntity;
import net.sammmmy1628.blastfromthepast.network.BFTPNetwork;
import net.sammmmy1628.blastfromthepast.network.UpdateAnimalJukeboxPacket;

public abstract class AbstractBFTPAnimal extends AbstractAnimatableAnimal
{
	public static final EntityDataAccessor<Boolean> IS_JUKEBOX = SynchedEntityData.defineId(AbstractBFTPAnimal.class, EntityDataSerializers.BOOLEAN);
	public static final EntityDataAccessor<BlockPos> JUKEBOX_POS = SynchedEntityData.defineId(AbstractBFTPAnimal.class, EntityDataSerializers.BLOCK_POS);

	public AbstractBFTPAnimal(EntityType<? extends TamableAnimal> pEntityType, Level pLevel) 
	{
		super(pEntityType, pLevel);
	}
	
    @Override
    protected void defineSynchedData()
    {
    	super.defineSynchedData();
    	this.entityData.define(IS_JUKEBOX, false);
    	this.entityData.define(JUKEBOX_POS, BlockPos.ZERO);
    }
    
    @Override
    public void tick() 
    {
    	super.tick();
		if(!this.getJukeboxPos().equals(BlockPos.ZERO) && this.level.getBlockEntity(this.getJukeboxPos()) instanceof JukeboxBlockEntity jukebox)
		{
			this.onJukeboxPlay(jukebox);
		}
		else
		{
			this.setJukebox(false);
		}
    }
    
	@Override
	public void addAdditionalSaveData(CompoundTag pCompound)
	{
		super.addAdditionalSaveData(pCompound);
		pCompound.putBoolean("isJukebox", this.isJukebox());
		pCompound.put("JukeboxPos", NbtUtils.writeBlockPos(this.getJukeboxPos()));
	}
	
	@Override
	public void readAdditionalSaveData(CompoundTag pCompound)
	{
		super.readAdditionalSaveData(pCompound);
		this.setJukebox(pCompound.getBoolean("isJukebox"));
		this.setJukeboxPos(NbtUtils.readBlockPos(pCompound.getCompound("JukeboxPos")));
	}
	
	public void onJukeboxPlay(JukeboxBlockEntity jukebox)
	{
		
	}
    
    @Override
    public void setRecordPlayingNearby(BlockPos pJukebox, boolean pPartyParrot) 
    {
    	BFTPNetwork.sendToServer(new UpdateAnimalJukeboxPacket(this.getUUID(), pJukebox));
    }
	
    public void setJukebox(boolean value)
    {
    	this.entityData.set(IS_JUKEBOX, value);
    }
    
    public boolean isJukebox()
    {
    	return this.entityData.get(IS_JUKEBOX);
    }
    
    public void setJukeboxPos(BlockPos value)
    {
    	this.entityData.set(JUKEBOX_POS, value);
    }
    
    public BlockPos getJukeboxPos()
    {
    	return this.entityData.get(JUKEBOX_POS);
    }
}
