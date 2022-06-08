package com.yor42.shut.mixin;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@OnlyIn(Dist.CLIENT)
@Mixin(targets = "net.minecraft.client.PeriodicNotificationManager$NotificationTask")
public class KillNotif {
    @Inject(method = "run", at = @At("HEAD"), cancellable = true)
    private void onRun(CallbackInfo ci){
        ci.cancel();
    }
}
