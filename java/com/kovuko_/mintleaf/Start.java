package com.kovuko_.mintleaf;

import com.kovuko_.mintleaf.util.BlockHandler;
import com.kovuko_.mintleaf.util.ItemHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mintleaf")
public class Start {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mintleaf";

    public Start() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ItemHandler.Init();
        BlockHandler.Init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }

    public static final ItemGroup TAB = new ItemGroup("MintLeaf") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemHandler.RUBY.get());
        }
    };
}
