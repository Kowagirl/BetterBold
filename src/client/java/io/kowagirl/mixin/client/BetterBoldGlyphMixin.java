package io.kowagirl.mixin.client;

import com.mojang.blaze3d.font.GlyphInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GlyphInfo.class)
public interface BetterBoldGlyphMixin {
	@Inject(method = "getBoldOffset", at = @At("RETURN"), cancellable = true)
	default void injectedBetterBold(CallbackInfoReturnable<Float> cir) {
		cir.setReturnValue(0.5F);
	}
}
