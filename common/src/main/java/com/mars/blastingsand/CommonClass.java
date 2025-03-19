package com.mars.blastingsand;

import com.mars.deimos.config.DeimosConfig;
import com.mars.deimos.datagen.DeimosRecipeGenerator;
import net.minecraft.resources.ResourceLocation;

import static com.mars.blastingsand.Constants.MOD_ID;

public class CommonClass {
    public static void init() {
        DeimosConfig.init(MOD_ID, BlastingSandConfig.class);

        for (String sand : BlastingSandConfig.sand_list) {
            DeimosRecipeGenerator.createBlastingJson(ResourceLocation.parse(sand), ResourceLocation.withDefaultNamespace("glass"), 100, 0.1F);
        }
    }
}
