package com.myrpgmobmod;

import com.myrpgmobmod.client.MyMobRenderer;
import com.myrpgmobmod.entity.EntityRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import software.bernie.geckolib.GeckoLib;

public class MyRPGMobModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeckoLib.initialize();
        EntityRendererRegistry.register(EntityRegistry.MY_MOB, MyMobRenderer::new);
    }
}