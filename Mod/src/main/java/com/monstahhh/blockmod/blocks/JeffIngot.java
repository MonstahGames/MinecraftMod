package com.monstahhh.blockmod.blocks;

import com.monstahhh.blockmod.Blockmod;
import net.minecraft.item.Item;

public class JeffIngot extends Item
{
    public JeffIngot(String name)
    {
        super();
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Blockmod.tab);
    }

    public void registerItemModel()
    {
        Blockmod.proxy.registerItemRenderer(this, 0, "jeff_ingot");
    }
    //public Item createItemBlock()
    //{
    //    return new ItemBlock(this).setRegistryName(getRegistryName());
    //}
}
