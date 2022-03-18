package com.pbtservers.pbtclient.mixin;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public abstract class TitleMixin extends Screen {
	
	protected TitleMixin(Text title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Inject( at = @At("RETURN"), method = "initWidgetsNormal")
	private void nuevoBoton(int y, int spacingY, CallbackInfo ci) {
		this.addDrawableChild(new ButtonWidget(this.width / 2 - 100 + 205, y, 200, 20, new TranslatableText("PbtClient"), button -> this.client.setScreen(new SelectWorldScreen(this))));
	}
	
	
}
