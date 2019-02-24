package com.rbs.slurpiesdongles.blocks;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModBlocks;
import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class CustomGlowstone extends Block {
    public CustomGlowstone(String name, Properties builder) {
        super(builder);

        this.setRegistryName(Reference.MODID, name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this, new Item.Properties().group(Reference.tabSlurpiesDongles)).setRegistryName(this.getRegistryName()));
    }
    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        return MathHelper.clamp(this.quantityDropped(random) + random.nextInt(fortune + 1), 1, 4);
    }

    public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(3);
    }

    {


    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this == ModBlocks.BLUE_GLOWSTONE ? ModItems.BLUE_GLOWSTONE_DUST : (this ==
                ModBlocks.GRAY_GLOWSTONE ? ModItems.GRAY_GLOWSTONE_DUST : (this ==
                ModBlocks.GREEN_GLOWSTONE ? ModItems.GREEN_GLOWSTONE_DUST : (this ==
                ModBlocks.ORANGE_GLOWSTONE ? ModItems.ORANGE_GLOWSTONE_DUST : (this ==
                ModBlocks.PINK_GLOWSTONE ? ModItems.PINK_GLOWSTONE_DUST: (this ==
                ModBlocks.PURPLE_GLOWSTONE ? ModItems.PURPLE_GLOWSTONE_DUST : (this ==
                ModBlocks.RED_GLOWSTONE ? ModItems.RED_GLOWSTONE_DUST : Item.getItemFromBlock(this)))))));
    }




}
