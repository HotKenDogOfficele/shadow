package com.gameformatrial.shadow.utils;

import com.gameformatrial.shadow.ui.AbilitiesOverlay;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class McreatortestModKeyMappings {
    private static final Map<String, String> ABILITY_IMAGE_MAP = new LinkedHashMap<>();
    private static final List<String> ABILITY_KEYS = new ArrayList<>();

    static {
        // Define all abilities
        ABILITY_IMAGE_MAP.put("Abi0", "textures/screens/0.png");
        ABILITY_IMAGE_MAP.put("Abi1", "textures/screens/1.png");
        ABILITY_IMAGE_MAP.put("Abi2", "textures/screens/2.png");

        // Populate keys list
        ABILITY_KEYS.addAll(ABILITY_IMAGE_MAP.keySet());
    }

    private static int currentAbiIndex = 0;
    public static String CurrentAbi = ABILITY_KEYS.get(currentAbiIndex); // Track current abi key

    public static final KeyMapping NEXT_ABI = new KeyMapping(
            "key.mcreatortest.next_abi", GLFW.GLFW_KEY_O, "key.categories.ui") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                currentAbiIndex = (currentAbiIndex + 1) % ABILITY_KEYS.size();
                String selectedKey = ABILITY_KEYS.get(currentAbiIndex);
                String selectedPath = ABILITY_IMAGE_MAP.get(selectedKey);

                CurrentAbi = selectedKey; // Update selected abi key
                AbilitiesOverlay.SelectAbi(selectedPath.toLowerCase()); // Safe name for internal use
            }
            isDownOld = isDown;
        }
    };

    public static final KeyMapping PREV_ABI = new KeyMapping(
            "key.mcreatortest.prev_abi", GLFW.GLFW_KEY_I, "key.categories.ui") {
        private boolean isDownOld = false;

        @Override
        public void setDown(boolean isDown) {
            super.setDown(isDown);
            if (isDownOld != isDown && isDown) {
                currentAbiIndex = (currentAbiIndex - 1 + ABILITY_KEYS.size()) % ABILITY_KEYS.size();
                String selectedKey = ABILITY_KEYS.get(currentAbiIndex);
                String selectedPath = ABILITY_IMAGE_MAP.get(selectedKey);

                CurrentAbi = selectedKey;
                AbilitiesOverlay.SelectAbi(selectedPath.toLowerCase());
            }
            isDownOld = isDown;
        }
    };

    @SubscribeEvent
    public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
        event.register(NEXT_ABI);
        event.register(PREV_ABI);
    }
}
