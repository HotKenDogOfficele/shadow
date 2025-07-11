package com.gameformatrial.shadow;

import com.gameformatrial.shadow.blocks.BlockGen;
import com.gameformatrial.shadow.item.UseableItems;
import com.gameformatrial.shadow.item.WeaponsTools;
import com.gameformatrial.shadow.network.AbilityPacket;
import com.gameformatrial.shadow.utils.CreativeTab;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.ChannelBuilder;
import net.minecraftforge.network.SimpleChannel;
import org.slf4j.Logger;

@Mod(Shadow.MODID)
public class Shadow {
    public static final String MODID = "shadow";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Shadow(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        WeaponsTools.register(modEventBus);
        UseableItems.register(modEventBus);
        BlockGen.register(modEventBus);
        CreativeTab.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC); //stay away!!\\
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        register();
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }

    public static final SimpleChannel NETWORK = ChannelBuilder
            .named(ResourceLocation.fromNamespaceAndPath(MODID,"main"))
            .networkProtocolVersion(0)
            .clientAcceptedVersions((status, version) -> true)
            .serverAcceptedVersions((status, version) -> true)
            .simpleChannel();

    @SuppressWarnings("deprecation")
    public static void register() {
        NETWORK.messageBuilder(AbilityPacket.class, 0)
                .encoder(AbilityPacket::encode)
                .decoder(AbilityPacket::decode)
                .consumer(AbilityPacket::handle)
                .add();
    }
}
