package com.tnt.autoplayer;

import net.fabricmc.api.ClientModInitializer;

public class AutoPlayerMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        System.out.println("[TNT AutoPlayer] Loaded");
    }
}
