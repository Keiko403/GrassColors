package keiko403.grasscolors.blocks.earth;

import keiko403.grasscolors.data.ItemModel;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrassBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import keiko403.grasscolors.init.BlockList;

import java.util.function.Function;

public class GenericEarthBlock extends GrassBlock {

    public static final Function<Properties, GenericEarthBlock> RED_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> BLUE_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> LIME_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> YELLOW_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> LIGHT_GRAY_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> LIGHT_BLUE_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> ORANGE_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> GREEN_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> BLACK_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> WHITE_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> GRAY_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> CYAN_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> PINK_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> MAGENTA_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> BROWN_EARTH = properties -> new GenericEarthBlock(
            properties
    );

    public static final Function<Properties, GenericEarthBlock> PURPLE_EARTH = properties -> new GenericEarthBlock(
            properties
    );


    GenericEarthBlock(Properties properties) {
        super(properties);
    }

    public static void convertRed(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.RED_DYE::equals, BlockList.RedEarth.get());
    }

    public static void convertBlue(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.BLUE_DYE::equals, BlockList.BlueEarth.get());
    }

    public static void convertLime(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.LIME_DYE::equals, BlockList.LimeEarth.get());
    }

    public static void convertYellow(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.YELLOW_DYE::equals, BlockList.YellowEarth.get());
    }

    public static void convertLightGray(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.LIGHT_GRAY_DYE::equals, BlockList.LightGrayEarth.get());
    }

    public static void convertLightBlue(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.LIGHT_BLUE_DYE::equals, BlockList.LightBlueEarth.get());
    }

    public static void convertOrange(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.ORANGE_DYE::equals, BlockList.OrangeEarth.get());
    }

    public static void convertGreen(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.GREEN_DYE::equals, BlockList.GreenEarth.get());
    }

    public static void convertBlack(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.BLACK_DYE::equals, BlockList.BlackEarth.get());
    }

    public static void convertWhite(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.WHITE_DYE::equals, BlockList.WhiteEarth.get());
    }

    public static void convertGray(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.GRAY_DYE::equals, BlockList.GrayEarth.get());
    }

    public static void convertCyan(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.CYAN_DYE::equals, BlockList.CyanEarth.get());
    }

    public static void convertPink(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.PINK_DYE::equals, BlockList.PinkEarth.get());
    }

    public static void convertMagenta(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.MAGENTA_DYE::equals, BlockList.MagentaEarth.get());
    }

    public static void convertBrown(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.BROWN_DYE::equals, BlockList.BrownEarth.get());
    }

    public static void convertPurple(PlayerInteractEvent.RightClickBlock event) {
        handleConvertEarth(event, Items.PURPLE_DYE::equals, BlockList.PurpleEarth.get());
    }

    private static void handleConvertEarth(PlayerInteractEvent.RightClickBlock event, ItemChecker itemChecker, Block defaultState) {
        PlayerEntity playerEntity = event.getPlayer();
        World world = playerEntity.world;
        BlockPos pos = event.getPos();

        if (playerEntity.isSneaking() && !world.isRemote && itemChecker.isItemValid(event.getItemStack().getItem()) && world.getBlockState(pos).getBlock() == Blocks.DIRT ) {
            world.setBlockState(pos, defaultState.getDefaultState());
        }

        if (playerEntity.isSneaking() && !world.isRemote && itemChecker.isItemValid(event.getItemStack().getItem()) && world.getBlockState(pos).getBlock() == Blocks.GRASS_BLOCK) {
            world.setBlockState(pos, defaultState.getDefaultState());
        }


    }

    @FunctionalInterface
    private interface ItemChecker {
        boolean isItemValid(Item item);
    }

}