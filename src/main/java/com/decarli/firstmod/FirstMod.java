package com.decarli.firstmod;

import com.example.examplemod.ExampleMod;
import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(FirstMod.MODID2)
public class FirstMod {
    public static final String MODID2 = "firstmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public FirstMod() {
        LOGGER.info("Meu primeiro Mod Carregado");
    }
}
