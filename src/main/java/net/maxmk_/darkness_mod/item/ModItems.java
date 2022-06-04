package net.maxmk_.darkness_mod.item;

import net.maxmk_.darkness_mod.DarknessMod;
import net.maxmk_.darkness_mod.block.ModBlocks;
import net.maxmk_.darkness_mod.item.custom.CharredEnergy;
import net.maxmk_.darkness_mod.item.custom.ModTiers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DarknessMod.MOD_ID);


    //Tools
    public static final RegistryObject<Item> EREGIE_SWORD = ITEMS.register("eregie_sword",
            () -> new SwordItem(ModTiers.EREGIE, 10, 1.2f, new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));
    public static final RegistryObject<Item> EREGIE_PICKAXE = ITEMS.register("eregie_pickaxe",
            () -> new PickaxeItem(ModTiers.EREGIE, 7, 2.6f, new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));
    public static final RegistryObject<Item> EREGIE_AXE = ITEMS.register("eregie_axe",
            () -> new AxeItem(ModTiers.EREGIE, 9, 1f, new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));
    public static final RegistryObject<Item> EREGIE_SHOVEL = ITEMS.register("eregie_shovel",
            () -> new ShovelItem(ModTiers.EREGIE, 8, 1f, new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));
    public static final RegistryObject<Item> EREGIE_HOE = ITEMS.register("eregie_hoe",
            () -> new HoeItem(ModTiers.EREGIE, 2, 4f, new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));

    public static final RegistryObject<Item> DOUBLEBOW = ITEMS.register("doublebow",
            () -> new BowItem(new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB).durability(810)));

    // Armor
    public static final RegistryObject<Item> EREGIE_HELMET = ITEMS.register("eregie_helmet",
            () -> new ArmorItem(ModArmorMaterials.EREGIE, EquipmentSlot.HEAD, new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));
    public static final RegistryObject<Item> EREGIE_CHESTPLATE = ITEMS.register("eregie_chestplate",
            () -> new ArmorItem(ModArmorMaterials.EREGIE, EquipmentSlot.CHEST, new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));
    public static final RegistryObject<Item> EREGIE_LEGGINGS = ITEMS.register("eregie_leggings",
            () -> new ArmorItem(ModArmorMaterials.EREGIE, EquipmentSlot.LEGS, new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));
    public static final RegistryObject<Item> EREGIE_BOOTS = ITEMS.register("eregie_boots",
            () -> new ArmorItem(ModArmorMaterials.EREGIE, EquipmentSlot.FEET, new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));


    //Food
    public static final RegistryObject<Item> B6M9_FRUIT = ITEMS.register("b6m9_fruit",
            () -> new Item(new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB).food(ModFoods.B6M9_FRUIT)));
    public static final RegistryObject<Item> GOLDEN_B6M9_FRUIT = ITEMS.register("golden_b6m9_fruit",
            () -> new Item(new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB).food(ModFoods.GOLDEN_B6M9_FRUIT)));

    //Other
    public static final RegistryObject<Item> DARK_MASS = ITEMS.register("dark_mass",
            () -> new Item(new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));

    public static final RegistryObject<Item> DARK_ROD = ITEMS.register("dark_rod",
            () -> new Item(new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));

    public static final RegistryObject<Item> PIECE_OF_EREGIE = ITEMS.register("piece_of_eregie",
            () -> new Item(new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));

    public static final RegistryObject<Item> EREGIE_INGOT = ITEMS.register("eregie_ingot",
            () -> new Item(new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));

    public static final RegistryObject<Item> EVIL = ITEMS.register("evil",
            () -> new Item(new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));

    public static final RegistryObject<Item> CHARRED_ENERGY = ITEMS.register("charred_energy",
            () -> new CharredEnergy(new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));

    public static final RegistryObject<Item> B6M9_FRUIT_SEEDS = ITEMS.register("b6m9_fruit_seeds",
            () -> new ItemNameBlockItem(ModBlocks.B6M9_FRUIT_BUSH.get(), new Item.Properties().tab(DarknessModTab.DARKNESSMOD_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
