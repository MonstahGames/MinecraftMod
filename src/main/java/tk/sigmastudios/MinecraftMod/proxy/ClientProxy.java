package tk.sigmastudios.MinecraftMod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import tk.sigmastudios.MinecraftMod.item.ModItems;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        ModItems.RegisterRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
