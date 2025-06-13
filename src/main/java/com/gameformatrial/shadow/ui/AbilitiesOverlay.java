package com.gameformatrial.shadow.ui;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.CustomizeGuiOverlayEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class AbilitiesOverlay {
    private static String SelectAbilty = "textures/screens/0.png";

    public static void SelectAbi(String name) {
        SelectAbilty = name;
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void renderOverlay(CustomizeGuiOverlayEvent event) {
        int w = event.getWindow().getGuiScaledWidth();
        int h = event.getWindow().getGuiScaledHeight();
//        Player entity = Minecraft.getInstance().player;
        GlStateManager._disableDepthTest();
        GlStateManager._depthMask(false);
        GlStateManager._enableBlend();
        GlStateManager._blendFuncSeparate(770, 771, 1, 0);
        RenderSystem.setShaderColor(1, 1, 1, 1);
        event.getGuiGraphics().blit(RenderType::guiTextured, ResourceLocation.fromNamespaceAndPath("shadow", SelectAbilty), w - 36, h - 36, 0, 0, 32, 32, 32, 32);
        GlStateManager._depthMask(true);
        GlStateManager._enableDepthTest();
        GlStateManager._disableBlend();
        RenderSystem.setShaderColor(1, 1, 1, 1);
    }
}
