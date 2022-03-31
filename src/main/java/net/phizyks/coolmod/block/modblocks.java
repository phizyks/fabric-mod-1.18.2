package net.phizyks.coolmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.phizyks.coolmod.Cool_Mod;
import net.phizyks.coolmod.block.custom.*;
import net.phizyks.coolmod.item.moditemgroup;
import net.phizyks.coolmod.item.moditems;

public class modblocks {

    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), moditemgroup.MYTHRIL);

    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), moditemgroup.MYTHRIL);

    public static final Block NETHERRACK_MYTHRIL_ORE = registerBlock("netherrack_mythril_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), moditemgroup.MYTHRIL);

    public static final Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), moditemgroup.MYTHRIL);

    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), moditemgroup.MYTHRIL);

    public static final Block SPEEDY_BLOCK = registerBlock("speedy_block",
            new speedyBlock(FabricBlockSettings.of(Material.METAL).strength(1f)), moditemgroup.MYTHRIL);

    public static final Block MYTHRIL_BUTTON = registerBlock("mythril_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool().noCollision()), moditemgroup.MYTHRIL);

    public static final Block MYTHRIL_PRESSURE_PLATE = registerBlock("mythril_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), moditemgroup.MYTHRIL);

    public static final Block MYTHRIL_FENCE = registerBlock("mythril_fence",
            new FenceBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), moditemgroup.MYTHRIL);

    public static final Block MYTHRIL_FENCE_GATE = registerBlock("mythril_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), moditemgroup.MYTHRIL);

    public static final Block MYTHRIL_SLAB = registerBlock("mythril_slab",
            new SlabBlock(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), moditemgroup.MYTHRIL);

    public static final Block MYTHRIL_STAIRS = registerBlock("mythril_stairs",
            new modStairsBlock(modblocks.MYTHRIL_BLOCK.getDefaultState(),FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), moditemgroup.MYTHRIL);

    public static final Block KAUPEN_DOOR = registerBlock("kaupen_door",
            new modDoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()), moditemgroup.MYTHRIL);

    public static final Block KAUPEN_TRAPDOOR = registerBlock("kaupen_trapdoor",
            new modTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()), moditemgroup.MYTHRIL);


    private static Block registerBlock(String name,Block  block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Cool_Mod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Cool_Mod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        Cool_Mod.LOGGER.info("Registering mod blocks for"+Cool_Mod.MOD_ID);
    }
}
