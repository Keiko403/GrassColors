package keiko403.grasscolors;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import keiko403.grasscolors.init.BlockList;

public class CreativeTab extends ItemGroup {
    private static final CreativeTab INSTANCE = new CreativeTab();

    public CreativeTab() { super(GrassColors.MOD_ID); }

    public static CreativeTab getInstance()
    {
        return INSTANCE;
    }

    public ItemStack createIcon()
    {
        return new ItemStack(BlockList.RedEarth.get());
    }
}