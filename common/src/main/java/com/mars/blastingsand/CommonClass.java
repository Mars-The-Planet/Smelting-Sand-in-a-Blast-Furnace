package com.mars.blastingsand;

import com.mars.blastingsand.platform.Services;
import com.mars.deimos.config.DeimosConfig;
import com.mars.deimos.datagen.DeimosRecipeGenerator;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import static com.mars.blastingsand.Constants.MOD_ID;

public class CommonClass {
    public static void init() {
        DeimosConfig.init(MOD_ID, BlastingSandConfig.class);

        for (String sand : BlastingSandConfig.sand_list) {
            DeimosRecipeGenerator.createBlastingJson(ResourceLocation.parse(sand), ResourceLocation.withDefaultNamespace("glass"), 100, 0.1F);
        }
    }
}
