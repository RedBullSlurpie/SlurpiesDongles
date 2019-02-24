package com.rbs.slurpiesdongles;

import net.minecraft.init.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Reference {

    public static final String MODID = "slurpiesdongles";

    public static ItemGroup tabSlurpiesDongles = new ItemGroup(ItemGroup.getGroupCountSafe(), "SlurpiesDongles") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.APPLE);
        }
    };

}
