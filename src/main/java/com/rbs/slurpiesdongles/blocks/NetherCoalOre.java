package com.rbs.slurpiesdongles.blocks;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.handlers.HarvestLevelHelper;
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
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class NetherCoalOre extends Block {

    public final HarvestLevelHelper resource;

    public NetherCoalOre(Block.Properties builder, String name, HarvestLevelHelper resource) {
        super(builder);

        this.resource = resource;
        this.setRegistryName(Reference.MODID, name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this, new Item.Properties().group(Reference.tabSlurpiesDongles)).setRegistryName(this.getRegistryName()));
    }

    @Override
    public ToolType getHarvestTool(IBlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    public int getHarvestLevel(IBlockState state) {
        return resource.harvestLevel;
    }

    public IItemProvider getItemDropped(IBlockState state, World worldIn, BlockPos pos, int fortune) {
        if (this == Blocks.COAL_ORE) {
            return Items.COAL;
        }
        return this;
    }

    public int getItemsToDropCount(IBlockState state, int fortune, World worldIn, BlockPos pos, Random random) {
        if (fortune > 0 && this != this.getItemDropped(this.getStateContainer().getValidStates().iterator().next(), worldIn, pos, fortune)) {
            int i = random.nextInt(fortune + 2) - 1;
            if (i < 0) {
                i = 0;
            }

            return this.quantityDropped(state, random) * (i + 1);
        } else {
            return this.quantityDropped(state, random);
        }
    }

    public void dropBlockAsItemWithChance(IBlockState state, World worldIn, BlockPos pos, float chancePerItem, int fortune) {
        super.dropBlockAsItemWithChance(state, worldIn, pos, chancePerItem, fortune);
    }

    @Override
    public int getExpDrop(IBlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune) {
        World world = reader instanceof World ? (World) reader : null;
        if (world == null || this.getItemDropped(state, world, pos, fortune) != this) {
            int i = 0;
            if (this == Blocks.COAL_ORE) {
                i = MathHelper.nextInt(RANDOM, 3, 7);

                return i;
            }
            return 0;

        }
        return 0;
    }
}
