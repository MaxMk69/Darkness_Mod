package net.maxmk_.darkness_mod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties B6M9_FRUIT = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.0F).build();
    public static final FoodProperties GOLDEN_B6M9_FRUIT = (new FoodProperties.Builder()).nutrition(4).saturationMod(1.2F)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 150, 2), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.HUNGER, 90, 2), 0.1F)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2400, 1), 1.0F)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1), 1.0F).alwaysEat().build();
}
