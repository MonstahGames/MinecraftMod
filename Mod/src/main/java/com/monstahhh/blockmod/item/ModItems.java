package com.monstahhh.blockmod.item;

import com.monstahhh.blockmod.item.Consumable.CheeseCookie;
import com.monstahhh.blockmod.item.Consumable.DankCheese;
import com.monstahhh.blockmod.item.Consumable.DankCookie;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.registries.IForgeRegistry;

public class ModItems
{

    public static Item.ToolMaterial JEFFSWORD = EnumHelper.addToolMaterial("JEFFSWORD", 3, 9000, 9000, 1000000, 1);
    public static Item.ToolMaterial JEFFPICKAXE = EnumHelper.addToolMaterial("JEFFPICKAXE", 3, 15000, 1500, 1, 1);

    public static JeffSword jeffSword = new JeffSword("jeff_sword", JEFFSWORD);
    public static DankCheese dankCheese = new DankCheese(1, 1.0f, false, "dank_cheese");
    public static DankCookie dankCookie = new DankCookie(2, 1.0f, false, "dank_cookie");
    public static CheeseCookie cheeseCookie = new CheeseCookie(4, 1.0f, true, "cheese_cookie");
    public static JeffPickaxe jeffPickaxe = new JeffPickaxe(JEFFPICKAXE, "jeff_pickaxe");
    public static ItemTransformer itemTransformer = new ItemTransformer("item_transformer");

    public static void register(IForgeRegistry<Item> registry)
    {
        registry.registerAll(jeffSword, dankCheese, dankCookie, cheeseCookie, jeffPickaxe, itemTransformer);
    }
    public static void registerModels ()
    {
        dankCheese.registerItemModel();
        dankCookie.registerItemModel();
        jeffSword.registerItemModel();
        itemTransformer.registerItemModel();
        jeffPickaxe.registerItemModel();
        cheeseCookie.registerItemModel();
    }
}
