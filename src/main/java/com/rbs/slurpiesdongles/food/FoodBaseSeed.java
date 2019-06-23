package com.rbs.slurpiesdongles.food;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.block.Block;
import net.minecraft.command.impl.SeedCommand;
import net.minecraft.item.*;
import net.minecraft.util.FoodStats;
import net.minecraft.util.IItemProvider;

public class FoodBaseSeed extends BlockItem {

    public FoodBaseSeed(Block p_i50041_1_, Properties p_i50041_2_, String name) {
        super(p_i50041_1_, p_i50041_2_);

        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
        //new Item.Properties().group(Reference.tabSlurpiesDongles);
    }
    @Override
    public String getTranslationKey() {
        return this.getDefaultTranslationKey();
    }

   }
