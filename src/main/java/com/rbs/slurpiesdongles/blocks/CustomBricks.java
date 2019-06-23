package com.rbs.slurpiesdongles.blocks;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModBlocks;
import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class CustomBricks extends Block {
    public CustomBricks(String name, Properties builder) {
        super(builder);

        this.setRegistryName(Reference.MODID, name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new BlockItem(this, new Item.Properties().group(Reference.tabSlurpiesDongles)).setRegistryName(this.getRegistryName()));
    }
}
