package com.sigmastudios.monstahmod;

import com.sigmastudios.monstahmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MonstahMod.MODID, version = MonstahMod.VERSION, name = MonstahMod.NAME)
public class MonstahMod
{
    public static final String MODID = "monstahmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "MonstahMod";

    @SidedProxy(clientSide = "import com.sigmastudios.monstahmod.proxy.ClientProxy", serverSide = "import com.sigmastudios.monstahmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static MonstahMod instance;
    
    @EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }
    @EventHandler
    public void init (FMLInitializationEvent event)
    {
        proxy.Init(event);
    }
    @EventHandler
    public void postInit (FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
