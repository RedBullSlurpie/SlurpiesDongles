package com.rbs.slurpiesdongles.events;

import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

//@Mod.EventBusSubscriber
public class GrassDrops {

    @SubscribeEvent
    public static void onBlockDestroyed(BlockEvent.HarvestDropsEvent event) {
        Block block = event.getState().getBlock();

        //Item item = null;

        // if (event.getHarvester().equals("player")) {
        //if (event.getState().getBlock() == Blocks.GRASS) {
        if (event.getHarvester() != null) {

            if (block == Blocks.GRASS) {
                //if (event.getState().getBlock() == Blocks.GRASS && event.getWorld().getRandom().nextInt(450) < 25) {

                event.getDrops().add(new ItemStack(ModFood.STRAWBERRY_SEEDS, 1));

            }

        }
    }
}




