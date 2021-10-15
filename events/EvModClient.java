package com.johleb.originmobmod.events;

import com.johleb.originmobmod.OriginMM;
import com.johleb.originmobmod.entity.render.RrAngel;
import com.johleb.originmobmod.entity.type.InitEntityTypes;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = OriginMM.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class EvModClient {
	
	@SubscribeEvent
	public static void clientSetup(FMLClientSetupEvent event) {
		EntityRenderers.register(InitEntityTypes.ANGEL.get(), RrAngel::new);
	}
	
}

