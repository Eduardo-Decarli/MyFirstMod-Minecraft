package com.decarli.firstmod;

import com.example.examplemod.ExampleMod;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;

@Mod(FirstMod.MODID2)
public class FirstMod {
    public static final String MODID2 = "firstmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public FirstMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus(); // Obtém o Event Bus do mod

        // Registra o método de configuração comum no Event Bus
        modEventBus.addListener(this::commonSetup);

        // Registra o método de configuração no Event Bus do cliente
        modEventBus.addListener(this::clientSetup);
    }

    // Método que será chamado no evento FMLCommonSetupEvent
    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Configuração comum para o mod '{}'", MOD_ID);
    }

    // Método que será chamado no evento FMLClientSetupEvent
    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("Configuração do cliente para o mod '{}'", MOD_ID);
    }

    // Este método irá ser chamado para inicializar o mod
    @SubscribeEvent
    public static void onModInitialization(FMLCommonSetupEvent event) {
        LOGGER.info("Inicializando o mod '{}'", MOD_ID);
    }
}
