package net.maxmk_.darkness_mod.world.feature;

import net.maxmk_.darkness_mod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.DarkOakFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.DarkOakTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeature {

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MATERIES_TREE =
            FeatureUtils.register("materies", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.DARK_TIMBER_LOG.get()),
                    new DarkOakTrunkPlacer(8, 4, 3),
                    BlockStateProvider.simple(ModBlocks.MATERIES_LEAVES.get()),
                    new DarkOakFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0)),
                    new ThreeLayersFeatureSize(2, 2, 1, 2, 3, OptionalInt.empty())).ignoreVines().build());

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> MATERIES_TREE_SMALL =
            FeatureUtils.register("materies_small", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.DARK_TIMBER_LOG.get()),
                    new ForkingTrunkPlacer(4, 2, 2),
                    BlockStateProvider.simple(ModBlocks.MATERIES_LEAVES.get()),
                    new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                    new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

    // Small Tree
    public static final Holder<PlacedFeature> MATERIES_SMALL_CHECKED = PlacementUtils.register("materies_small_checked", MATERIES_TREE_SMALL,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.MATERIES_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MATERIES_SMALL_SPAWN =
            FeatureUtils.register("materies_small_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MATERIES_SMALL_CHECKED,
                            0.5F)), MATERIES_SMALL_CHECKED));

    //Big Tree
    public static final Holder<PlacedFeature> MATERIES_CHECKED = PlacementUtils.register("materies_checked", MATERIES_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.MATERIES_SAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> MATERIES_SPAWN =
            FeatureUtils.register("materies__small_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(MATERIES_CHECKED,
                            0.5F)), MATERIES_CHECKED));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> FRAZIA =
            FeatureUtils.register("flower_frazia", Feature.FLOWER,
                    new RandomPatchConfiguration(16, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.FRAZIA.get())))));


      public static final List<OreConfiguration.TargetBlockState> OVERWORLD_EREGIE_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.EREGIE_ORE.get().defaultBlockState()));

      public static final Holder<ConfiguredFeature<OreConfiguration, ?>> EREGIE_ORE = FeatureUtils.register("eregie_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_EREGIE_ORES, 2));
}
