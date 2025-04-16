package com.myrpgmobmod.entity;

import com.myrpgmobmod.entity.behavior.Behavior;

public class RPGMobType {
    public final MobPreset preset;
    public final Behavior behavior;

    public RPGMobType(MobPreset preset, Behavior behavior) {
        this.preset = preset;
        this.behavior = behavior;
    }

    public void tick() {
        behavior.perform();
    }
}