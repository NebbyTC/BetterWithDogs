package com.Nikodemis_.fluffy.util;

import com.Nikodemis_.fluffy.Fluffy;
import com.Nikodemis_.fluffy.blocks.BlockItemBase;
import com.Nikodemis_.fluffy.blocks.MtCrystalBlock;
import com.Nikodemis_.fluffy.init.ModEntityTypes;
import com.Nikodemis_.fluffy.items.ItemBase;
import com.sun.jna.platform.win32.WinUser;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Fluffy.MOD_ID);
    public static  final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Fluffy.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Itemki tutaj
    public static final RegistryObject<Item> FLUF = ITEMS.register( "fluf", ItemBase::new);
    public static final RegistryObject<Item> PROBU = ITEMS.register( "probu", ItemBase::new);
    public static final RegistryObject<Item> KGORSKI = ITEMS.register( "kgorski", ItemBase::new);
    public static final RegistryObject<Item> KG_LENS = ITEMS.register( "kg_lens", ItemBase::new);
    public static final RegistryObject<Item> KAWMIESA = ITEMS.register( "kawmiesa", ItemBase::new);
    public static final RegistryObject<Item> SLICEDMIESO = ITEMS.register( "slicedmieso", ItemBase::new);

    // Bloki tutaj
    public static final RegistryObject<Block> MT_CRYSTAL_BLOCK = BLOCKS.register("mt_crystal_block", MtCrystalBlock::new);


    // Itemki bloków tutaj
    public static final RegistryObject<Item>  MT_CRYSTAL_BLOCK_ITEM = ITEMS.register("mt_crystal_block",() -> new BlockItemBase(MT_CRYSTAL_BLOCK.get()));
}
