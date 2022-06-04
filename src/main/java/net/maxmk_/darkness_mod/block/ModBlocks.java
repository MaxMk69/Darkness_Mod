package net.maxmk_.darkness_mod.block;

import net.maxmk_.darkness_mod.DarknessMod;
import net.maxmk_.darkness_mod.block.custom.ModFlammableRotatedPillarBlock;
import net.maxmk_.darkness_mod.item.DarknessModTab;
import net.maxmk_.darkness_mod.item.ModItems;
import net.maxmk_.darkness_mod.item.custom.b6m9fFruitBushBlock;
import net.maxmk_.darkness_mod.world.feature.tree.MateriesTreeSmallGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DarknessMod.MOD_ID);

    public static final RegistryObject<Block> DARK_MATTER = registerBlock("dark_matter",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);

    //Wood
    public static final RegistryObject<Block> DARK_TIMBER_LOG = registerBlock("dark_timber_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_TIMBER_WOOD = registerBlock("dark_timber_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> STRIPPED_DARK_TIMBER_LOG = registerBlock("stripped_dark_timber_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> STRIPPED_DARK_TIMBER_WOOD = registerBlock("stripped_dark_timber_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_TIMBER_PLANKS = registerBlock("dark_timber_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 12;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 3;
                }
            }, DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> MATERIES_LEAVES = registerBlock("materies_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.of(Material.LEAVES).strength(0.4f).sound(SoundType.AZALEA_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 50;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }
            }, DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> MATERIES_SAPLING = registerBlock("materies_sapling",
            () -> new SaplingBlock(new MateriesTreeSmallGrower(), BlockBehaviour.Properties.of(Material.GRASS).strength(0.1f)
                    .sound(SoundType.GRASS)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_TIMBER_FENCE = registerBlock("dark_timber_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_TIMBER_FENCE_GATE = registerBlock("dark_timber_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_TIMBER_STAIRS = registerBlock("dark_timber_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_TIMBER_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_TIMBER_SLAB = registerBlock("dark_timber_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_TIMBER_DOOR = registerBlock("dark_timber_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD).noOcclusion()), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_TIMBER_TRAPDOOR = registerBlock("dark_timber_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD).noOcclusion()), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_TIMBER_BUTTON = registerBlock("dark_timber_button",
            () -> new WoodButtonBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD).noCollission()), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_TIMBER_PRESSURE_PLATE = registerBlock("dark_timber_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.MOBS, BlockBehaviour.Properties.of(Material.WOOD).strength(5f)
                    .requiresCorrectToolForDrops()), DarknessModTab.DARKNESSMOD_TAB);

    //Stone
    public static final RegistryObject<Block> DARK_STONE = registerBlock("dark_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_STONE_STAIRS = registerBlock("dark_stone_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_STONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_STONE_BRICK_STAIRS = registerBlock("dark_stone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_STONE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_STONE_SLAB = registerBlock("dark_stone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_STONE_BRICK_SLAB = registerBlock("dark_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_STONE_WALL = registerBlock("dark_stone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_STONE_BRICK_WALL = registerBlock("dark_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE).strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> DARK_STONE_BRICKS = registerBlock("dark_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);

    //Eregie
    public static final RegistryObject<Block> EREGIE_ORE = registerBlock("eregie_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(8f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> EREGIE_BLOCK = registerBlock("eregie_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)), DarknessModTab.DARKNESSMOD_TAB);

    //Other
    public static final RegistryObject<Block> DARKCORE = registerBlock("darkcore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(52f, 1250f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);

    public static final RegistryObject<Block> DARK_DUST = registerBlock("dark_dust",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.7f).sound(SoundType.GRAVEL)
                    .isSuffocating((p_61036_, p_61037_, p_61038_) -> true)), DarknessModTab.DARKNESSMOD_TAB);

    public static final RegistryObject<Block> EVIL_BLOCK= registerBlock("evil_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).lightLevel((p_50872_) -> {return 3;})
                    .requiresCorrectToolForDrops().sound(SoundType.ANCIENT_DEBRIS)), DarknessModTab.DARKNESSMOD_TAB);

    //Flower/Crop
    public static final RegistryObject<Block> FRAZIA = registerBlock("frazia",
            () -> new FlowerBlock(MobEffects.DAMAGE_BOOST, 0,BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion()), DarknessModTab.DARKNESSMOD_TAB);
    public static final RegistryObject<Block> B6M9_FRUIT_BUSH = registerBlockWithoutBlockItem("b6m9_fruitbush",
            () -> new b6m9fFruitBushBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
