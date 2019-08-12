package com.rbs.slurpiesdongles.events;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = Reference.MODID)
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
                    event.getWorld().addEntity(new ItemEntity((World) event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), stacks.get((int)((Math.random()*6)+1))));
                }
            }
        }
    }

}
