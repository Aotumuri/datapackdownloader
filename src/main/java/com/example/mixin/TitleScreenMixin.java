package com.example.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Inject(at = @At("HEAD"), method = "initWidgetsNormal(II)V")
    private void initWidgetsNormal(int y, int spacingY, CallbackInfo ci) {
        int i = this.height / 4 + 48;
        this.addDrawableChild(new ButtonWidget(this.width / 2 - 100, i + spacingY * 2, 200, 20, Text.translatable("menu.datapack"), (button) -> {
            // ボタンがクリックされたときの処理をここに記述
        }));
    }
}
