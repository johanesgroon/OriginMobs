package com.johleb.originmobmod.events;

import com.johleb.originmobmod.OriginMM;
import com.johleb.originmobmod.entity.type.InitEntityTypes;
import com.johleb.originmobmod.entity.type.TyAngel;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = OriginMM.MOD_ID, bus = Bus.MOD)
public class EvModGeneral {
	
	@SubscribeEvent
	public static void buildAttributes(EntityAttributeCreationEvent event) {
		event.put(InitEntityTypes.ANGEL.get(), TyAngel.createAttributes().build());
	}
}