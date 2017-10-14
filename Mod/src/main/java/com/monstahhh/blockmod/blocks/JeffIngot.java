package com.monstahhh.blockmod.blocks;

import com.monstahhh.blockmod.Blockmod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class JeffIngot extends Block
{
    protected String name;
    public JeffIngot(Material material, String name)
    {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
    }
    public void registerItemModel(Item itemBlock)
    {
        Blockmod.proxy.registerItemRenderer(itemBlock, 0, name);
    }
    public Item createItemBlock()
    {
        return new ItemBlock(this).setRegistryName(getRegistryName());
    }
    @Override
    public JeffIngot setCreativeTab(CreativeTabs tab)
    {
        super.setCreativeTab(tab);
        return this;
    }
}
