package net.maxmk_.darkness_mod.world;

import net.maxmk_.darkness_mod.DarknessMod;
import net.maxmk_.darkness_mod.world.gen.ModFlowerGeneration;
import net.maxmk_.darkness_mod.world.gen.ModOreGeneration;
import net.maxmk_.darkness_mod.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DarknessMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
    }
}
