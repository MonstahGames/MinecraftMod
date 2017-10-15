package com.monstahhh.blockmod.item.Consumable;

import com.monstahhh.blockmod.Blockmod;
import net.minecraft.item.ItemFood;

public class DankCheese extends ItemFood
{
    public DankCheese(int amount, float saturation, boolean isWolfFood, String name)
    {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Blockmod.tab);
    }

    public void registerItemModel()
    {
        Blockmod.proxy.registerItemRenderer(this, 0, "dank_cheese");
    }
}
