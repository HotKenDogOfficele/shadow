package com.gameformatrial.shadow.network;

import com.gameformatrial.shadow.abilities.Abi1;
import com.gameformatrial.shadow.abilities.Abi2;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.event.network.CustomPayloadEvent;

public class AbilityPacket {
    private final String abilityKey; // Add field

    public AbilityPacket(String abilityKey) {
        this.abilityKey = abilityKey;
    }

    public static void encode(AbilityPacket msg, FriendlyByteBuf buffer) {
        buffer.writeUtf(msg.abilityKey); // Encode key
    }

    public static AbilityPacket decode(FriendlyByteBuf buffer) {
        return new AbilityPacket(buffer.readUtf()); // Decode key
    }

    public static void handle(AbilityPacket msg, CustomPayloadEvent.Context ctx) {
        ctx.enqueueWork(() -> {
            ServerPlayer player = ctx.getSender();
            if (player != null) {
                // Dynamically trigger ability based on key
                switch (msg.abilityKey) {
                    case "Abi1" -> new Abi1().Release(player.level(), player);
                    case "Abi2" -> new Abi2().Release(player.level(), player);
                    default -> player.sendSystemMessage(Component.literal("Unknown ability!"));
                }
            }
        });
        ctx.setPacketHandled(true);
    }
}
