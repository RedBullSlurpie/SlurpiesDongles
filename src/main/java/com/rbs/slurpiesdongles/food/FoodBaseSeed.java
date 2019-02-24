package com.rbs.slurpiesdongles.food;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeedFood;

public class FoodBaseSeed extends ItemSeedFood {

    public FoodBaseSeed(int amount, float saturation, Block crops, String name, Item.Properties builder) {
        super(amount, saturation, crops, builder);

        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
    }
}
