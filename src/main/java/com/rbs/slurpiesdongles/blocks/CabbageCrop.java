package com.rbs.slurpiesdongles.blocks;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.init.ModBlocks;
import com.rbs.slurpiesdongles.init.ModFood;
import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class CabbageCrop extends BlockCrops {
    private static final VoxelShape[] SHAPES = new VoxelShape[]{Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D)};

    public CabbageCrop(String name, Properties builder) {
        super(builder);

        this.setRegistryName(Reference.MODID, name);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this, new Item.Properties().group(Reference.tabSlurpiesDongles)).setRegistryName(this.getRegistryName()));

    }
    public VoxelShape getShape(IBlockState state, IBlockReader worldIn, BlockPos pos) {
        return SHAPES[state.get(this.getAgeProperty())];
    }


    public IItemProvider getSeedsItem() {
        return ModFood.CABBAGE;
    }

    public IItemProvider getCropsItem() {
        return ModFood.CABBAGE;
    }


    /*@Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockReader world, BlockPos pos) {
        return net.minecraftforge.common.EnumPlantType.Crop;
    }

    public List<ModelResourceLocation> getVariants() {

        List<ModelResourceLocation> list = Lists.newArrayList();
        for (int i = 0; i < 4; ++i) {
            list.add(new ModelResourceLocation(getFullName() + i, "inventory"));
        }
        return list;
    }

    public String getFullName() {
        return getModID() + ":" + getName();
    }

    public String getName() {
        return Names.cabbage;
    }

    public String getModID() {
        return Reference.MODID.toLowerCase();

    }*/
}
