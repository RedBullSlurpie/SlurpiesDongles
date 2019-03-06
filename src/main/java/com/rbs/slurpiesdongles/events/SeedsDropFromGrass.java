package com.rbs.slurpiesdongles.events;

import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class SeedsDropFromGrass {

    public static void getSeedDrops() {
        MinecraftForge.addGrassSeed(new ItemStack(ModFood.CABBAGE), 3);
        MinecraftForge.addGrassSeed(new ItemStack(ModFood.CORN_SEED), 4);
        MinecraftForge.addGrassSeed(new ItemStack(ModFood.LEMON), 3);
        MinecraftForge.addGrassSeed(new ItemStack(ModFood.ORANGE), 3);
        MinecraftForge.addGrassSeed(new ItemStack(ModFood.STRAWBERRY_SEEDS), 4);
        MinecraftForge.addGrassSeed(new ItemStack(ModFood.TOMATO), 3);
    }
}
