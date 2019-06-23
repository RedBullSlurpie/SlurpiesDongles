package com.rbs.slurpiesdongles.items.tools.materials;

import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;

import java.util.function.Supplier;

public enum ToolMaterials implements IItemTier{

    //Battleaxe Materials
    AMAZONITE_BATTLEAXE(0, 1949, 0.0F, 5, 37, () -> {
        return Ingredient.fromItems(ModItems.AMAZONITE);
    }),

    AMETHYST_BATTLEAXE(0, 873, 0.0F, 5, 31, () -> {
        return Ingredient.fromItems(ModItems.AMETHYST);
    }),

    EMERALD_BATTLEAXE(0, 2149, 0.0F, 5, 17, () -> {
        return Ingredient.fromItems(Items.EMERALD);
    }),

    PERIDOT_BATTLEAXE(0, 492, 0.0F, 3, 27, () -> {
        return Ingredient.fromItems(ModItems.PERIDOT);
    }),

    RUBY_BATTLEAXE(0, 721, 0.0F, 4, 24, () -> {
        return Ingredient.fromItems(ModItems.RUBY);
    }),

    SAPPHIRE_BATTLEAXE(0, 561, 0.0F, 4, 26, () -> {
        return Ingredient.fromItems(ModItems.SAPPHIRE);
    }),

    TOPAZ_BATTLEAXE(0, 0, 0.0F, 7, 20, () -> {
        return Ingredient.fromItems(ModItems.TOPAZ);
    }),

    WITHERED_BATTLEAXE(0, 0, 0.0F, 8, 17, () -> {
        return Ingredient.fromItems(Items.NETHER_STAR, Items.WITHER_SKELETON_SKULL);
    }),

    //General Tool Materials
    AMAZONITE(3, 1949, 9.0F, 1, 37, () -> {
        return Ingredient.fromItems(ModItems.AMAZONITE);
    }),
    AMETHYST(3, 873, 7.0F, 1, 31, () -> {
        return Ingredient.fromItems(ModItems.AMETHYST);
    }),
    EMERALD(4, 2149, 10.0F, 1, 17, () -> {
        return Ingredient.fromItems(Items.EMERALD);
    }),
    PERIDOT(2, 492, 6.0F, 1, 27, () -> {
        return Ingredient.fromItems(ModItems.PERIDOT);
    }),
    RUBY(2, 721, 7.0F, 1, 24, () -> {
        return Ingredient.fromItems(ModItems.RUBY);
    }),
    SAPPHIRE(2, 561, 6.0F, 1, 26, () -> {
        return Ingredient.fromItems(ModItems.SAPPHIRE);
    }),
    TOPAZ(4, 0, 14.0F, 1, 20, () -> {
        return Ingredient.fromItems(ModItems.TOPAZ);
    }),

    WITHERED(4, 0, 16.0F, 1, 17, () -> {
        return Ingredient.fromItems(Items.WITHER_SKELETON_SKULL, Items.NETHER_STAR);
    }),
    //Paxel Materials

    AMAZONITE_PAXEL(3, 5847, 9.0F, 4, 37, () -> {
        return Ingredient.fromItems(ModItems.AMAZONITE);
    }),

    AMETHYST_PAXEL(3, 2619, 7.0F, 4, 31, () -> {
        return Ingredient.fromItems(ModItems.AMETHYST);
    }),

    DIAMOND_PAXEL(3, 4683, 8.0F, 3, 31, () -> {
        return Ingredient.fromItems(Items.DIAMOND);
    }),

    EMERALD_PAXEL(3, 6447, 10.0F, 4, 17, () -> {
        return Ingredient.fromItems(Items.EMERALD);
    }),

    GOLD_PAXEL(0, 96, 12.0F, 0, 22, () -> {
        return Ingredient.fromItems(Items.GOLD_INGOT);
    }),

    IRON_PAXEL(2, 750, 6.0F, 2, 14, () -> {
        return Ingredient.fromItems(Items.IRON_INGOT);
    }),

    STONE_PAXEL(1, 393, 4.0F, 1, 5, () -> {
        return Ingredient.fromItems(Blocks.COBBLESTONE);
    }),

    PERIDOT_PAXEL(3, 1476, 6.0F, 2, 27, () -> {
        return Ingredient.fromItems(ModItems.PERIDOT);
    }),

    RUBY_PAXEL(3, 2163, 7.0F, 4, 24, () -> {
        return Ingredient.fromItems(ModItems.RUBY);
    }),

    SAPPHIRE_PAXEL(2, 1683, 6.0F, 3, 26, () -> {
        return Ingredient.fromItems(ModItems.SAPPHIRE);
    }),

    TOPAZ_PAXEL(4, 0, 14.0F, 6, 20, () -> {
        return Ingredient.fromItems(ModItems.TOPAZ);
    }),

    WITHERED_PAXEL(4, 0, 16.0F, 7, 17, () -> {
        return Ingredient.fromItems(Items.NETHER_STAR, Items.WITHER_SKELETON_SKULL);
    }),

    WOODEN_PAXEL(0, 177, 2.0F, 0, 15, () -> {
        return Ingredient.fromItems(Blocks.OAK_PLANKS, Blocks.SPRUCE_PLANKS, Blocks.ACACIA_PLANKS, Blocks.BIRCH_PLANKS, Blocks.DARK_OAK_PLANKS, Blocks.JUNGLE_PLANKS);
    }),

    //Pickaxe Materials
    VMPICK(1, 18200, 4.0F, 1, 10, () -> {
        return Ingredient.fromItems(Items.IRON_INGOT);
    }),

    //Sword Materials
    AMAZONITE_SWORD(0, 1949, 0.0F, 4, 37, () -> {
        return Ingredient.fromItems(ModItems.AMAZONITE);
    }),

    AMETHYST_SWORD(0, 873, 0.0F, 4, 31, () -> {
        return Ingredient.fromItems(ModItems.AMETHYST);
    }),

    EMERALD_SWORD(0, 2149, 0.0F, 4, 17, () -> {
        return Ingredient.fromItems(Items.EMERALD);
    }),

    PERIDOT_SWORD(0, 492, 0.0F, 2, 27, () -> {
        return Ingredient.fromItems(ModItems.PERIDOT);
    }),

    RUBY_SWORD(0, 721, 0.0F, 4, 24, () -> {
        return Ingredient.fromItems(ModItems.RUBY);
    }),

    SAPPHIRE_SWORD(0, 561, 0.0F, 3, 26, () -> {
        return Ingredient.fromItems(ModItems.SAPPHIRE);
    }),

    TOPAZ_SWORD(0, 0, 0.0F, 6, 20, () -> {
        return Ingredient.fromItems(ModItems.TOPAZ);
    }),

    WITHERED_SWORD(0, 0, 0.0F, 7, 17, () -> {
        return Ingredient.fromItems(Items.WITHER_SKELETON_SKULL, Items.NETHER_STAR);
    });

    public final int harvestLevel;
    public final int maxUses;
    public final float efficiency;
    public final float attackDamage;
    public final int enchantability;
    public final LazyLoadBase<Ingredient> repairMaterial;

    ToolMaterials(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> p_i48458_8_) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyLoadBase(p_i48458_8_);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
