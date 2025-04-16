package com.myrpgmobmod;

import com.myrpgmobmod.entity.ModEntities;
import net.fabricmc.api.ModInitializer;

public class MainMod implements ModInitializer {
    public static final String MOD_ID = "myrpgmobmod";

    @Override
    public void onInitialize() {
        ModEntities.registerModEntities();
    }
}
