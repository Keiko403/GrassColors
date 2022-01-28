package keiko403.grasscolors;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import keiko403.grasscolors.blocks.earth.GenericEarthBlock;
import keiko403.grasscolors.startup.ClientStuff;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.minecraftforge.common.MinecraftForge.EVENT_BUS;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GrassColors.MOD_ID)
public class GrassColors
{
    public static final String MOD_ID = "grasscolors";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public GrassColors() {

        ModRegistry.register();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);


        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        //EVENT_BUS.register(this);

        EVENT_BUS.register(this);
        EVENT_BUS.addListener(GenericEarthBlock::convertRed);
        EVENT_BUS.addListener(GenericEarthBlock::convertBlue);
        EVENT_BUS.addListener(GenericEarthBlock::convertLime);
        EVENT_BUS.addListener(GenericEarthBlock::convertYellow);
        EVENT_BUS.addListener(GenericEarthBlock::convertLightGray);
        EVENT_BUS.addListener(GenericEarthBlock::convertLightBlue);
        EVENT_BUS.addListener(GenericEarthBlock::convertOrange);
        EVENT_BUS.addListener(GenericEarthBlock::convertGreen);
        EVENT_BUS.addListener(GenericEarthBlock::convertBlack);
        EVENT_BUS.addListener(GenericEarthBlock::convertWhite);
        EVENT_BUS.addListener(GenericEarthBlock::convertGray);
        EVENT_BUS.addListener(GenericEarthBlock::convertCyan);
        EVENT_BUS.addListener(GenericEarthBlock::convertPink);
        EVENT_BUS.addListener(GenericEarthBlock::convertMagenta);
        EVENT_BUS.addListener(GenericEarthBlock::convertBrown);
        EVENT_BUS.addListener(GenericEarthBlock::convertPurple);

    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void doClientStuff(final FMLClientSetupEvent event)
    {
        ClientStuff.clientStuff();
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
    }
}
