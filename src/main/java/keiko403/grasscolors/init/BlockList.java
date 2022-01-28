package keiko403.grasscolors.init;

import keiko403.grasscolors.CreativeTab;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import keiko403.grasscolors.ModRegistry;
import keiko403.grasscolors.blocks.earth.GenericEarthBlock;


import java.util.function.Supplier;

public class BlockList {
    public static final RegistryObject<Block> RedEarth = register("red_earth", () -> GenericEarthBlock.RED_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> BlueEarth = register("blue_earth", () -> GenericEarthBlock.BLUE_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> LimeEarth = register("lime_earth", () -> GenericEarthBlock.LIME_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> YellowEarth = register("yellow_earth", () -> GenericEarthBlock.YELLOW_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> LightGrayEarth = register("light_gray_earth", () -> GenericEarthBlock.LIGHT_GRAY_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> LightBlueEarth = register("light_blue_earth", () -> GenericEarthBlock.LIGHT_BLUE_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> OrangeEarth = register("orange_earth", () -> GenericEarthBlock.ORANGE_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GreenEarth = register("green_earth", () -> GenericEarthBlock.GREEN_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> BlackEarth = register("black_earth", () -> GenericEarthBlock.BLACK_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> WhiteEarth = register("white_earth", () -> GenericEarthBlock.WHITE_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> GrayEarth = register("gray_earth", () -> GenericEarthBlock.GRAY_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> CyanEarth = register("cyan_earth", () -> GenericEarthBlock.CYAN_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> PinkEarth = register("pink_earth", () -> GenericEarthBlock.PINK_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> MagentaEarth = register("magenta_earth", () -> GenericEarthBlock.MAGENTA_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> BrownEarth = register("brown_earth", () -> GenericEarthBlock.BROWN_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> PurpleEarth = register("purple_earth", () -> GenericEarthBlock.PURPLE_EARTH.apply(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));

    public static void register() {}

    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return ModRegistry.BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerNoTab(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        ModRegistry.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties()));
        return ret;
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        ModRegistry.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().group(CreativeTab.getInstance())));
        return ret;
    }
}