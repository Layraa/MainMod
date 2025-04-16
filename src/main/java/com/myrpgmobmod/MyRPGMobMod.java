package com.myrpgmobmod;

import com.myrpgmobmod.entity.MyMobEntity;
import com.myrpgmobmod.entity.ModEntities;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;

public class MyRpgMobMod implements ModInitializer {
    public static final String MOD_ID = "myrpgmobmod";

    @Override
    public void onInitialize() {
        ModEntities.register();

        System.out.println("My RPG Mob Mod initialized!");
    }
}
