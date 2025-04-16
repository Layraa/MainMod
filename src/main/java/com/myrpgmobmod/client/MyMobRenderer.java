package com.myrpgmobmod.client;

import com.myrpgmobmod.entity.MyMobEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class MyMobRenderer extends GeoEntityRenderer<MyMobEntity> {
    public MyMobRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MyMobModel());
    }
}