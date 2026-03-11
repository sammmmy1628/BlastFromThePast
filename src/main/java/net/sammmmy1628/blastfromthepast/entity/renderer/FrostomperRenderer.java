package net.sammmmy1628.blastfromthepast.entity.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sammmmy1628.blastfromthepast.BlastFromThePast;
import net.sammmmy1628.blastfromthepast.entity.living.FrostomperEntity;
import net.sammmmy1628.blastfromthepast.entity.model.FrostomperModel;

public class FrostomperRenderer extends MobRenderer<FrostomperEntity, FrostomperModel>
{
	public FrostomperRenderer(Context pContext)
	{
		super(pContext, new FrostomperModel(pContext.bakeLayer(FrostomperModel.LAYER_LOCATION)), 0.5F);
	}

	@Override
	public ResourceLocation getTextureLocation(FrostomperEntity pEntity) 
	{
		return ResourceLocation.fromNamespaceAndPath(BlastFromThePast.MODID, "textures/entity/frostomper.png");
	}
}
