package com.rbs.slurpiesdongles.handlers;

import com.rbs.slurpiesdongles.init.ModFood;
import net.minecraft.entity.passive.EntityPig;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class PigDrops {

    public static double rand;

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event){

        if (event.getSource().getDamageType().equals("player")) {

            rand = Math.random();
            if ((event.getEntityLiving() instanceof EntityPig)) {

                if (rand < 0.5D) {
                    event.getEntityLiving().entityDropItem(ModFood.RAW_BACON, 1);

                }
                if (rand < 0.25D) {
                    event.getEntityLiving().entityDropItem(ModFood.RAW_BACON, 1);
                }
            }
        }
    }
}
