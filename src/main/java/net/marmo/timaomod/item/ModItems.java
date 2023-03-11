package net.marmo.timaomod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.marmo.timaomod.TimaoMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CORINTHIANS_DUST = registerItem("corinthians_dust",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
         return Registry.register(Registries.ITEM, new Identifier(TimaoMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, CORINTHIANS_DUST);
    }

    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems(){
        TimaoMod.LOGGER.info("Registrando itens do mod para " + TimaoMod.MOD_ID);

        addItemsToItemGroup();
    }
}
