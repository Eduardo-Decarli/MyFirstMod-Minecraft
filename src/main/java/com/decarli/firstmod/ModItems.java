package com.decarli.firstmod;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.decarli.firstmod.FirstMod.MOD_ID;

public class ModItems {

    // Registrador para Itens
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    // Cria um item simples, como uma maçã dourada personalizada
    public static final RegistryObject<Item> GOLDEN_APPLE = ITEMS.register("golden_apple", () -> new Item(new Item.Properties()));

    // Registra o item no EventBus
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
