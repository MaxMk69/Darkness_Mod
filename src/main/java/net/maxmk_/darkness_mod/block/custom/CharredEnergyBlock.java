package net.maxmk_.darkness_mod.block.custom;

import net.maxmk_.darkness_mod.DarknessMod;
import net.maxmk_.darkness_mod.item.DarknessModTab;
import net.maxmk_.darkness_mod.item.ModItems;
import net.maxmk_.darkness_mod.item.custom.CharredEnergyBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class CharredEnergyBlock {

    public static final DeferredRegister<Block> CharredEnergyBlock =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DarknessMod.MOD_ID);

    public static final RegistryObject<Block> CHARRED_ENERGY_BLOCK = register("charred_energy_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).lightLevel((p_50872_) -> {return 1;})
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)), DarknessModTab.DARKNESSMOD_TAB);

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = CharredEnergyBlock.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new CharredEnergyBlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register (IEventBus eventBus) {
        CharredEnergyBlock.register(eventBus);
    }
}
