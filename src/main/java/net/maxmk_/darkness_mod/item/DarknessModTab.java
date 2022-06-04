package net.maxmk_.darkness_mod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DarknessModTab {
    public static final CreativeModeTab DARKNESSMOD_TAB = new CreativeModeTab("darknessmod_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DARK_MASS.get());
        }
    };
}
