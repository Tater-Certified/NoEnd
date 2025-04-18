package com.github.tatercertified.noend;

import com.github.tatercertified.noend.mixin.BooleanValueMixin;
import com.github.tatercertified.noend.mixin.GameRulesMixin;
import net.minecraft.world.level.GameRules;

public final class NoEnd {
    public static final String MOD_ID = "noend";

    public static final GameRules.Key<GameRules.BooleanValue> DISABLE_END = GameRulesMixin.register("disableEnd", GameRules.Category.MISC, BooleanValueMixin.create(true));
    public static final GameRules.Key<GameRules.BooleanValue> DISABLE_NETHER = GameRulesMixin.register("disableNether", GameRules.Category.MISC, BooleanValueMixin.create(false));

    public static void init() {
    }
}
