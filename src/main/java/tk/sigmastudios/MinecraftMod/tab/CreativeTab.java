package tk.sigmastudios.MinecraftMod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.lang.String;

public class CreativeTab extends CreativeTabs
{
    public CreativeTab(int index, String label)
    {
            super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.REDSTONE;
    }
}
