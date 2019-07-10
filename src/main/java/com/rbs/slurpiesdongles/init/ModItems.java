package com.rbs.slurpiesdongles.init;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.items.*;
import com.rbs.slurpiesdongles.items.charms.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.WallOrFloorItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD) //This line tells forge this class has events we want to listen to, we also tell forge we want to listen to the Mod bus. (This is new in 1.13)
@ObjectHolder(Reference.MODID) //We use ObjectHolder to let forge inject the item into our variables, this to make sure when people replace our item we use the correct one.


public class ModItems {
   //Charms
    public static final Item absorption_charm = null;
    public static final Item absorption_charm_tier_2 = null;
    public static final Item fire_resistance_charm = null;
    public static final Item night_vision_charm = null;
    public static final Item regen_charm = null;
    public static final Item regen_charm_tier_2 = null;
    public static final Item speed_charm = null;
    public static final Item speed_charm_tier_2 = null;
    public static final Item strength_charm = null;
    public static final Item strength_charm_tier_2 = null;
    public static final Item water_breathing_charm = null;
    //Dusts
    public static final Item blue_glowstone_dust = null;
    public static final Item gray_glowstone_dust = null;
    public static final Item green_glowstone_dust = null;
    public static final Item orange_glowstone_dust = null;
    public static final Item pink_glowstone_dust = null;
    public static final Item purple_glowstone_dust = null;
    public static final Item red_glowstone_dust = null;
    //Gems
    public static final Item amazonite = null;
    public static final Item amethyst = null;
    public static final Item hardened_topaz = null;
    public static final Item peridot = null;
    public static final Item ruby = null;
    public static final Item sapphire = null;
    public static final Item topaz = null;
    //Actual Items
    public static final Item blender = null;
    public static final Item hot_water = null;
    public static final Item knife = null;
    public static final Item nether_star_chunk = null;
    public static final Item pops_sign = null;
    public static final Item stone_rod = null;
    public static final Item topaz_handle = null;
    public static final Item vmh_upgrade = null;
    public static final Item vmp_upgrade = null;

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                //Charms
                new AbsorptionCharm(new Item.Properties().group(Reference.tabSlurpiesDongles), "absorption_charm"),
                new AbsorptionCharmTier2(new Item.Properties().group(Reference.tabSlurpiesDongles), "absorption_charm_tier_2"),
                new FireCharm(new Item.Properties().group(Reference.tabSlurpiesDongles), "fire_resistance_charm"),
                new NightVisionCharm(new Item.Properties().group(Reference.tabSlurpiesDongles), "night_vision_charm"),
                new RegenerationCharm(new Item.Properties().group(Reference.tabSlurpiesDongles), "regen_charm"),
                new RegenerationCharmTier2(new Item.Properties().group(Reference.tabSlurpiesDongles), "regen_charm_tier_2"),
                new SpeedCharm(new Item.Properties().group(Reference.tabSlurpiesDongles), "speed_charm"),
                new SpeedCharmTier2(new Item.Properties().group(Reference.tabSlurpiesDongles), "speed_charm_tier_2"),
                new StrengthCharm(new Item.Properties().group(Reference.tabSlurpiesDongles), "strength_charm"),
                new StrengthCharmTier2(new Item.Properties().group(Reference.tabSlurpiesDongles), "strength_charm_tier_2"),
                new WaterBreathingCharm(new Item.Properties().group(Reference.tabSlurpiesDongles), "water_breathing_charm"),
                //Dusts
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "blue_glowstone_dust"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "gray_glowstone_dust"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "green_glowstone_dust"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "orange_glowstone_dust"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "pink_glowstone_dust"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "purple_glowstone_dust"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "red_glowstone_dust"),
                //Gems
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "amazonite"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "amethyst"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "hardened_topaz"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "peridot"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "ruby"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "sapphire"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "topaz"),
                //Actual Items
                new ContainerItem(new Item.Properties().group(Reference.tabSlurpiesDongles), "blender"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "hot_water"),
                new ContainerItem(new Item.Properties().group(Reference.tabSlurpiesDongles), "knife"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "nether_star_chunk"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "pops_sign"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "stone_rod"),
                new WallOrFloorItem(ModBlocks.stone_torch, ModBlocks.wall_stone_torch, new Item.Properties().group(Reference.tabSlurpiesDongles)).setRegistryName(ModBlocks.stone_torch.getRegistryName()),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "topaz_handle"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "vmh_upgrade"),
                new ItemBase(new Item.Properties().group(Reference.tabSlurpiesDongles), "vmp_upgrade"),
                //Block Items
                //Blocks
                createItemBlockForBlock(ModBlocks.blue_bricks, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.cyan_bricks, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.green_bricks, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.orange_bricks, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.purple_bricks, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.rainbow_bricks, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.yellow_bricks, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.blue_glowstone, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.gray_glowstone, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.green_glowstone, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.orange_glowstone, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.pink_glowstone, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.purple_glowstone, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.red_glowstone, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.amazonite_block, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.amethyst_block, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.hardened_topaz_block, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.peridot_block, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.reinforced_obsidian, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.ruby_block, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.sapphire_block, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.topaz_block, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                //Crops
                createItemBlockForBlock(ModBlocks.cabbage_crop, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.corn_crop, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.lemon_crop, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.orange_crop, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.strawberry_crop, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.tomato_crop, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                //Ores
                createItemBlockForBlock(ModBlocks.amazonite_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.amethyst_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.peridot_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.ruby_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.sapphire_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.topaz_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                //Nether Ores
                createItemBlockForBlock(ModBlocks.nether_coal_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.nether_diamond_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.nether_emerald_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.nether_gold_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.nether_iron_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.nether_lapis_ore, new Item.Properties().group(Reference.tabSlurpiesDongles)),
                createItemBlockForBlock(ModBlocks.nether_redstone_ore, new Item.Properties().group(Reference.tabSlurpiesDongles))
        );
    }

    private static BlockItem createItemBlockForBlock (Block block, Item.Properties properties) {
        return (BlockItem) new BlockItem(block, properties).setRegistryName(block.getRegistryName());
    }


}
