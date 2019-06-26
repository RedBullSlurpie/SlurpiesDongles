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
       // MinecraftForge.EVENT_BUS.register(new GrassDrops());

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


