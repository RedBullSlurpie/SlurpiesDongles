package com.rbs.slurpiesdongles.items.tools;

import com.google.common.collect.Sets;
import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModTools;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

import java.util.Set;

public class CustomPickaxe extends ItemPickaxe {
    public CustomPickaxe(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);

        this.setRegistryName(Reference.MODID, name);
        ModTools.TOOLS.add(this);
    }

}
