package AgentIj.SCP.TNG;

// Created 12/27/19 by Agent Ij

import AgentIj.SCP.TNG.creativetabs.ScpTngTab;
import AgentIj.SCP.TNG.proxy.CommonProxy;
import AgentIj.SCP.TNG.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.ID,name = Reference.NAME,version = Reference.VERSION,acceptedMinecraftVersions = "[1.12]")
public class scptng {


    public static final CreativeTabs scptngtab = new ScpTngTab("scptngtab-basic");



    @Instance
    public static scptng instance;

    @SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
    public static CommonProxy proxy;


    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {


    }

    @EventHandler
    public static void Init(FMLInitializationEvent event) {
    }


    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
    }






}


