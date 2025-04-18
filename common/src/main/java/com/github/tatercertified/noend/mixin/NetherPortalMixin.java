package com.github.tatercertified.noend.mixin;

import com.github.tatercertified.noend.NoEnd;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.NetherPortalBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(NetherPortalBlock.class)
public class NetherPortalMixin {
    @Inject(method = "entityInside", at = @At("HEAD"), cancellable = true)
    private void checkIfEndIsEnabled(BlockState blockState, Level level, BlockPos blockPos, Entity entity, InsideBlockEffectApplier insideBlockEffectApplier, CallbackInfo ci) {
        if (level instanceof ServerLevel serverWorld && serverWorld.getGameRules().getBoolean(NoEnd.DISABLE_NETHER)) {
            ci.cancel();
        }
    }
}
