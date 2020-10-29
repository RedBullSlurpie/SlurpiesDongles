package com.rbs.slurpiesdongles.items.tools.tiers.ruby;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RubyAxe extends AxeItem {
    public RubyAxe(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder , String name) {
        super(tier, attackDamageIn, attackSpeedIn, builder);

        this.setRegistryName(Reference.MODID, name);
    }
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
        return repair.getItem() == ModItems.ruby;
    }
}
