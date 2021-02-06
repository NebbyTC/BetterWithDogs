package com.Nikodemis_.fluffy.init;

import com.Nikodemis_.fluffy.entities.BorderColieEntity;
import com.Nikodemis_.fluffy.entities.GoldenRetreiverEntity;
import com.Nikodemis_.fluffy.entities.ShihTzuEntinty;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import com.Nikodemis_.fluffy.Fluffy;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Fluffy.MOD_ID);

    // Entity Types
    // Dla każdego nowego moba taką metodę trzeba zrobić

    public static final RegistryObject<EntityType<ShihTzuEntinty>> SHIHTZU = ENTITY_TYPES.register("shihtzu", ()->EntityType.Builder.create(ShihTzuEntinty::new, EntityClassification.CREATURE)
            .size(0.3f, 0.6f)
            .build(new ResourceLocation(Fluffy.MOD_ID, "shihtzu").toString()));

    public static final RegistryObject<EntityType<BorderColieEntity>> BORDERCOLIE = ENTITY_TYPES.register("bordercolie", ()->EntityType.Builder.create(BorderColieEntity::new, EntityClassification.CREATURE)
            .size(0.3f, 0.6f)
            .build(new ResourceLocation(Fluffy.MOD_ID, "bordercolie").toString()));

    public static final RegistryObject<EntityType<GoldenRetreiverEntity>> GOLDENRETREIVER = ENTITY_TYPES.register("goldenretreiver", ()->EntityType.Builder.create(GoldenRetreiverEntity::new, EntityClassification.CREATURE)
            .size(0.3f, 0.6f)
            .build(new ResourceLocation(Fluffy.MOD_ID, "goldenretreiver").toString()));
}
