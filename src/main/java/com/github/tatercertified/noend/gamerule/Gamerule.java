package com.github.tatercertified.noend.gamerule;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class Gamerule {
    public static final GameRules.Key<GameRules.BooleanRule> DISABLE_END = GameRuleRegistry.register("disableEnd", GameRules.Category.MISC, GameRuleFactory.createBooleanRule(true));
}
