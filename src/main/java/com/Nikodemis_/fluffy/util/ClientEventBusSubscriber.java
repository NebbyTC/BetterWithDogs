package com.Nikodemis_.fluffy.util;

import com.Nikodemis_.fluffy.Fluffy;
import com.Nikodemis_.fluffy.client.render.BorderColieRender;
import com.Nikodemis_.fluffy.client.render.GoldenRetreiverRender;
import com.Nikodemis_.fluffy.client.render.ShihTzuRender;
import com.Nikodemis_.fluffy.entities.BorderColieEntity;
import com.Nikodemis_.fluffy.init.ModEntityTypes;
import com.google.common.eventbus.Subscribe;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Fluffy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    // Każdego nowego psa trzeba tu wpisać ( do tej metody )
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SHIHTZU.get(), ShihTzuRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BORDERCOLIE.get(), BorderColieRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOLDENRETREIVER.get(), GoldenRetreiverRender::new);
    }
}
