package net.maxmk_.darkness_mod.item.custom;

import net.maxmk_.darkness_mod.item.ModItems;
import net.maxmk_.darkness_mod.util.ModBlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier EREGIE = new ForgeTier(5, 3000, 11f,
            5f, 22, ModBlockTags.NEEDS_EREGIE_TOOL,
            () -> Ingredient.of(ModItems.EREGIE_INGOT.get()));
}
