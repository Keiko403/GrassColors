package keiko403.grasscolors.startup;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import keiko403.grasscolors.init.BlockList;



import static net.minecraftforge.common.MinecraftForge.EVENT_BUS;

public class ClientStuff {
    public static void clientStuff() {
        RenderTypeLookup.setRenderLayer(BlockList.RedEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.BlueEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.LimeEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.YellowEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.LightGrayEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.LightBlueEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.OrangeEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.GreenEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.BlackEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.WhiteEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.GrayEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.CyanEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.PinkEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.MagentaEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.BrownEarth.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockList.PurpleEarth.get(), RenderType.getCutout());
    }

}