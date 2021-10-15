package com.johleb.originmobmod;

import com.johleb.originmobmod.entity.type.InitEntityTypes;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmlserverevents.FMLServerStartingEvent;
@Mod("orgmob1206")
public class OriginMM
{
	public static final String MOD_ID = "orgmob1206";
	public static OriginMM MOD_INSTANCE;
	
    public OriginMM() 
    {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        InitEntityTypes.ENTITY_TYPES.register(modEventBus);
        MOD_INSTANCE = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    	//DeferredWorkQueue (I DONT KNOW HOW TO UPLOAD MODELS)
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) { }
}
