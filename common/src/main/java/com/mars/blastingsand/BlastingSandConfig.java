package com.mars.blastingsand;

import com.google.common.collect.Lists;
import com.mars.deimos.config.DeimosConfig;

import java.util.List;

public class BlastingSandConfig extends DeimosConfig {
    @Entry public static boolean show_wishful_recipes_message = true;
    @Entry public static List<String> sand_list = Lists.newArrayList("minecraft:sand", "minecraft:red_sand");
}
