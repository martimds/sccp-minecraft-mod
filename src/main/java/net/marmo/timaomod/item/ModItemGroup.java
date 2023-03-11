package net.marmo.timaomod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.marmo.timaomod.TimaoMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup CORINTHIANS;
    public static void registerItemGroups() {
        CORINTHIANS = FabricItemGroup.builder(new Identifier(TimaoMod.MOD_ID, "corinthians"))
                .displayName(Text.literal("Corinthians"))
                .icon(() -> new ItemStack(ModItems.CORINTHIANS_INGOT)).build();
    }
}
