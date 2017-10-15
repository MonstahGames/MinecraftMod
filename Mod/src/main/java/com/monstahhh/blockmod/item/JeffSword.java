package com.monstahhh.blockmod.item;

        import com.monstahhh.blockmod.Blockmod;
        import net.minecraft.entity.player.EntityPlayer;
        import net.minecraft.item.EnumRarity;
        import net.minecraft.item.ItemStack;
        import net.minecraft.item.ItemSword;
        import net.minecraft.util.EnumActionResult;
        import net.minecraft.util.EnumFacing;
        import net.minecraft.util.EnumHand;
        import net.minecraft.util.math.BlockPos;
        import net.minecraft.util.text.ITextComponent;
        import net.minecraft.util.text.Style;
        import net.minecraft.util.text.TextComponentTranslation;
        import net.minecraft.world.World;

        import java.awt.*;
        import java.util.Iterator;
        import java.util.List;

public class JeffSword extends ItemSword
{
    public JeffSword(String name, ToolMaterial material) {

        super(material);
        this.setUnlocalizedName(name);
        setCreativeTab(Blockmod.tab);
        setMaxStackSize(1);
        setRegistryName(name);
    }
    public void registerItemModel()
    {
        Blockmod.proxy.registerItemRenderer(this, 0, "jeff_sword");
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }
}
