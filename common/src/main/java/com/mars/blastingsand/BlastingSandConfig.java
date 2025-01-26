package com.mars.blastingsand;

import com.mars.deimos.config.DeimosConfig;
import com.google.common.collect.Lists;

import java.util.List;

public class BlastingSandConfig extends DeimosConfig {
    @Entry public static List<String> sand_list = Lists.newArrayList("minecraft:sand", "minecraft:red_sand");
}
