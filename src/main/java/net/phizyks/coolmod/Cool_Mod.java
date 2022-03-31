package net.phizyks.coolmod;

import net.fabricmc.api.ModInitializer;
import net.phizyks.coolmod.block.modblocks;
import net.phizyks.coolmod.item.ModFoodComponents;
import net.phizyks.coolmod.item.moditems;
import net.phizyks.coolmod.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cool_Mod implements ModInitializer {
	public static final String MOD_ID = "coolmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {

		moditems.registermoditems();
		modblocks.registerModBlocks();
		ModRegistries.registerModStuffs();

	}
}
