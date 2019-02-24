package com.rbs.slurpiesdongles.init;

import com.rbs.slurpiesdongles.Reference;
import com.rbs.slurpiesdongles.food.*;
import com.rbs.slurpiesdongles.food.seeds.CornSeeds;
import com.rbs.slurpiesdongles.food.seeds.StrawberrySeeds;
import com.rbs.slurpiesdongles.items.ItemBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

import java.util.ArrayList;
import java.util.List;

public class ModFood {

    public static final List<Item> FOODS = new ArrayList<>();

    //Drinks
    public static FoodBaseDrink APPLE_JUICE = new FoodBaseDrink(5, 0.5F, false, "apple_juice", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseDrink APPLE_SLUSHIE = new FoodBaseDrink(6, 0.7F, false, "apple_slushie", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static BlackCoffeeDrink BLACK_COFFEE = new BlackCoffeeDrink(2, 0.6F, false, "black_coffee", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseDrink CARROT_JUICE = new FoodBaseDrink(4, 0.6F, false, "carrot_juice", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static CoffeeDrink COFFEE = new CoffeeDrink(3, 0.8F, false, "coffee", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseDrink LEMONADE = new FoodBaseDrink(5, 0.6F, false, "lemonade", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseDrink MELON_JUICE = new FoodBaseDrink(4, 0.6F, false, "melon_juice", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseDrink MELON_SLUSHIE = new FoodBaseDrink(5, 0.8F, false, "melon_slushie", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseDrink ORANGE_JUICE = new FoodBaseDrink(5, 0.6F, false, "orange_juice", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseDrink ORANGE_SLUSHIE = new FoodBaseDrink(6, 0.8F, false, "orange_slushie", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseDrink STRAWBERRY_JUICE = new FoodBaseDrink(4, 0.6F, false, "strawberry_juice", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseDrink STRAWBERRY_SLUSHIE = new FoodBaseDrink(5, 0.8F, false, "strawberry_slushie", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseDrink TOMATO_JUICE = new FoodBaseDrink(4, 0.4F, false, "tomato_juice", new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Food
    public static FoodBaseTiny APPLE_SLICE = new FoodBaseTiny(2, 0.2F, false, "apple_slice", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase BACON = new FoodBase(6, 0.5F, true, "bacon", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static BigSandwich BACON_EGG_SANDWITCH = new BigSandwich("bacon_egg_sandwitch", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase BACON_POTATO_BEEF_STEW = new FoodBase(12, 0.9F, false, "bacon_potato_beef_stew", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase BACON_POTATO_CHICKEN_STEW = new FoodBase(12, 0.9F, false, "bacon_potato_chicken_stew", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase BEEF_JERKY = new FoodBase(3, 0.5F, true, "beef_jerky", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static BigSandwich BEEF_CHICKEN_SANDWITCH = new BigSandwich("beef_chicken_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static BigSandwich BEEF_PORK_SANDWITCH = new BigSandwich("beef_pork_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase BEEF_SANDWITCH = new FoodBase(10, 0.6F, true, "beef_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseSeed CABBAGE = new FoodBaseSeed(3, 0.4F, ModBlocks.CABBAGE_CROP , "cabbage", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseTiny CARROT_STICK = new FoodBaseTiny(2, 0.3F, false, "carrot_stick", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseTiny CHICKEN_NUGGET = new FoodBaseTiny(1, 0.3F, true, "chicken_nugget", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase CHICKEN_SANDWITCH = new FoodBase(10, 0.6F, true, "chicken_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static BigSandwich CHICKEN_PORK_SANDWITCH = new BigSandwich("chicken_pork_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase COOKED_CARROT = new FoodBase(4, 0.3F, false, "cooked_carrot", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseTiny COOKED_CARROT_STICK = new FoodBaseTiny(3, 0.3F, false, "cooked_carrot_stick", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase COOKED_RABBIT_LEG = new FoodBase(3, 0.3F, true, "cooked_rabbit_leg", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase CORN = new FoodBase(6, 1.0F, false, "corn", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase EGGS = new FoodBase(4, 0.4F, false, "eggs", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseSeed LEMON = new FoodBaseSeed(2, 0.2F, ModBlocks.LEMON_CROP, "lemon", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseTiny MELON_SLICE = new FoodBaseTiny(1, 0.2F, false, "melon_slice", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase MIXED_FRUIT_BOWL = new FoodBase(11, 0.8F, false, "mixed_fruit_bowl", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase MIXED_SEEDS = new FoodBase(6, 0.6F, false, "mixed_seeds", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseSeed ORANGE = new FoodBaseSeed(4, 0.3F, ModBlocks.ORANGE_CROP, "orange", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase PORK_SANDWITCH = new FoodBase(10, 0.6F, true, "pork_sandwich", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseTiny POTATO_WEDGE = new FoodBaseTiny(3, 0.3F, false, "potato_wedge", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase RABBIT_LEG = new FoodBase(1, 0.1F, true, "rabbit_leg", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static RawBacon RAW_BACON = new RawBacon(2, 0.2F, true, "raw_bacon", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static RawBeefSlice RAW_BEEF_SLICE = new RawBeefSlice(1, 0.2F, true, "raw_beef_slice", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static ItemBase RAW_CORN = new ItemBase("raw_corn", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseTiny RAW_POTATO_WEDGE = new FoodBaseTiny(1, 0.2F, false, "raw_potato_wedge", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase ROASTED_APPLE = new FoodBase(6, 0.7F, false, "roasted_apple", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase ROASTED_BEETROOT_SEEDS = new FoodBase(2, 0.3F, false, "roasted_beetroot_seeds", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase ROASTED_MELON_SEEDS = new FoodBase(2, 0.3F, false, "roasted_melon_seeds", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseTiny ROASTED_MUSHROOM = new FoodBaseTiny(2, 0.2F, false, "roasted_mushroom", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase ROASTED_PUMPKIN_SEEDS = new FoodBase(2, 0.3F, false, "roasted_pumpkin_seeds", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseTiny ROASTED_RED_MUSHROOM = new FoodBaseTiny(2, 0.2F, false, "roasted_red_mushroom", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase ROASTED_SEEDS = new FoodBase(2, 0.3F, false, "roasted_seeds", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseTiny STRAWBERRY = new FoodBaseTiny(2, 0.3F, false, "strawberry", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseSugarCoated SUGAR_COATED_APPLE = new FoodBaseSugarCoated(4, 0.3F, false, "sugarcoated_apple", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseSugarCoated SUGAR_COATED_LEMON = new FoodBaseSugarCoated(2, 0.2F, false, "sugarcoated_lemon", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseSugarCoated SUGAR_COATED_MELON = new FoodBaseSugarCoated(2, 0.4F, false, "sugarcoated_melon", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseSugarCoated SUGAR_COATED_ORANGE = new FoodBaseSugarCoated(4, 0.3F, false, "sugarcoated_orange", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseTinySugarCoated SUGAR_COATED_STRAWBERRY = new FoodBaseTinySugarCoated(2, 0.3F, false, "sugarcoated_strawberry", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBase TOAST = new FoodBase(6, 1.0F, false, "toast", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static BigSandwich TOASTED_BACON_EGG_SANDWITCH = new BigSandwich("toasted_bacon_egg_sandwitch", new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static FoodBaseSeed TOMATO = new FoodBaseSeed(3, 0.4F, ModBlocks.TOMATO_CROP, "tomato", new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Regen Stuff
    public static AppleDiamond APPLE_DIAMOND = new AppleDiamond(6, 1.3F, false, "diamond_apple", new Item.Properties().maxStackSize(16).group(Reference.tabSlurpiesDongles));
    public static AppleEmerald APPLE_EMERALD = new AppleEmerald(7, 1.4F, false, "emerald_apple", new Item.Properties().maxStackSize(16).group(Reference.tabSlurpiesDongles));
    public static AppleIron APPLE_IRON = new AppleIron(3, 1.2F, false, "iron_apple", new Item.Properties().maxStackSize(16).group(Reference.tabSlurpiesDongles));
    public static AppleDiamondEnchanted APPLE_DIAMOND_ENCHANTED = new AppleDiamondEnchanted(8, 1.5F, false, "enchanted_diamond_apple", new Item.Properties().maxStackSize(8).group(Reference.tabSlurpiesDongles));
    public static AppleEmeraldEnchanted  APPLE_EMERALD_ENCHANTED = new AppleEmeraldEnchanted(9, 1.6F, false, "enchanted_emerald_apple", new Item.Properties().maxStackSize(8).group(Reference.tabSlurpiesDongles));
    public static AppleIronEnchanted APPLE_IRON_ENCHANTED = new AppleIronEnchanted( 4, 1.1F, false, "enchanted_iron_apple", new Item.Properties().maxStackSize(8).group(Reference.tabSlurpiesDongles));
    public static HolyBread HOLYBREAD = new HolyBread(8, 1.2F, false, "holy_bread", new Item.Properties().group(Reference.tabSlurpiesDongles));

    //Seeds
    public static ItemSeeds CORN_SEED = new CornSeeds("corn_seed", ModBlocks.CORN_CROP, new Item.Properties().group(Reference.tabSlurpiesDongles));
    public static ItemSeeds STRAWBERRY_SEEDS = new StrawberrySeeds("strawberry_seed", ModBlocks.STRAWBERRY_CROP, new Item.Properties().group(Reference.tabSlurpiesDongles));
}
