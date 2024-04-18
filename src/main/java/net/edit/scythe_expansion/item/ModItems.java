package net.edit.scythe_expansion.item;

import net.edit.scythe_expansion.ScytheExpansion;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item COCK = registerItem("cock_scythe", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTab(FabricItemGroupEntries entries){
        entries.add(COCK);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ScytheExpansion.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ScytheExpansion.LOGGER.info("Registering items for " + ScytheExpansion.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTab);
    }


}
