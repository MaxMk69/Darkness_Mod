package net.maxmk_.darkness_mod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import javax.annotation.Nullable;

public class CharredEnergy extends Item {
    public CharredEnergy(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 3400;
    }
}
