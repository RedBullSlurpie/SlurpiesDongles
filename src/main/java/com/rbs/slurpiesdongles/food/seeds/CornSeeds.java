package com.rbs.slurpiesdongles.food.seeds;

import com.google.common.collect.Lists;
import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.SlurpiesDongles;
import com.rbs.slurpiesdongles.handlers.Names;
import com.rbs.slurpiesdongles.init.ModBlocks;
import com.rbs.slurpiesdongles.init.ModFood;
import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.IPlantable;

import java.util.List;

public class CornSeeds extends ItemSeeds implements IPlantable {
    public CornSeeds(String name, Block crop, Properties builder) {
        super(crop, builder);

        this.setRegistryName(Reference.MODID, name);
        ModFood.FOODS.add(this);
    }

    public String getFullName() {
        return getModId() + ":" + getName();
    }


    public String getModId() {
        return Reference.MODID.toLowerCase();
    }


    public List<ModelResourceLocation> getVariants() {
        return Lists.newArrayList(new ModelResourceLocation(getFullName(), "inventory"));
    }

}
