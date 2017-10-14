package com.monstahhh.blockmod.item;

        import com.monstahhh.blockmod.Blockmod;
        import net.minecraft.item.ItemSword;

public class JeffSword extends ItemSword
{
    public JeffSword(String name, ToolMaterial material) {

        super(material);
        this.setUnlocalizedName(name);
        setCreativeTab(Blockmod.tab);
        setMaxStackSize(1);
        setRegistryName(name);
    }
    public void registerItemModel() {
        Blockmod.proxy.registerItemRenderer(this, 0, "jeff_sword");
    }

}
