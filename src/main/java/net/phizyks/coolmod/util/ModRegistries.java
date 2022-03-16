package net.phizyks.coolmod.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.phizyks.coolmod.Cool_Mod;
import net.phizyks.coolmod.item.moditems;

public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }

    private static void registerFuels() {
        Cool_Mod.LOGGER.info("registering fuel for"+Cool_Mod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(moditems.NORMAL_LOOKING_COAL, 20000);
    }
}
