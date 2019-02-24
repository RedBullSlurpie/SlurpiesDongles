package com.rbs.slurpiesdongles.food;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class FoodBaseDrink extends ItemFood {
    public FoodBaseDrink(int amount, float saturation, boolean isWolfFood, String name, Item.Properties builder) {
        super(amount, saturation, isWolfFood, builder);

        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
    }
    public EnumAction getUseAction(ItemStack Stack) {

        return EnumAction.DRINK;
    }
}
