package com.rbs.slurpiesdongles.food;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.item.UseAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FoodBaseDrink extends Item {
    public FoodBaseDrink(String name, Item.Properties p_i50045_1_) {
        super(p_i50045_1_);

        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
    }
    public UseAction getUseAction(ItemStack Stack) {

        return UseAction.DRINK;
    }
}
