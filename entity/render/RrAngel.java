package com.johleb.originmobmod.entity.render;

import com.johleb.originmobmod.OriginMM;
import com.johleb.originmobmod.entity.models.MdAngel;
import com.johleb.originmobmod.entity.type.TyAngel;
import com.mojang.blaze3d.vertex.PoseStack;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class RrAngel extends HumanoidMobRenderer<TyAngel, MdAngel>{
	protected static final ResourceLocation TEXTURE = new ResourceLocation(OriginMM.MOD_ID,
			"textures/entity/grid.png");
	
	public RrAngel(Context renderManagerIn, MdAngel model, float shadow) {
		super(renderManagerIn, model, shadow);
		
	}
	
	public RrAngel(Context renderManagerIn) {
		super(renderManagerIn, new MdAngel(renderManagerIn
				.bakeLayer(ModelLayers.ZOMBIE)), (float) 0.75);
	}

	protected void scale(RrAngel angelIn, PoseStack poseIn, float floatIn) {
		poseIn.scale(0.9375F, 0.9375F, 0.9375F);
	   }

	@Override
	public ResourceLocation getTextureLocation(TyAngel p_114482_) {
		return TEXTURE;
	}

}