package com.monstahhh.blockmod;

import com.monstahhh.blockmod.blocks.ModBlocks;
import com.monstahhh.blockmod.item.ModItems;
import com.monstahhh.blockmod.proxy.CommonProxy;
import com.monstahhh.blockmod.tab.CreativeTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod(modid = Blockmod.MODID, version = Blockmod.VERSION, name = Blockmod.NAME)
public class Blockmod
{
    public static final String MODID = "blockmod";
    public static final String NAME = "Monstahhh's Blockmod";
    public static final String VERSION = "1.0";

    public static final String CLProxy = "com.monstahhh.blockmod.proxy.ClientProxy";
    public static final String CProxy = "com.monstahhh.blockmod.proxy.CommonProxy";

    @SidedProxy(clientSide = CLProxy, serverSide = CProxy)
    public static CommonProxy proxy;

    @Mod.Instance
    public static Blockmod instance;

    @Mod.EventBusSubscriber
    public static class RegistrationHandler
    {
        @SubscribeEvent
        public static void registerBlocks(RegistryEvent.Register<Block> event)
        {
            ModBlocks.register(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerItems(RegistryEvent.Register<Item> event)
        {
            ModItems.register(event.getRegistry());
            ModBlocks.registerItemBlocks(event.getRegistry());
        }
        @SubscribeEvent
        public static void registerItem (ModelRegistryEvent event)
        {
            ModItems.registerModels();
            ModBlocks.registerItemModels();
        }
    }

    public static CreativeTab tab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        tab = new CreativeTab(CreativeTabs.getNextID(), "blockmod_tab");
        proxy.preInit(event);
    }
    @EventHandler
    public void init (FMLInitializationEvent event)
    {
        proxy.init(event);
    }
    @EventHandler
    public  void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
