package com.github.tatercertified.noend.mixin;

import net.minecraft.world.level.GameRules;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(GameRules.class)
public interface GameRulesMixin {
    @Invoker("register")
    public static <T extends GameRules.Value<T>> GameRules.Key<T> register(String string, GameRules.Category category, GameRules.Type<T> type) {
        throw new AssertionError();
    }
}
