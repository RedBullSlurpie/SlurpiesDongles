package com.rbs.slurpiesdongles;

import com.rbs.slurpiesdongles.init.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGenerator {

    public static void setupOreGen() {

        //First number is Vein Size, 2nd number is the chance, 3rd is ??, 4th is min height, 5th is max height

        for (Biome biome : ForgeRegistries.BIOMES) {

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                        Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.AMAZONITE_ORE.getDefaultState(), 4),
                        Placement.COUNT_RANGE, new CountRangeConfig(6, 0, 1, 32)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.AMETHYST_ORE.getDefaultState(), 3),
                    Placement.COUNT_RANGE, new CountRangeConfig(5, 0, 1, 32)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.PERIDOT_ORE.getDefaultState(), 6),
                    Placement.COUNT_RANGE, new CountRangeConfig(7, 0, 1, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.RUBY_ORE.getDefaultState(), 5),
                    Placement.COUNT_RANGE, new CountRangeConfig(6, 0, 1, 48)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.SAPPHIRE_ORE.getDefaultState(), 6),
                    Placement.COUNT_RANGE, new CountRangeConfig(7, 0, 1, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.TOPAZ_ORE.getDefaultState(), 4),
                    Placement.COUNT_RANGE, new CountRangeConfig(4, 0, 1, 28)));

            //Nether Gen: First number is Vein Size, 2nd number is the chance, 3rd is ??, 4th is min height, 5th is max height
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_COAL_ORE.getDefaultState(), 15),
                    Placement.COUNT_RANGE, new CountRangeConfig(8, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_DIAMOND_ORE.getDefaultState(), 3),
                    Placement.COUNT_RANGE, new CountRangeConfig(4, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_EMERALD_ORE.getDefaultState(), 3),
                    Placement.COUNT_RANGE, new CountRangeConfig(4, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_GOLD_ORE.getDefaultState(), 7),
                    Placement.COUNT_RANGE, new CountRangeConfig(6, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_IRON_ORE.getDefaultState(), 10),
                    Placement.COUNT_RANGE, new CountRangeConfig(8, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_LAPIS_ORE.getDefaultState(), 5),
                    Placement.COUNT_RANGE, new CountRangeConfig(4, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.NETHER_REDSTONE_ORE.getDefaultState(), 6),
                    Placement.COUNT_RANGE, new CountRangeConfig(5, 0, 20, 128)));
            }

        }
    }

