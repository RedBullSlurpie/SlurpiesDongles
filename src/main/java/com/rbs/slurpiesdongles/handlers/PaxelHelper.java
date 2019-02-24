package com.rbs.slurpiesdongles.handlers;

import net.minecraft.block.Block;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class PaxelHelper extends ItemTool {
    protected PaxelHelper(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn, Set<Block> effectiveBlocksIn, Item.Properties builder) {
        super(attackDamageIn, attackSpeedIn, tier , effectiveBlocksIn, builder);
    }
}
