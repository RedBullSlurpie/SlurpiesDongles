package com.rbs.slurpiesdongles;

import com.rbs.slurpiesdongles.events.GrassDrops;
import com.rbs.slurpiesdongles.events.PigDrops;
import com.rbs.slurpiesdongles.update.Configuration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(value = Reference.MODID)
public class SlurpiesDongles {

    public static Random random = new Random();


    public static SlurpiesDongles instance;

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public SlurpiesDongles() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        // Register ourselves for server, registry and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        Configuration.init();


    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        MinecraftForge.EVENT_BUS.register(new PigDrops());
        OreGenerator.setupOreGen();
        //MinecraftForge.EVENT_BUS.register(new GrassDrops());






/*
    private static OreFeatureConfig getOreGenFeature(Block ore, int chance, int size, int avgHeight, int spread) {
        return Biome.Builder(Feature.ORE, new OreFeatureConfig((blockState) -> Tags.Blocks.STONE.contains(blockState.getBlock()) || Tags.Blocks.ORES.contains(blockState.getBlock()), ore.getDefaultState(), chance), Biome.DEPTH_AVERAGE, new DepthAverageConfig(size, avgHeight, spread));
    }

    private static OreFeatureConfig getNetherOreGenFeature(Block ore, int size, int count) {
        return Biome.Builder(Feature.ORE, new OreFeatureConfig(BlockMatcher.forBlock(Blocks.NETHERRACK), ore.getDefaultState(), size), Biome.COUNT_RANGE, new CountRangeConfig(count, 10, 20, 128));

    }
    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        SeedsDropFromGrass.getSeedDrops();
        MinecraftForge.EVENT_BUS.register(new MobDrops());

        //World Generation
        //Overworld
        OreFeatureConfig amazonite_ore = getOreGenFeature(ModBlocks.AMAZONITE_ORE, 6, 4, 1, 26);
        OreFeatureConfig amethyst_ore = getOreGenFeature(ModBlocks.AMETHYST_ORE, 5, 3, 1, 32);
        CompositeFeature<?, ?> peridot_ore = getOreGenFeature(ModBlocks.PERIDOT_ORE, 10, 7, 1, 48);
        CompositeFeature<?, ?> ruby_ore = getOreGenFeature(ModBlocks.RUBY_ORE, 6, 5, 1, 32);
        CompositeFeature<?, ?> sapphire_ore = getOreGenFeature(ModBlocks.SAPPHIRE_ORE, 10, 7, 1, 48);
        CompositeFeature<?, ?> topaz_ore = getOreGenFeature(ModBlocks.TOPAZ_ORE, 4, 4, 1, 20);
        //Nether
        CompositeFeature<?, ?> nether_coal_ore = getNetherOreGenFeature(ModBlocks.NETHER_COAL_ORE, 10, 10);
        CompositeFeature<?, ?> nether_diamond_ore = getNetherOreGenFeature(ModBlocks.NETHER_DIAMOND_ORE, 3, 4);
        CompositeFeature<?, ?> nether_emerald_ore = getNetherOreGenFeature(ModBlocks.NETHER_EMERALD_ORE, 3, 4);
        CompositeFeature<?, ?> nether_gold_ore = getNetherOreGenFeature(ModBlocks.NETHER_GOLD_ORE, 7, 6);
        CompositeFeature<?, ?> nether_iron_ore = getNetherOreGenFeature(ModBlocks.NETHER_IRON_ORE, 10, 8);
        CompositeFeature<?, ?> nether_lapis_ore = getNetherOreGenFeature(ModBlocks.NETHER_LAPIS_ORE, 5, 4);
        CompositeFeature<?, ?> nether_redstone_ore = getNetherOreGenFeature(ModBlocks.NETHER_REDSTONE_ORE, 6, 5);
        for (Biome biome : ForgeRegistries.BIOMES.getValues()) {
            //System.out.println(biome.getRegistryName());
            if (biome == Biomes.NETHER) {
                //Nether Gen
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, nether_coal_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, nether_diamond_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, nether_emerald_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, nether_iron_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, nether_gold_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, nether_lapis_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_DECORATION, nether_redstone_ore);
            } else {
                //Overworld Gen
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, amazonite_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, amethyst_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, peridot_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ruby_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, sapphire_ore);
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, topaz_ore);
            }
        }
    }*/

    }

    private void doClientStuff ( final FMLClientSetupEvent event){
            // do something that can only be done on the client
        }

        private void enqueueIMC ( final InterModEnqueueEvent event)
        {
            // some example code to dispatch IMC to another mod
        }

        private void processIMC ( final InterModProcessEvent event)
        {
            // some example code to receive and process InterModComms from other mods

        }
        // You can use SubscribeEvent and let the Event Bus discover methods to call
        @SubscribeEvent
        public static void onServerStarting (FMLServerStartingEvent event){
            // do something when the server starts

        }

    }


