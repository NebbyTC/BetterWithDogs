package com.Nikodemis_.fluffy;

import com.Nikodemis_.fluffy.client.render.GoldenRetreiverRender;
import com.Nikodemis_.fluffy.entities.BorderColieEntity;
import com.Nikodemis_.fluffy.entities.GoldenRetreiverEntity;
import com.Nikodemis_.fluffy.entities.ShihTzuEntinty;
import com.Nikodemis_.fluffy.init.ModEntityTypes;
import com.Nikodemis_.fluffy.util.RegistryHandler;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("fluffy")
public class Fluffy {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "fluffy";

    public Fluffy() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLClientSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            // Tu dodawać nowe psy
            GlobalEntityTypeAttributes.put(ModEntityTypes.SHIHTZU.get(), ShihTzuEntinty.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.BORDERCOLIE.get(), BorderColieEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.GOLDENRETREIVER.get(), GoldenRetreiverEntity.setCustomAttributes().create());
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    public static final ItemGroup TAB = new ItemGroup("dogcrafttab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.PROBU.get());
        }
    };
}
