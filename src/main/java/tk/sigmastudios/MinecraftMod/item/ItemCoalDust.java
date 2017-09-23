package tk.sigmastudios.MinecraftMod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import tk.sigmastudios.MinecraftMod.MinecraftMod;

import java.util.List;

public class ItemCoalDust extends Item
{
    public ItemCoalDust (String name)
    {
        setUnlocalizedName(name);
        setCreativeTab(MinecraftMod.tab);
        setMaxStackSize(32);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
    {
        return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
    }
    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        tooltip.add("Magically turns Stone into a Coal Block.");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }
    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        if (worldIn.getBlockState(pos).getBlock() == Blocks.STONE)
        {
            worldIn.setBlockState(pos, Blocks.COAL_BLOCK.getDefaultState());
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }
    @Override
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }

}
