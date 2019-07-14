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
                        Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.amazonite_ore.getDefaultState(), 4),
                        Placement.COUNT_RANGE, new CountRangeConfig(6, 0, 1, 32)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.amethyst_ore.getDefaultState(), 3),
                    Placement.COUNT_RANGE, new CountRangeConfig(5, 0, 1, 32)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.peridot_ore.getDefaultState(), 6),
                    Placement.COUNT_RANGE, new CountRangeConfig(7, 0, 1, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.ruby_ore.getDefaultState(), 5),
                    Placement.COUNT_RANGE, new CountRangeConfig(6, 0, 1, 48)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.sapphire_ore.getDefaultState(), 6),
                    Placement.COUNT_RANGE, new CountRangeConfig(7, 0, 1, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.topaz_ore.getDefaultState(), 4),
                    Placement.COUNT_RANGE, new CountRangeConfig(4, 0, 1, 28)));

            //Nether Gen: First number is Vein Size, 2nd number is the chance, 3rd is ??, 4th is min height, 5th is max height
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.nether_coal_ore.getDefaultState(), 15),
                    Placement.COUNT_RANGE, new CountRangeConfig(8, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.nether_diamond_ore.getDefaultState(), 3),
                    Placement.COUNT_RANGE, new CountRangeConfig(4, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.nether_emerald_ore.getDefaultState(), 3),
                    Placement.COUNT_RANGE, new CountRangeConfig(4, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.nether_gold_ore.getDefaultState(), 7),
                    Placement.COUNT_RANGE, new CountRangeConfig(6, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.nether_iron_ore.getDefaultState(), 10),
                    Placement.COUNT_RANGE, new CountRangeConfig(8, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.nether_lapis_ore.getDefaultState(), 5),
                    Placement.COUNT_RANGE, new CountRangeConfig(4, 0, 20, 128)));

            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(
                    Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, ModBlocks.nether_redstone_ore.getDefaultState(), 6),
                    Placement.COUNT_RANGE, new CountRangeConfig(5, 0, 20, 128)));
            }

        }
    }


