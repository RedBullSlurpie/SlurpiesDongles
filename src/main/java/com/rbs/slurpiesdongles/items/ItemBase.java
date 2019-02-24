package com.rbs.slurpiesdongles.items;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.inventory.Container;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item {
    public ItemBase(String name, Properties properties) {
        super(properties);

        this.setRegistryName(Reference.MODID, name);
        ModItems.ITEMS.add(this);
    }

}
