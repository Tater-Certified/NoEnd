package com.github.tatercertified.noend.neoforge;

import com.github.tatercertified.noend.NoEnd;
import net.neoforged.fml.common.Mod;

@Mod(NoEnd.MOD_ID)
public final class NoendNeoForge {
    public NoendNeoForge() {
        // Run our common setup.
        NoEnd.init();
    }
}
