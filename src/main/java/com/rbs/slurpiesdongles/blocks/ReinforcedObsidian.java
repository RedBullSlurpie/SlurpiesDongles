package com.rbs.slurpiesdongles.blocks;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.helpers.HarvestLevelHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.projectile.WitherSkullEntity;
import net.minecraft.state.IStateHolder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.extensions.IForgeBlockState;

import javax.annotation.Nonnull;

public class ReinforcedObsidian extends Block {

    public final HarvestLevelHelper resource;

    public ReinforcedObsidian(Properties builder, HarvestLevelHelper resource, String name) {
        super(builder);

        this.resource = resource;
        this.setRegistryName(Reference.MODID, name);


    }
    /*@Override
    public boolean canEntityDestroy(@Nonnull IForgeBlockState state, @Nonnull IWorldReader world, @Nonnull BlockPos pos, @Nonnull Entity entity) {
        return !(entity instanceof WitherEntity) && !(entity instanceof WitherSkullEntity);
    }
    @Override
    public void onBlockExploded(@Nonnull World world, @Nonnull BlockPos pos, @Nonnull Explosion explosion) {
    }*/

    @Override
    public boolean canDropFromExplosion(Explosion p_149659_1_) {
        return false;
    }

    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

    @Override
    public int getHarvestLevel(BlockState state) {
        return resource.harvestLevel;
    }
}


