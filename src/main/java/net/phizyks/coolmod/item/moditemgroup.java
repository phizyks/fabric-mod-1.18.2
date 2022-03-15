package net.phizyks.coolmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.phizyks.coolmod.Cool_Mod;

public class moditemgroup {

    public static final ItemGroup MYTHRIL = FabricItemGroupBuilder.build(new Identifier(Cool_Mod.MOD_ID, "mythril"), ()-> new ItemStack(moditems.MYTHRIL_INGOT));

}
