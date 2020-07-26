package com.kovuko_.mintleaf.util;

import com.kovuko_.mintleaf.Start;
import com.kovuko_.mintleaf.items.ItemBase;
import com.kovuko_.mintleaf.items.ItemDrink;
import com.kovuko_.mintleaf.items.ItemSword;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Start.MOD_ID);

    public static void Init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //ITEMS ONLY
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", ItemSword::new);
    public static final RegistryObject<Item> CUM_CHALICE = ITEMS.register("cum_chalice", ItemDrink::new);
}
