package de.client.base.mixin;

import de.client.base.ClientBase;
import de.client.base.util.ConfigManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class) public class MinecraftClientMixin {
    @Inject(method = "stop", at = @At("HEAD")) void real(CallbackInfo ci) {
        ConfigManager.saveState();
    }
}
