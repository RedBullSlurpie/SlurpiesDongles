package com.rbs.slurpiesdongles;

import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.init.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Reference {

    public static final String MODID = "slurpiesdongles";

    public static ItemGroup tabSlurpiesDongles = new ItemGroup(ItemGroup.getGroupCountSafe(), "SlurpiesDongles") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModFood.HOLYBREAD);
        }
    };

}
