package com.rbs.slurpiesdongles.init;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.items.*;
import com.rbs.slurpiesdongles.items.charms.*;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<>();
    //Example of using other effects that are no longer in the class
    //register("water_bucket", new ItemBucket(Fluids.WATER, (new Item.Properties()).containerItem(item).maxStackSize(1).group(ItemGroup.MISC)));

    //Charms
    public static Item ABSORPTION_CHARM = new AbsorptionCharm("absorption_charm", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item ABSORPTION_CHARM_TIER_2 = new AbsorptionCharmTier2("absorption_charm_tier_2", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item FIRE_CHARM = new FireCharm("fire_resistance_charm", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item NIGHT_VISION_CHARM = new NightVisionCharm("night_vision_charm", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item REGEN_CHARM = new RegenerationCharm("regen_charm", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item REGEN_CHARM_TIER_2 = new RegenerationCharmTier2("regen_charm_tier_2", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SPEED_CHARM = new SpeedCharm("speed_charm", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SPEED_CHARM_TIER_2 = new SpeedCharmTier2("speed_charm_tier_2", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item STRENGTH_CHARM = new StrengthCharm("strength_charm", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item STRENGTH_CHARM_TIER_2 = new StrengthCharmTier2("strength_charm_tier_2", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item WATER_BREATHING_CHARM = new WaterBreathingCharm("water_breathing_charm", new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Dusts
    public static Item BLUE_GLOWSTONE_DUST = new ItemBase("blue_glowstone_dust", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item GRAY_GLOWSTONE_DUST = new ItemBase("gray_glowstone_dust", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item GREEN_GLOWSTONE_DUST = new ItemBase("green_glowstone_dust", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item ORANGE_GLOWSTONE_DUST = new ItemBase("orange_glowstone_dust", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PINK_GLOWSTONE_DUST = new ItemBase("pink_glowstone_dust", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PURPLE_GLOWSTONE_DUST = new ItemBase("purple_glowstone_dust", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RED_GLOWSTONE_DUST = new ItemBase("red_glowstone_dust", new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Gems
    public static Item AMAZONITE = new ItemBase("amazonite", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item AMETHYST = new ItemBase("amethyst", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item HARDENED_TOPAZ = new ItemBase("hardened_topaz", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item PERIDOT = new ItemBase("peridot", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item RUBY = new ItemBase("ruby", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item SAPPHIRE = new ItemBase("sapphire", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ = new ItemBase("topaz", new Item.Properties().group(Reference.tabSlurpiesDongles));
    //Items
    public static Item BLENDER = new ContainerItem(new Item.Properties().group(Reference.tabSlurpiesDongles), "blender");
    public static Item HOT_WATER = new ItemBase("hot_water", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item KNIFE = new ContainerItem(new Item.Properties().group(Reference.tabSlurpiesDongles), "knife");
    public static Item POPS_SIGN = new ItemBase("pops_sign", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item TOPAZ_HANDLE = new ItemBase("topaz_handle", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item VMP_UPGRADE = new ItemBase("vmp_upgrade", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item VMH_UPGRADE = new ItemBase("vmh_upgrade", new Item.Properties().group(Reference.tabSlurpiesDongles));

}
