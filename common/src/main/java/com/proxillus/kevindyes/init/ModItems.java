package com.proxillus.kevindyes.init;

import com.proxillus.kevindyes.platform.Services;
import com.proxillus.kevindyes.platform.util.RegistryHandle;
import net.minecraft.world.item.Item;

public final class ModItems {
    private ModItems() {
    }

    public static void load() {
    }

    public static final RegistryHandle<Item> EXAMPLE_ITEM = Services.REGISTRY.registerItem("example_item",
            properties -> new Item(properties.stacksTo(32)));

    public static final RegistryHandle<Item> EXAMPLE_ITEM2 = Services.REGISTRY.registerItem("example_item2",
            Item::new);
}
