package com.gameformatrial.shadow.item;

import com.gameformatrial.shadow.Shadow;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.Weapon;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class WeaponsTools {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, Shadow.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> SHADOW_SWORD = ITEMS.register("shadow_sword", () -> new Item(
            new Item.Properties()
            .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Shadow.MODID, "shadow_sword")))
            .stacksTo(1)
            .sword(ToolMaterial.NETHERITE, 56, 5F)
            .component(DataComponents.WEAPON, new Weapon(8, -2.4F))
    ));
}
