package com.decarli.firstmod;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(FirstMod.MOD_ID)
public class FirstMod {
    public static final String MOD_ID = "firstmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public FirstMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        ModItems.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Configuração comum para o mod '{}'", MOD_ID);
    }

    @SubscribeEvent
    public void onBlockBrean(BlockEvent.BreakEvent event) {
        LOGGER.info("O jogador {} quebrou o bloco em {}", event.getPlayer().getName(), event.getPos());
    }
}
