package com.mars.blastingsand;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class BlastingSand {
    public BlastingSand(IEventBus eventBus) {
        CommonClass.init();
    }
}
