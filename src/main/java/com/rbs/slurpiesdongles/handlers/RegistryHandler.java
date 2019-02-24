package com.rbs.slurpiesdongles.handlers;

import com.rbs.slurpiesdongles.init.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

    @SubscribeEvent
    public static void onBlockregister(final RegistryEvent.Register<Block> blockRegistryEvent) {
        //Register a new block here
        blockRegistryEvent.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));

    }

    @SubscribeEvent
    public static void onItemRegister(final RegistryEvent.Register<Item> event) {
        //Register items here
        event.getRegistry().registerAll(ModArmor.ARMORS.toArray(new Item[0]));
        event.getRegistry().registerAll(ModFood.FOODS.toArray(new Item[0]));
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
        event.getRegistry().registerAll(ModTools.TOOLS.toArray(new Item[0]));

    }
}
