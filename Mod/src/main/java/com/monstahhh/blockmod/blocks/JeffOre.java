package com.monstahhh.blockmod.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class JeffOre extends JeffIngot
{
    public JeffOre(String name)
    {
        super(Material.ROCK, name);
        setHardness(3f);
        setResistance(3f);
    }
    @Override
    public JeffOre setCreativeTab(CreativeTabs tab)
    {
        super.setCreativeTab(tab);
        return this;
    }
}
