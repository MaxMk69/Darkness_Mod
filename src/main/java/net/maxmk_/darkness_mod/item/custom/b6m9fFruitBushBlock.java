package net.maxmk_.darkness_mod.item.custom;

import net.maxmk_.darkness_mod.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class b6m9fFruitBushBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 6);

    public b6m9fFruitBushBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 6;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.B6M9_FRUIT_SEEDS.get();
    }
}
