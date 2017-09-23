package tk.sigmastudios.MinecraftMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tk.sigmastudios.MinecraftMod.item.ModItems;
import tk.sigmastudios.MinecraftMod.proxy.CommonProxy;
import tk.sigmastudios.MinecraftMod.tab.CreativeTab;

@Mod(modid = MinecraftMod.MODID, version = MinecraftMod.VERSION, name = MinecraftMod.NAME)
public class MinecraftMod
{
    public static final String MODID = "monstahmod";
    public static final String VERSION = "0.1";
    public static final String NAME = "Monstahhh Mod";
    
    @SidedProxy(clientSide = "tk.sigmastudios.MinecraftMod.proxy.ClientProxy", serverSide = "tk.sigmastudios.MinecraftMod.proxy.CommonProxy")

    public static CommonProxy proxy;

    @Mod.Instance
    public static MinecraftMod instance;

    public static CreativeTab tab;

    @EventHandler
    public  void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("Loading MonstahhhMod...");
        tab = new CreativeTab(CreativeTabs.getNextID(), "tab_tutorial");
        ModItems.preInit(event);
        System.out.println("Done!");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
