package com.monstahhh.blockmod.blocks;

import com.monstahhh.blockmod.Blockmod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks
{
    public static JeffOre jeffOre = new JeffOre("jeff_ore").setCreativeTab(Blockmod.tab);

    public static void register(IForgeRegistry<Block> registry)
    {
        registry.registerAll();
    }
    public static void registerItemBlocks(IForgeRegistry<Item> registry)
    {
        registry.registerAll(jeffOre.createItemBlock());
    }
    public static void registerItemModels ()
    {
        jeffOre.registerItemModel(Item.getItemFromBlock(jeffOre));
    }
}
