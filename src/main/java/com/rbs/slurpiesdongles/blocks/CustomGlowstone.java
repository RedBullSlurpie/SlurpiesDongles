package com.rbs.slurpiesdongles.blocks;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModBlocks;
import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class CustomGlowstone extends Block {
    public CustomGlowstone(String name, Properties builder) {
        super(builder);

        this.setRegistryName(Reference.MODID, name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this, new Item.Properties().group(Reference.tabSlurpiesDongles)).setRegistryName(this.getRegistryName()));
    }


    /*public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this == ModBlocks.BLUE_GLOWSTONE ? ModItems.BLUE_GLOWSTONE_DUST : (this ==
                ModBlocks.GRAY_GLOWSTONE ? ModItems.GRAY_GLOWSTONE_DUST : (this ==
                ModBlocks.GREEN_GLOWSTONE ? ModItems.GREEN_GLOWSTONE_DUST : (this ==
                ModBlocks.ORANGE_GLOWSTONE ? ModItems.ORANGE_GLOWSTONE_DUST : (this ==
                ModBlocks.PINK_GLOWSTONE ? ModItems.PINK_GLOWSTONE_DUST : (this ==
                ModBlocks.PURPLE_GLOWSTONE ? ModItems.PURPLE_GLOWSTONE_DUST : (this ==
                ModBlocks.RED_GLOWSTONE ? ModItems.RED_GLOWSTONE_DUST : Item.getItemFromBlock(this)))))));
    }*/

    public IItemProvider getItemDropped(IBlockState state, World worldIn, BlockPos pos, int fortune) {

        if (this == ModBlocks.BLUE_GLOWSTONE) {
            return ModItems.BLUE_GLOWSTONE_DUST;
    }
        if (this == ModBlocks.GRAY_GLOWSTONE) {
            return ModItems.GRAY_GLOWSTONE_DUST;
        }
        if (this == ModBlocks.GREEN_GLOWSTONE) {
            return ModItems.GREEN_GLOWSTONE_DUST;
        }
        if (this == ModBlocks.ORANGE_GLOWSTONE) {
            return ModItems.ORANGE_GLOWSTONE_DUST;
        }
        if (this == ModBlocks.PINK_GLOWSTONE) {
            return ModItems.PINK_GLOWSTONE_DUST;
        }
        if (this == ModBlocks.PURPLE_GLOWSTONE) {
            return ModItems.PURPLE_GLOWSTONE_DUST;
        }
        if (this == ModBlocks.RED_GLOWSTONE) {
            return ModItems.RED_GLOWSTONE_DUST;
        }
        return this;
    }

    public int getItemsToDropCount(IBlockState state, int fortune, World worldIn, BlockPos pos, Random random) {
        return MathHelper.clamp(this.quantityDropped(state, random) + random.nextInt(fortune + 1), 1, 4);
    }

    public int quantityDropped(IBlockState state, Random random) {
        return 2 + random.nextInt(3);
    }
}
