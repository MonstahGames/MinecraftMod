package com.monstahhh.blockmod.item;

import com.monstahhh.blockmod.Blockmod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ItemTransformer extends Item
{
    public ItemTransformer(String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Blockmod.tab);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add("Turns Oak Doors into Bedrock.");
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (worldIn.getBlockState(pos).getBlock() == Blocks.GRASS)
        {
            worldIn.setBlockState(pos, Blocks.BEDROCK.getDefaultState());
            player.sendMessage(new TextComponentTranslation("Woah, that's mean"));
        }
        return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
    }
    public void registerItemModel()
    {
        Blockmod.proxy.registerItemRenderer(this, 0, "item_transformer");
    }
}
