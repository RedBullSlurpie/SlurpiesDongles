package com.rbs.slurpiesdongles.events;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class GrassDropsEvent {

    private static ArrayList<ItemStack> stacks;

    @SubscribeEvent
    public static void onGrassBroken(BlockEvent.BreakEvent event)
    {

        stacks = new ArrayList<ItemStack>();
        stacks.add(new ItemStack(ModFood.cabbage));
        stacks.add(new ItemStack(ModFood.corn_seed));
        stacks.add(new ItemStack(ModFood.lemon));
        stacks.add(new ItemStack(ModFood.orange));
        stacks.add(new ItemStack(ModFood.strawberry_seed));
        stacks.add(new ItemStack(ModFood.tomato));

        if (event.getState().getBlock() == Blocks.GRASS)
        {
            if (Math.random() < 0.125) {

                if (event.getPlayer().getHeldItemMainhand().getItem() != Items.SHEARS) {
                    event.getWorld().setBlockState(event.getPos(), Blocks.AIR.getDefaultState(), 2);
                }
            }
        }
    }

    /*private static ResourceLocation grass = new ResourceLocation("minecraft", "blocks/grass");

    @SubscribeEvent
    public static void onLootLoad(LootTableLoadEvent event)
    {

        if (event.getName().equals(grass))
        {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(Reference.MODID, "blocks/grass"))).build());
        }
    }*/

}
