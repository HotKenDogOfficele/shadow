package com.gameformatrial.shadow.utils;

import com.gameformatrial.shadow.Shadow;
import com.gameformatrial.shadow.blocks.BlockGen;
import com.gameformatrial.shadow.item.UseableItems;
import com.gameformatrial.shadow.item.WeaponsTools;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> SHADOW_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Shadow.MODID);

    public static void register(IEventBus eventBus) {
        SHADOW_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> SHADOW_TAB;

    static {
        SHADOW_TAB = SHADOW_TABS.register("shadow_tab", () -> CreativeModeTab.builder()
                .title(Component.translatable("creativetab.shadow.shadow_modpk"))
                .icon(() -> new ItemStack(WeaponsTools.SHADOW_SWORD.get()))
                .displayItems((parameters, output) -> {
                    //items//
                    output.accept(UseableItems.WEIRD_SLIME.get());

                    //mineable//
                    output.accept(BlockGen.SHADOW_ORE.get());

                    //tools//
                    output.accept(WeaponsTools.SHADOW_SWORD.get());
                })
                .build());
    }
}
