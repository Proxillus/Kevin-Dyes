package com.proxillus.kevindyes.init;

import com.proxillus.kevindyes.platform.Services;
import com.proxillus.kevindyes.platform.util.BlockWithItemRegistryHandle;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

public final class ModBlocks {
    private ModBlocks() {
    }

    public static void load() {
    }

    public static final BlockWithItemRegistryHandle<Block> EXAMPLE_BLOCK = Services.REGISTRY.registerBlockWithItem("example_block",
            properties -> new Block(properties.strength(0.8F).sound(SoundType.WOOL)));
    public static final BlockWithItemRegistryHandle<Block> SKY_CONCRETE = Services.REGISTRY.registerBlockWithItem("sky_concrete",
            properties -> new Block(properties.strength(1.8F).sound(SoundType.STONE).requiresCorrectToolForDrops()));

}
