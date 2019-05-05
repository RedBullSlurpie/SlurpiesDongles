package com.rbs.slurpiesdongles.events;

import com.rbs.slurpiesdongles.init.ModFood;
import com.rbs.slurpiesdongles.init.ModItems;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class MobDrops {

    public static double rand;

    @SubscribeEvent
    public void onEntityDrop(LivingDropsEvent event) {

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
