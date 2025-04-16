package com.myrpgmobmod.entity;

import com.myrpgmobmod.MyRPGMobMod;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EntityRegistry {

    public static final EntityType<MyMobEntity> MY_MOB = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(MyRPGMobMod.MOD_ID, "my_mob"),
            EntityType.Builder.create(MyMobEntity::new, SpawnGroup.MONSTER)
                    .setDimensions(0.6f, 1.8f)
                    .build(new Identifier("myrpgmobmod", "my_mob"))

    );

    public static void register() {
        System.out.println("Registered custom entity");
    }
}
