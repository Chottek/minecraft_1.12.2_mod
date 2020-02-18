package com.fox.foxmods;

import com.fox.foxmods.init.ModRecipes;
import com.fox.foxmods.proxy.CommonProxy;
import com.fox.foxmods.tabs.FoxTab;
import com.fox.foxmods.tabs.FoxToolsTab;
import com.fox.foxmods.util.Reference;
import com.fox.foxmods.util.handlers.RenderGuiHandler;
import com.fox.foxmods.vanilla.VanillaChanger;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    public static FoxTab foxTab = new FoxTab("foxtab");
    public static FoxToolsTab foxToolsTab = new FoxToolsTab("foxtoolstab");
    public static VanillaChanger vanillaChanger = new VanillaChanger();

    @Instance
    public static Main instance;


    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public static void init(FMLInitializationEvent event){
        ModRecipes.init();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
    }

}
