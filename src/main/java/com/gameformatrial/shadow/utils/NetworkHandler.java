package com.gameformatrial.shadow.utils;

import com.gameformatrial.shadow.Shadow;
import com.gameformatrial.shadow.network.AbilityPacket;
import net.minecraftforge.network.PacketDistributor;

public class NetworkHandler {
    public static void sendToServer(AbilityPacket packet) {
        Shadow.NETWORK.send(packet, PacketDistributor.SERVER.noArg());
    }
}
