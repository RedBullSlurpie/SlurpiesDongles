package com.rbs.slurpiesdongles.food;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood {
    public FoodBase(int amount, float saturation, boolean isWolfFood, String name, Item.Properties builder) {
        super(amount, saturation, isWolfFood, builder);

        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
    }
}
