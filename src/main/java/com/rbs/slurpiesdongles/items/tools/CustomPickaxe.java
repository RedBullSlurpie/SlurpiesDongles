package com.rbs.slurpiesdongles.items.tools;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.helpers.HammerHelper;
import com.rbs.slurpiesdongles.helpers.HarvestLevelHelper;
import com.rbs.slurpiesdongles.init.ModBlocks;
import com.rbs.slurpiesdongles.init.ModTools;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.*;
import net.minecraft.world.World;

import java.util.Random;
import java.util.Set;

public class CustomPickaxe extends PickaxeItem {
    public CustomPickaxe(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder, HarvestLevelHelper resource) {
        super(tier, attackDamageIn, attackSpeedIn, builder);

        this.setRegistryName(Reference.MODID, name);
        ModTools.TOOLS.add(this);
    }
}
