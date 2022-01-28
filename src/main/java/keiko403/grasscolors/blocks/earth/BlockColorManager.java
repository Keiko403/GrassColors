package keiko403.grasscolors.blocks.earth;

import keiko403.grasscolors.init.BlockList;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockColorManager {
    @SubscribeEvent
    public static void onItemColorsInit(ColorHandlerEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();
        final ItemColors itemColors = event.getItemColors();

        IBlockColor iBlockColorRed = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#FF0000");
        IBlockColor iBlockColorBlue = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#02198B");
        IBlockColor iBlockColorLime = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#C8F902");
        IBlockColor iBlockColorYellow = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#FDFD66");
        IBlockColor iBlockColorLightGray = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#D3D3D3");
        IBlockColor iBlockColorLightBlue = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#89CFF0");
        IBlockColor iBlockColorOrange = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#FE6E00");
        IBlockColor iBlockColorGreen = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#228C22");
        IBlockColor iBlockColorBlack = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#000000");
        IBlockColor iBlockColorWhite = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#FFFFFF");
        IBlockColor iBlockColorGray = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#333333");
        IBlockColor iBlockColorCyan = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#00FFFF");
        IBlockColor iBlockColorPink = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#FFC0CB");
        IBlockColor iBlockColorMagenta = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#EC008C");
        IBlockColor iBlockColorBrown = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#663300");
        IBlockColor iBlockColorPurple = (blockState, iEnviromentBlockReader, blockPos, i) -> Integer.decode("#CC8899");

        blockColors.register(iBlockColorRed, BlockList.RedEarth.get());
        blockColors.register(iBlockColorBlue, BlockList.BlueEarth.get());
        blockColors.register(iBlockColorLime, BlockList.LimeEarth.get());
        blockColors.register(iBlockColorYellow, BlockList.YellowEarth.get());
        blockColors.register(iBlockColorLightGray, BlockList.LightGrayEarth.get());
        blockColors.register(iBlockColorLightBlue, BlockList.LightBlueEarth.get());
        blockColors.register(iBlockColorOrange, BlockList.OrangeEarth.get());
        blockColors.register(iBlockColorGreen, BlockList.GreenEarth.get());
        blockColors.register(iBlockColorBlack, BlockList.BlackEarth.get());
        blockColors.register(iBlockColorWhite, BlockList.WhiteEarth.get());
        blockColors.register(iBlockColorGray, BlockList.GrayEarth.get());
        blockColors.register(iBlockColorCyan, BlockList.CyanEarth.get());
        blockColors.register(iBlockColorPink, BlockList.PinkEarth.get());
        blockColors.register(iBlockColorMagenta, BlockList.MagentaEarth.get());
        blockColors.register(iBlockColorBrown, BlockList.BrownEarth.get());
        blockColors.register(iBlockColorPurple, BlockList.PurpleEarth.get());

        IItemColor itemBlockColourHandler = (stack, tintIndex) ->
        {
            BlockState state = ((BlockItem) stack.getItem()).getBlock().getDefaultState();
            return blockColors.getColor(state, null, null, tintIndex);
        };
        if (itemBlockColourHandler != null) {
            itemColors.register(itemBlockColourHandler, BlockList.RedEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.BlueEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.LimeEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.YellowEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.LightGrayEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.LightBlueEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.OrangeEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.GreenEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.BlackEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.WhiteEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.GrayEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.CyanEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.PinkEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.MagentaEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.BrownEarth.get());
            itemColors.register(itemBlockColourHandler, BlockList.PurpleEarth.get());
        }
    }
}