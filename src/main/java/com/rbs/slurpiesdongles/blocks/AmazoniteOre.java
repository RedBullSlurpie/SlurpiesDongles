package com.rbs.slurpiesdongles.blocks;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.helpers.HarvestLevelHelper;
import com.rbs.slurpiesdongles.init.ModBlocks;
import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class AmazoniteOre extends Block {

    public final HarvestLevelHelper resource;

    public AmazoniteOre(Block.Properties builder, String name, HarvestLevelHelper resource) {
        super(builder);

        this.setRegistryName(Reference.MODID, name);

        this.resource = resource;
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

    public IItemProvider getItemDropped(BlockState state, World worldIn, BlockPos pos, int fortune) {
        if (this == ModBlocks.AMAZONITE_ORE) {
            return ModItems.AMAZONITE;
        }
        return this;
    }

    /*public int getItemsToDropCount(BlockState state, int fortune, World worldIn, BlockPos pos, Random random) {
        if (fortune > 0 && this != this.getItemDropped(this.getStateContainer().getValidStates().iterator().next(), worldIn, pos, fortune)) {
            int i = random.nextInt(fortune + 2) - 1;
            if (i < 0) {
                i = 0;
            }

            return this. (state, random) * (i + 1);
        } else {
            return this.quantityDropped(state, random);
        }
    }
    */
@Override
    public void dropXpOnBlockBreak(World worldIn, BlockPos pos, int amount) {
        if (!worldIn.isRemote && worldIn.getGameRules().getBoolean(GameRules.DO_TILE_DROPS) && !worldIn.restoringBlockSnapshots) { // do not drop items while restoring blockstates, prevents item dupe
            while (amount > 0) {
                int i = ExperienceOrbEntity.getXPSplit(amount);
                amount -= i;
                worldIn.addEntity(new ExperienceOrbEntity(worldIn, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, i));
            }
        }

    }
}

