package net.maxmk_.darkness_mod;

import com.mojang.logging.LogUtils;
import net.maxmk_.darkness_mod.block.ModBlocks;
import net.maxmk_.darkness_mod.block.custom.CharredEnergyBlock;
import net.maxmk_.darkness_mod.item.ModItems;
import net.maxmk_.darkness_mod.util.ModItemProperties;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DarknessMod.MOD_ID)
public class DarknessMod
{
    public static final String MOD_ID = "darkness_mod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DarknessMod()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        CharredEnergyBlock.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        //Blocks
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_TIMBER_DOOR.get(), RenderType.solid());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_TIMBER_TRAPDOOR.get(), RenderType.solid());

        //Plants, Crops
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.FRAZIA.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.B6M9_FRUIT_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MATERIES_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MATERIES_LEAVES.get(), RenderType.cutout());

        //Other
        ModItemProperties.addCustomItemProperties();
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
