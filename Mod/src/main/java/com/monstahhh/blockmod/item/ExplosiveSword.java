package com.monstahhh.blockmod.item;

import com.monstahhh.blockmod.Blockmod;
import net.minecraft.item.Item;

public class ExplosiveSword extends Item {
    public ExplosiveSword(String name) {
        setUnlocalizedName(name);
        setCreativeTab(Blockmod.tab);
        setMaxStackSize(1);
        setRegistryName(name);
    }

    public void registerItemModel() {
        Blockmod.proxy.registerItemRenderer(this, 0, "expsword");
    }

}
