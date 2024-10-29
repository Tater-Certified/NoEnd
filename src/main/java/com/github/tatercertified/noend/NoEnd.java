package com.github.tatercertified.noend;

import com.github.tatercertified.noend.gamerule.Gamerule;
import net.fabricmc.api.ModInitializer;

public class NoEnd implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        Gamerule.init();
    }
}
