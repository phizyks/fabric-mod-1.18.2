package net.phizyks.coolmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DOLPHIN_IN_A_BUCKET = new FoodComponent.Builder().hunger(10).saturationModifier(10f).statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 12000, 0), 1.0f).alwaysEdible().build();
}
