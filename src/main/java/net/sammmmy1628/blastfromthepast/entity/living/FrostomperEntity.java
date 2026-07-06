package net.sammmmy1628.blastfromthepast.entity.living;

import net.minecraft.Util;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FollowParentGoal;
import net.minecraft.world.entity.ai.goal.PanicGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.JukeboxBlockEntity;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.sammmmy1628.blastfromthepast.entity.AbstractAnimatableAnimal;
import net.sammmmy1628.blastfromthepast.entity.AbstractBFTPAnimal;
import net.sammmmy1628.blastfromthepast.entity.BFTPEntities;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.FrostomperChargeGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.FrostomperCrushGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.FrostomperFlingGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.FrostomperStompGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.LookAtTargetGoal;
import net.sammmmy1628.blastfromthepast.entity.ai.goal.MoveToTargetGoal;
import net.sammmmy1628.blastfromthepast.misc.AnimationEntries;
import net.sammmmy1628.blastfromthepast.misc.SmoothAnimationState;
import net.sammmmy1628.blastfromthepast.util.BFTPUtil;

public class FrostomperEntity extends AbstractBFTPAnimal
{
	public final SmoothAnimationState idleAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState walkAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState stompAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState stomp2AnimationState = new SmoothAnimationState();
	public final SmoothAnimationState flingAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState chargeAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState crushAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState danceAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState earsAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState tailAnimationState = new SmoothAnimationState();
	public final SmoothAnimationState trumpetAnimationState = new SmoothAnimationState();
	
	public AmbientType ambientType;
	public int ambientTick;
	
	public final AnimationEntries babyEntries = new AnimationEntries();
	
	public FrostomperEntity(EntityType<? extends AbstractAnimatableAnimal> pEntityType, Level pLevel) 
	{
		super(pEntityType, pLevel);
		this.babyEntries.addWalkEntry(this.walkAnimationState, 1.5F);
		this.babyEntries.addExtraEntry(this.tailAnimationState);
		this.babyEntries.addExtraEntry(this.trumpetAnimationState);
		this.babyEntries.addExtraEntry(this.danceAnimationState);
		
		this.animationEntries.addWalkEntry(this.walkAnimationState, 2.5F);
		this.animationEntries.addExtraEntry(this.stompAnimationState);
		this.animationEntries.addExtraEntry(this.stomp2AnimationState);
		this.animationEntries.addExtraEntry(this.flingAnimationState);
		this.animationEntries.addExtraEntry(this.chargeAnimationState);
		this.animationEntries.addExtraEntry(this.crushAnimationState);
		this.animationEntries.addExtraEntry(this.danceAnimationState);
		this.animationEntries.addExtraEntry(this.earsAnimationState);
		this.animationEntries.addExtraEntry(this.tailAnimationState);
		this.animationEntries.addExtraEntry(this.trumpetAnimationState);
	}
	
    public static AttributeSupplier.Builder createAttributes()
    {
        return Mob.createMobAttributes()
    			.add(Attributes.MAX_HEALTH, 300.0F)
    			.add(Attributes.KNOCKBACK_RESISTANCE, 1.0F)
    			.add(Attributes.ATTACK_DAMAGE, 6.0F)
    			.add(Attributes.MOVEMENT_SPEED, 0.15F)
    			.add(Attributes.FOLLOW_RANGE, 40.0F);
    }
    
	@Override
	public void playAmbientSound()
	{
		super.playAmbientSound();
		if(!this.isInWater() && !this.isTargetValid() && !this.isJukebox())
		{
			AmbientType type = AmbientType.getRandom(this.random);
			this.ambientType = type;
			this.ambientTick = type.tick;
		}
	}
	
    @Override
    protected void registerGoals() 
    {
    	super.registerGoals();
    	this.goalSelector.addGoal(0, new FrostomperStompGoal(this));
    	this.goalSelector.addGoal(0, new FrostomperFlingGoal(this));
    	this.goalSelector.addGoal(0, new FrostomperChargeGoal(this));
    	this.goalSelector.addGoal(0, new FrostomperCrushGoal(this));
        this.goalSelector.addGoal(0, new FollowParentGoal(this, 1.0D)
        {
    		@Override
    		public boolean canUse() 
    		{
    			return super.canUse() && !FrostomperEntity.this.isJukebox();
    		}
    	});
        this.goalSelector.addGoal(0, new PanicGoal(this, 1.2D)
    	{
    		@Override
    		public boolean canUse() 
    		{
    			return super.canUse() && FrostomperEntity.this.isBaby();
    		}
    	});
    	this.goalSelector.addGoal(0, new MoveToTargetGoal<>(this)
    	{
    		@Override
    		public boolean canUse() 
    		{
    			return super.canUse() && !FrostomperEntity.this.isBaby();
    		}
    	});
    	this.goalSelector.addGoal(0, new LookAtTargetGoal<>(this)
    	{
    		@Override
    		public boolean canUse() 
    		{
    			return super.canUse() && !FrostomperEntity.this.isBaby();
    		}
    	});
    	this.targetSelector.addGoal(0, new HurtByTargetGoal(this)
    	{
    		@Override
    		public boolean canUse() 
    		{
    			return super.canUse() && !FrostomperEntity.this.isBaby();
    		}
    	}.setAlertOthers());
    }
    
    @Override
    public void tick()
    {
    	super.tick();
    	if(this.level.isClientSide)
    	{
    		this.idleAnimationState.updateWhen(this.getAnimationState() == 0 && this.ambientType == null && !this.isJukebox(), this.tickCount);
    		this.walkAnimationState.updateWhen(true, this.tickCount);
    		this.stompAnimationState.updateWhen(this.isAnimationPlaying(1), this.tickCount);
    		this.stomp2AnimationState.updateWhen(this.isAnimationPlaying(2), this.tickCount);
    		this.flingAnimationState.updateWhen(this.isAnimationPlaying(3), this.tickCount);
    		this.chargeAnimationState.updateWhen(this.isAnimationPlaying(4), this.tickCount);
    		this.crushAnimationState.updateWhen(this.isAnimationPlaying(5), this.tickCount);
    		this.danceAnimationState.updateWhen(this.isJukebox() && !this.isTargetValid(), this.tickCount);
    		this.earsAnimationState.updateWhen(this.getAnimationState() == 0 && this.ambientType == AmbientType.EARS && !this.walkAnimation.isMoving(), this.tickCount);
    		this.tailAnimationState.updateWhen(this.getAnimationState() == 0 && this.ambientType == AmbientType.TAIL && !this.walkAnimation.isMoving(), this.tickCount);
    		this.trumpetAnimationState.updateWhen(this.getAnimationState() == 0 && this.ambientType == AmbientType.TRUMPET && !this.walkAnimation.isMoving(), this.tickCount);
    	}
		if(this.ambientType != null)
		{
			this.ambientTick--;
			if(this.ambientTick <= 0)
			{
				this.ambientType = null;
				this.ambientTick = 0;
			}
		}
		if(this.isAnimationPlaying(4))
		{
			this.yBodyRot = this.yHeadRot;
		}
    }
    
    @Override
    public void onJukeboxPlay(JukeboxBlockEntity jukebox)
    {
    	if(!this.level.isClientSide)
    	{
        	this.setJukebox(true);
        	this.setStopMoveTick(20);
        	this.getNavigation().stop();
    	}
    }
    
    @Override
    protected void updateWalkAnimation(float pPartialTick) 
    {
        float f = Math.min(pPartialTick * 8.0F, 1.0F);
        this.walkAnimation.update(f, 0.4F);
    }

	@Override
	public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) 
	{
		if(!this.isBaby())
		{
			FrostomperEntity baby = BFTPEntities.FROSTOMPER.get().create(pLevel);
			baby.getAttribute(Attributes.MAX_HEALTH).setBaseValue(30.0F);
			baby.setHealth(baby.getMaxHealth());
			return baby;
		}
		return null;
	}
	
	@Override
	public void finalizeSpawnChildFromBreeding(ServerLevel pLevel, Animal pAnimal, AgeableMob pBaby) 
	{
		pBaby.getAttribute(Attributes.MAX_HEALTH).setBaseValue(30.0F);
		pBaby.setHealth(pBaby.getMaxHealth());
		super.finalizeSpawnChildFromBreeding(pLevel, pAnimal, pBaby);
	}
	
	@Override
	public boolean isAlliedTo(Entity pEntity) 
	{
		return super.isAlliedTo(pEntity) || pEntity instanceof FrostomperEntity;
	}
	
	@Override
	public float maxMoveTurnY()
	{
		if(!this.isBaby())
		{
			return 60.0F;
		}
		return super.maxMoveTurnY();
	}
	
	@Override
	public float maxBodyTurnY()
	{
		if(!this.isBaby())
		{
			return 60.0F;
		}
		return super.maxBodyTurnY();
	}
	
	public int getDirectionalStompAnimation(LivingEntity target)
	{
		double dx = target.getX() - this.getX();
		double dz = target.getZ() - this.getZ();
		float yaw = (float) Math.toRadians(this.getYRot());
		double localSide = Math.cos(yaw) * dx + Math.sin(yaw) * dz;
		return localSide >= 0.0D ? 2 : 1;
	}

	public Vec3 getLegPos(int animationState)
	{
		double left = 0.0D;
		double forwards = 0.0D;
		if(animationState == 1)
		{
			left = -0.5D;
			forwards = 1.0D;
		}
		else if(animationState == 2)
		{
			left = 0.5D;
			forwards = 1.0D;
		}
		else if(animationState == 5)
		{
			forwards = 1.0D;
		}
		return BFTPUtil.getLookPos(new Vec2(0.0F, this.getYRot()), this.position(), left, 0.0D, forwards );
	}
	
	public static enum AmbientType
	{
		EARS(21),
		TAIL(25),
		TRUMPET(30);
		
		int tick;
		
		private AmbientType(int tick) 
		{
			this.tick = tick;
		}
		
		public static AmbientType getRandom(RandomSource random)
		{
			return Util.getRandom(AmbientType.values(), random);
		}
	}
}
