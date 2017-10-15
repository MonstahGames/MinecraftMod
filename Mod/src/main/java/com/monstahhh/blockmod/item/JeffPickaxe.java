package com.monstahhh.blockmod.item;

import com.monstahhh.blockmod.Blockmod;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class JeffPickaxe extends ItemPickaxe
{
    public JeffPickaxe(ToolMaterial material, String name)
    {
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Blockmod.tab);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
    public void registerItemModel()
    {
        Blockmod.proxy.registerItemRenderer(this, 0, "jeff_pickaxe");
    }
}
