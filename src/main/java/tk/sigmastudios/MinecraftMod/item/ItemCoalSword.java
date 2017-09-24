package tk.sigmastudios.MinecraftMod.item;

import net.minecraft.item.ItemSword;
import tk.sigmastudios.MinecraftMod.MinecraftMod;

public class ItemCoalSword extends ItemSword
{
    public ItemCoalSword (ToolMaterial material, String name)
    {
        super(material);
        setUnlocalizedName(name);

        setCreativeTab(MinecraftMod.tab);
    }

}
