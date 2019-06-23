package com.rbs.slurpiesdongles.blocks;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.helpers.HarvestLevelHelper;
import com.rbs.slurpiesdongles.init.ModBlocks;
import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeBlockState;


public class RubyOre extends Block {

    public final HarvestLevelHelper resource;

    public RubyOre(Block.Properties builder, String name, HarvestLevelHelper resource) {
        super(builder);

        this.resource = resource;
        this.setRegistryName(Reference.MODID, name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new BlockItem(this, new Item.Properties().group(Reference.tabSlurpiesDongles)).setRegistryName(this.getRegistryName()));
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return resource.harvestLevel;
    }

    public IItemProvider getItemDropped(IForgeBlockState state, World worldIn, BlockPos pos, int fortune) {
        if (this == ModBlocks.RUBY_ORE) {
            return ModItems.RUBY;
        }
        return this;
    }

}
