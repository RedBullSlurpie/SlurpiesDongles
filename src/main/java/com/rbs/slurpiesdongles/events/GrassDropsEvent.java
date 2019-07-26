package com.rbs.slurpiesdongles.events;

import com.rbs.slurpiesdongles.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class GrassDropsEvent {

    private static ResourceLocation grass = new ResourceLocation("minecraft", "blocks/grass");

    @SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent event)
    {

        if (event.getName().equals(grass))
        {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Reference.MODID, "blocks/grass"))).build());
        }
    }

}
