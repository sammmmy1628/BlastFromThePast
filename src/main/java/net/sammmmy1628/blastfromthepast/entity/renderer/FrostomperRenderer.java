package net.sammmmy1628.blastfromthepast.entity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.entity.living.FrostomperEntity;
import net.sammmmy1628.blastfromthepast.entity.model.FrostomperModel;

public class FrostomperRenderer extends MobRenderer<FrostomperEntity, FrostomperModel>
{
	private final BabyFrostomperRenderer babyRenderer;
	
	public FrostomperRenderer(Context pContext)
	{
		super(pContext, new FrostomperModel(pContext.bakeLayer(FrostomperModel.LAYER_LOCATION)), 1.5F);
		this.babyRenderer = new BabyFrostomperRenderer(pContext);
	}
	
	@Override
	public void render(FrostomperEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) 
	{
		if(pEntity.isBaby())
		{
			this.babyRenderer.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
		}
		else
		{
			super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(FrostomperEntity pEntity) 
	{
		return ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "textures/entity/frostomper.png");
	}
}
