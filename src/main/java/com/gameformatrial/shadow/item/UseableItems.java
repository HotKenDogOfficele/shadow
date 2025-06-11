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

public class UseableItems {
    public static final DeferredRegister<Item> USEABLEITEMS = DeferredRegister.create(Registries.ITEM, Shadow.MODID);

    public static void register(IEventBus eventBus) {
        USEABLEITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> WEIRD_SLIME = USEABLEITEMS.register("weird_slime", () -> new Item(
            new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Shadow.MODID, "weird_slime")))
                    .stacksTo(64)
            )
    );
}
