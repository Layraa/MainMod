package com.myrpgmobmod.client;

import com.myrpgmobmod.entity.MyMobEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MyMobModel extends GeoModel<MyMobEntity> {
    @Override
    public Identifier getModelResource(MyMobEntity animatable) {
        return new Identifier("myrpgmobmod", "geo/my_mob.geo.json");
    }

    @Override
    public Identifier getTextureResource(MyMobEntity animatable) {
        return new Identifier("myrpgmobmod", "textures/my_mob.png");
    }

    @Override
    public Identifier getAnimationResource(MyMobEntity animatable) {
        return new Identifier("myrpgmobmod", "animations/my_mob.animation.json");
    }
}