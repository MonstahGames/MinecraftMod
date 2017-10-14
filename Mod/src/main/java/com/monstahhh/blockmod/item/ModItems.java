package com.monstahhh.blockmod.item;

import com.monstahhh.blockmod.blocks.JeffOre;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{
    public static ExplosiveSword expsword = new ExplosiveSword("expsword");

    public static Item.ToolMaterial JEFFSWORD = EnumHelper.addToolMaterial("JEFFSWORD", 3, 9000, 9000, 1000000, 1);
    public static JeffSword jeffSword = new JeffSword("jeff_sword", JEFFSWORD);



    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(expsword, jeffSword);
    }
    public static void registerModels ()
    {
        expsword.registerItemModel();
        jeffSword.registerItemModel();
    }
}
