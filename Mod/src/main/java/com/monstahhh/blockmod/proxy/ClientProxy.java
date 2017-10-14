package com.monstahhh.blockmod.proxy;

import com.monstahhh.blockmod.Blockmod;
import com.monstahhh.blockmod.item.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    @Override
    public void init(FMLInitializationEvent event)
    {
    }
    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
    }

    @Override
    public void registerItemRenderer(Item item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Blockmod.MODID + ":" + id, "inventory"));
    }
}
