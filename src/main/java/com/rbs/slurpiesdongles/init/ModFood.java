package com.rbs.slurpiesdongles.init;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.food.*;
//import com.rbs.slurpiesdongles.food.seeds.CornSeeds;
//import com.rbs.slurpiesdongles.food.seeds.StrawberrySeeds;
import com.rbs.slurpiesdongles.food.seeds.CornSeeds;
import com.rbs.slurpiesdongles.food.seeds.StrawberrySeeds;
import com.rbs.slurpiesdongles.items.ItemBase;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;

public class ModFood {

    public static final List<Item> FOODS = new ArrayList<>();


    //Drinks
    public static FoodBaseDrink APPLE_JUICE = new FoodBaseDrink("apple_juice", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.APPLE_JUICE));
    public static FoodBaseDrink APPLE_SLUSHIE = new FoodBaseDrink("apple_slushie", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.APPLE_SLUSHIE));
    public static FoodBaseDrink CARROT_JUICE = new FoodBaseDrink("carrot_juice", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.CARROT_JUICE));
    public static FoodBaseDrink LEMONADE = new FoodBaseDrink("lemonade", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.LEMONADE));
    public static FoodBaseDrink MELON_JUICE = new FoodBaseDrink("melon_juice", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.MELON_JUICE));
    public static FoodBaseDrink MELON_SLUSHIE = new FoodBaseDrink("melon_slushie", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.MELON_SLUSHIE));
    public static FoodBaseDrink ORANGE_JUICE = new FoodBaseDrink("orange_juice", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ORANGE_JUICE));
    public static FoodBaseDrink ORANGE_SLUSHIE = new FoodBaseDrink("orange_slushie", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ORANGE_SLUSHIE));
    public static FoodBaseDrink STRAWBERRY_JUICE = new FoodBaseDrink("strawberry_juice", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.STRAWBERRY_JUICE));
    public static FoodBaseDrink STRAWBERRY_SLUSHIE = new FoodBaseDrink("strawberry_slushie", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.STRAWBERRY_SLUSHIE));
    public static FoodBaseDrink TOMATO_JUICE = new FoodBaseDrink("tomato_juice", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.TOMATO_JUICE));

    //Food
    public static FoodBaseTiny APPLE_SLICE = new FoodBaseTiny("apple_slice", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.APPLE_SLICE));
    public static FoodBase BACON = new FoodBase("bacon", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.BACON));
    public static FoodBase BACON_EGG_SANDWICH = new FoodBase("bacon_egg_sandwitch", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.BACON));
    public static FoodBase BACON_POTATO_BEEF_STEW = new FoodBase("bacon_potato_beef_stew", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.BACON_POTATO_BEEF_STEW));
    public static FoodBase BACON_POTATO_CHICKEN_STEW = new FoodBase("bacon_potato_chicken_stew", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.BACON_POTATO_CHICKEN_STEW));
    public static FoodBase BEEF_JERKY = new FoodBase("beef_jerky", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.BEEF_JERKY));
    public static FoodBase BEEF_CHICKEN_SANDWICH = new FoodBase("beef_chicken_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.BEEF_CHICKEN_SANDWICH));
    public static FoodBase BEEF_PORK_SANDWICH = new FoodBase("beef_pork_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.BEEF_PORK_SANDWICH));
    public static FoodBase BEEF_SANDWICH = new FoodBase("beef_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.BEEF_SANDWICH));
    public static FoodBase CARROT_STICK = new FoodBase("carrot_stick", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.CARROT_STICK));
    public static FoodBase CHICKEN_NUGGET = new FoodBase("chicken_nugget", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.CHICKEN_NUGGET));
    public static FoodBase CHICKEN_SANDWICH = new FoodBase("chicken_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.CHICKEN_SANDWICH));
    public static FoodBase CHICKEN_PORK_SANDWICH = new FoodBase("chicken_pork_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.CHICKEN_PORK_SANDWICH));
    public static FoodBase COOKED_CARROT = new FoodBase("cooked_carrot", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.COOKED_CARROT));
    public static FoodBase COOKED_CARROT_STICK = new FoodBase("cooked_carrot_stick", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.COOKED_CARROT_STICK));
    public static FoodBase COOKED_RABBIT_LEG = new FoodBase("cooked_rabbit_leg", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.COOKED_RABBIT_LEG));
    public static FoodBase CORN = new FoodBase("corn", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.CORN));
    public static FoodBase EGGS = new FoodBase("eggs", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.EGGS));
    public static FoodBase MELON_SLICE = new FoodBase("melon_slice", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.MELON_SLICE));
    public static FoodBase MIXED_FRUIT_BOWL = new FoodBase("mixed_fruit_bowl", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.MIXED_FRUIT_BOWL));
    public static FoodBase MIXED_SEEDS = new FoodBase("mixed_seeds", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.MIXED_SEEDS));
    public static FoodBase PIZZA = new FoodBase("pizza", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.PIZZA));
    public static FoodBase PORK_SANDWICH = new FoodBase("pork_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.PORK_SANDWICH));
    public static FoodBase POTATO_WEDGE = new FoodBase("potato_wedge", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.POTATO_WEDGE));
    public static FoodBase RABBIT_LEG = new FoodBase("rabbit_leg", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.RABBIT_LEG));
    public static FoodBase RAW_BACON = new FoodBase("raw_bacon", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.RAW_BACON));
    public static FoodBase RAW_BEEF_SLICE = new FoodBase("raw_beef_slice", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.RAW_BEEF_SLICE));
    public static ItemBase RAW_CORN = new ItemBase("raw_corn", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase ROASTED_APPLE = new FoodBase("roasted_apple", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ROASTED_APPLE));
    public static FoodBase ROASTED_BEETROOT_SEEDS = new FoodBase("roasted_beetroot_seeds", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ROASTED_BEETROOT_SEEDS));
    public static FoodBase ROASTED_MELON_SEEDS = new FoodBase("roasted_melon_seeds", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ROASTED_MELON_SEEDS));
    public static FoodBase ROASTED_MUSHROOM = new FoodBase("roasted_mushroom", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ROASTED_MUSHROOM));
    public static FoodBase ROASTED_PUMPKIN_SEEDS = new FoodBase("roasted_pumpkin_seeds", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ROASTED_PUMPKIN_SEEDS));
    public static FoodBase ROASTED_RED_MUSHROOM = new FoodBase("roasted_red_mushroom", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ROASTED_RED_MUSHROOM));
    public static FoodBase ROASTED_SEEDS = new FoodBase("roasted_seeds", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ROASTED_SEEDS));
    public static FoodBaseTiny STRAWBERRY = new FoodBaseTiny("strawberry", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.STRAWBERRY));
    public static FoodBase SUGAR_COATED_APPLE = new FoodBase("sugarcoated_apple", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.SUGAR_COATED_APPLE));
    public static FoodBase SUGAR_COATED_LEMON = new FoodBase("sugarcoated_lemon", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.SUGAR_COATED_LEMEON));
    public static FoodBase SUGAR_COATED_MELON = new FoodBase("sugarcoated_melon", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.SUGAR_COATED_MELON));
    public static FoodBase SUGAR_COATED_ORANGE = new FoodBase("sugarcoated_orange", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.SUGAR_COATED_ORANGE));
    public static FoodBase SUGAR_COATED_STRAWBERRY = new FoodBase("sugarcoated_strawberry", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.SUGAR_COATED_STRAWBERRY));
    public static FoodBase TOAST = new FoodBase("toast", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.TOAST));
    public static FoodBase TOASTED_BACON_EGG_SANDWICH = new FoodBase("toasted_bacon_egg_sandwitch", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.TOASTED_BACON_EGG_SANDWICH));
    //Foods but Crops
    public static FoodBaseSeed CABBAGE = new FoodBaseSeed(ModBlocks.CABBAGE_CROP, new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.CABBAGE), "cabbage");
    public static FoodBaseSeed LEMON = new FoodBaseSeed(ModBlocks.LEMON_CROP, new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.LEMON), "lemon");
    public static FoodBaseSeed ORANGE = new FoodBaseSeed(ModBlocks.ORANGE_CROP, new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ORANGE), "orange");
    public static FoodBaseSeed TOMATO = new FoodBaseSeed(ModBlocks.TOMATO_CROP, new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.TOMATO), "tomato");

    //Regen Stuff
    public static AppleDiamond APPLE_DIAMOND = new AppleDiamond("diamond_apple", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.DIAMOND_APPLE).maxStackSize(16));
    public static AppleEmerald APPLE_EMERALD = new AppleEmerald("emerald_apple", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.EMERALD_APPLE).maxStackSize(16));
    public static AppleIron APPLE_IRON = new AppleIron("iron_apple", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.IRON_APPLE).maxStackSize(16));
    public static AppleDiamondEnchanted APPLE_DIAMOND_ENCHANTED = new AppleDiamondEnchanted("enchanted_diamond_apple", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ENCHANTED_DIAMOND_APPLE).maxStackSize(16));
    public static AppleEmeraldEnchanted APPLE_EMERALD_ENCHANTED = new AppleEmeraldEnchanted("enchanted_emerald_apple", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ENCHANTED_EMERALD_APPLE).maxStackSize(16));
    public static AppleIronEnchanted APPLE_IRON_ENCHANTED = new AppleIronEnchanted("enchanted_iron_apple", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.ENCHANTED_IRON_APPLE).maxStackSize(16));
    public static HolyBread HOLYBREAD = new HolyBread("holy_bread", new Item.Properties().group(Reference.tabSlurpiesDongles).food(FoodStats.HOLY_BREAD));

    //Seeds
    public static Item CORN_SEED = new CornSeeds("corn_seed", ModBlocks.CORN_CROP, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static Item STRAWBERRY_SEEDS = new StrawberrySeeds("strawberry_seed", ModBlocks.STRAWBERRY_CROP, new Item.Properties().group(Reference.tabSlurpiesDongles));
}
