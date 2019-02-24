package com.rbs.slurpiesdongles.items.tools;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModTools;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class CustomHoe extends ItemHoe {

    public CustomHoe(String name, IItemTier tier, int attackDamageIn, Item.Properties builder) {
        super(tier, attackDamageIn, builder);

        this.setRegistryName(Reference.MODID, name);
        ModTools.TOOLS.add(this);
    }
}
