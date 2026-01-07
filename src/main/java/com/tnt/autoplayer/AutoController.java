package com.tnt.autoplayer;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;

public class AutoController {

    private AutoState state = AutoState.OFF;
    private final DelayTimer delay = new DelayTimer();

    public void toggle() {
        if (state == AutoState.ACTIVE) {
            state = AutoState.OFF;
            return;
        }
        state = AutoState.ACTIVE;
    }

    public void tick(MinecraftClient client) {
        if (state != AutoState.ACTIVE) return;
        if (client.player == null || client.world == null) return;
        if (!delay.ready()) return;

        BlockPos below = client.player.getBlockPos().down();
        if (client.world.isAir(below)) {
            client.player.setPitch(80f);
            BlockPlacer.place(client, below);
            delay.set(8);
        }
    }
}
