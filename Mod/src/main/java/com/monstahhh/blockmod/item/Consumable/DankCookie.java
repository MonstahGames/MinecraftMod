package com.monstahhh.blockmod.item.Consumable;

import com.monstahhh.blockmod.Blockmod;
import net.minecraft.item.ItemFood;

public class DankCookie extends ItemFood
{
    public DankCookie(int amount, float saturation, boolean isWolfFood, String name)
    {
        super(amount, saturation, isWolfFood);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Blockmod.tab);
    }

    public void registerItemModel()
    {
        Blockmod.proxy.registerItemRenderer(this, 0, "dank_cookie");
    }
}
