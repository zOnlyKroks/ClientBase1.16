package de.client.base.util;

import net.minecraft.client.MinecraftClient;
import net.minecraft.network.MessageType;
import net.minecraft.text.Text;
import org.jetbrains.annotations.NotNull;

public class ChatUtil {

    public static void send(final String s) {
        MinecraftClient.getInstance().inGameHud.addChatMessage(MessageType.SYSTEM, Text.of(s), MinecraftClient.getInstance().player.getUuid());
    }
}
