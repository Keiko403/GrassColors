package keiko403.grasscolors.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import keiko403.grasscolors.GrassColors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemModel extends ItemModelProvider {
    public ItemModel(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, GrassColors.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        System.out.print("String[] withExistingParent = new String[]{");


        withExistingParent("red_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("blue_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("lime_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("yellow_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("light_gray_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("light_blue_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("orange_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("green_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("black_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("white_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("gray_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("cyan_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("pink_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("magenta_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("brown_earth", new ResourceLocation("block/grass_block"));
        withExistingParent("purple_earth", new ResourceLocation("block/grass_block"));



        System.out.print("}");

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
        ModelFile itemHandheld = getExistingFile(mcLoc("item/handheld"));


    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        System.out.print("\"" + name + "\"" + ", ");
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }

    private void buildAll(ModelFile itemGenerated, String... name) {
        Arrays.stream(name).forEach(n -> builder(itemGenerated, n));
    }

    @Override
    public ItemModelBuilder withExistingParent(String name, String parent) {
        System.out.print("\"" + name + "\"" + ", ");
        return super.withExistingParent(name, parent);
    }
}