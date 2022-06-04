package net.maxmk_.darkness_mod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

public class ModPlacedFeature {

    //Trees
    public static final Holder<PlacedFeature> MATERIES_PLACED = PlacementUtils.register("materies_placed",
            ModConfiguredFeature.MATERIES_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(2, 0.1f, 1)));
    public static final Holder<PlacedFeature> MATERIES_SMALL_PLACED = PlacementUtils.register("materies_small_placed",
            ModConfiguredFeature.MATERIES_SMALL_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.2f, 2)));


    //Flower, bushes
    public static final Holder<PlacedFeature> FRAZIA_PLACED = PlacementUtils.register("frazia_placed",
            ModConfiguredFeature.FRAZIA, RarityFilter.onAverageOnceEvery(16),
            InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> EREGIE_ORE_PLACED = PlacementUtils.register("eregie_ore_placed",
            ModConfiguredFeature.OVERWORLD_EREGIE_ORES, ModOrePlacement.commonOrePlacement(2,
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(30))));
}
