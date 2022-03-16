package net.phizyks.coolmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.phizyks.coolmod.Cool_Mod;
import net.phizyks.coolmod.item.custom.DowsingRodItem;


public class moditems {

    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(moditemgroup.MYTHRIL)));

    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(moditemgroup.MYTHRIL)));

    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(moditemgroup.MYTHRIL)));

    public static final Item DOWSING_ROD = registerItem("dowsing_rod",
            new DowsingRodItem(new FabricItemSettings().group(moditemgroup.MYTHRIL).maxDamage(32)));

    public static final Item NORMAL_LOOKING_COAL = registerItem("normal_looking_coal",
            new DowsingRodItem(new FabricItemSettings().group(moditemgroup.MYTHRIL)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Cool_Mod.MOD_ID,name), item);
    }

    public static void registermoditems(){
        Cool_Mod.LOGGER.info("Registering mod items for "+ Cool_Mod.MOD_ID);
    }

}
