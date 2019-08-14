package com.rbs.slurpiesdongles;

import com.rbs.slurpiesdongles.config.ConfigGeneral;
import com.rbs.slurpiesdongles.init.ModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NATURAL_STONE;
import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NETHERRACK;
import static net.minecraft.world.gen.placement.Placement.COUNT_RANGE;

public class OreGenerator {

    public static void setupOreGen() {

        //First number is Vein Size, 2nd number is the chance, 3rd is ??, 4th is min height, 5th is max height

        for (Biome biome : ForgeRegistries.BIOMES) {
            //Overworld Ores
            if (ConfigGeneral.amazoniteOreGeneration.get())
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.amazonite_ore.getDefaultState(), ConfigGeneral.amazoniteOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.amazoniteOreChance.get(), ConfigGeneral.amazoniteMinHeight.get(), ConfigGeneral.amazoniteMinHeight.get(), ConfigGeneral.amazoniteMaxHeight.get())));

            if (ConfigGeneral.amethystOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.amethyst_ore.getDefaultState(), ConfigGeneral.amethystOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.amethystOreChance.get(), ConfigGeneral.amethystMinHeight.get(), ConfigGeneral.amethystMinHeight.get(), ConfigGeneral.amethystMaxHeight.get())));
            }
            if (ConfigGeneral.peridotOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.peridot_ore.getDefaultState(), ConfigGeneral.peridotOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.peridotOreChance.get(), ConfigGeneral.peridotMinHeight.get(), ConfigGeneral.peridotMinHeight.get(), ConfigGeneral.peridotMaxHeight.get())));
            }
            if (ConfigGeneral.rubyOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.ruby_ore.getDefaultState(), ConfigGeneral.rubyOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.rubyOreChance.get(), ConfigGeneral.rubyMinHeight.get(), ConfigGeneral.rubyMinHeight.get(), ConfigGeneral.rubyMaxHeight.get())));
            }
            if (ConfigGeneral.sapphireOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.sapphire_ore.getDefaultState(), ConfigGeneral.sapphireOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.sapphireOreChance.get(), ConfigGeneral.sapphireMinHeight.get(), ConfigGeneral.sapphireMinHeight.get(), ConfigGeneral.sapphireMaxHeight.get())));
            }
            if (ConfigGeneral.topazOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, ModBlocks.topaz_ore.getDefaultState(), ConfigGeneral.topazOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.topazOreChance.get(), ConfigGeneral.topazMinHeight.get(), ConfigGeneral.topazMinHeight.get(), ConfigGeneral.topazMaxHeight.get())));
            }
            //Nether Ores
            if (ConfigGeneral.netherCoalOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NETHERRACK, ModBlocks.nether_coal_ore.getDefaultState(), ConfigGeneral.netherCoalOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.netherCoalOreChance.get(), ConfigGeneral.netherCoalOreMinHeight.get(), ConfigGeneral.netherCoalOreMinHeight.get(), ConfigGeneral.netherCoalOreMaxHeight.get())));
            }
            if (ConfigGeneral.netherDiamondOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NETHERRACK, ModBlocks.nether_diamond_ore.getDefaultState(), ConfigGeneral.netherDiamondOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.netherDiamondOreChance.get(), ConfigGeneral.netherDiamondOreMinHeight.get(), ConfigGeneral.netherDiamondOreMinHeight.get(), ConfigGeneral.netherDiamondOreMaxHeight.get())));
            }
            if (ConfigGeneral.netherEmeraldOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NETHERRACK, ModBlocks.nether_emerald_ore.getDefaultState(), ConfigGeneral.netherEmeraldOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.netherEmeraldOreChance.get(), ConfigGeneral.netherEmeraldOreMinHeight.get(), ConfigGeneral.netherEmeraldOreMinHeight.get(), ConfigGeneral.netherEmeraldOreMaxHeight.get())));
            }
            if (ConfigGeneral.netherGoldOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NETHERRACK, ModBlocks.nether_gold_ore.getDefaultState(), ConfigGeneral.netherGoldOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.netherGoldOreChance.get(), ConfigGeneral.netherGoldOreMinHeight.get(), ConfigGeneral.netherGoldOreMinHeight.get(), ConfigGeneral.netherGoldOreMaxHeight.get())));
            }

            if (ConfigGeneral.netherIronOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NETHERRACK, ModBlocks.nether_iron_ore.getDefaultState(), ConfigGeneral.netherIronOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.netherIronOreChance.get(), ConfigGeneral.netherIronOreMinHeight.get(), ConfigGeneral.netherIronOreMinHeight.get(), ConfigGeneral.netherIronOreMaxHeight.get())));
            }
            if (ConfigGeneral.netherLapisOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NETHERRACK, ModBlocks.nether_lapis_ore.getDefaultState(), ConfigGeneral.netherLapisOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.netherlapisOreChance.get(), ConfigGeneral.netherLapisOreMinHeight.get(), ConfigGeneral.netherLapisOreMinHeight.get(), ConfigGeneral.netherLapisOreMaxHeight.get())));
            }
            if (ConfigGeneral.netherRedstoneOreGeneration.get()) {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NETHERRACK, ModBlocks.nether_redstone_ore.getDefaultState(), ConfigGeneral.netherRedstoneOreSize.get().intValue()), COUNT_RANGE, new CountRangeConfig(ConfigGeneral.netherRedstoneOreChance.get(), ConfigGeneral.netherRedstoneOreMinHeight.get(), ConfigGeneral.netherRedstoneOreMinHeight.get(), ConfigGeneral.netherRedstoneOreMaxHeight.get())));
            }
        }
    }
}


