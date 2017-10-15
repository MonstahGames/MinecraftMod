package com.monstahhh.blockmod.item.Consumable;

import com.monstahhh.blockmod.Blockmod;
import net.minecraft.item.ItemFood;

public class CheeseCookie extends ItemFood
{
    public CheeseCookie (int amount, float saturation, Boolean isWolfFood, String name)
    {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Blockmod.tab);
    }
    public void registerItemModel()
    {
        Blockmod.proxy.registerItemRenderer(this, 0, "cheese_cookie");
    }
}
