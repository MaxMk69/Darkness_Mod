package net.maxmk_.darkness_mod.util;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> NEEDS_EREGIE_TOOL = create("needs_eregie_tool");
    public static final TagKey<Block> DARK_MATTER_ORE_REPLACEABLES = create("dark_matter_ore_replaceables");

    public ModBlockTags() {
    }

    public static TagKey<Block> create(String name) {
        return TagKey.create(Registry.BLOCK_REGISTRY, new ResourceLocation(name));
    }

    public static TagKey<Block> create(ResourceLocation name) {
        return TagKey.create(Registry.BLOCK_REGISTRY, name);
    }
}
