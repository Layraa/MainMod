package com.myrpgmobmod.entity;

import com.myrpgmobmod.MainMod;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<MyMobEntity> MY_MOB = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MainMod.MOD_ID, "my_mob"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MyMobEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.8f)).build()
    );

    public static void registerModEntities() {
        System.out.println("Registering custom entities for " + MainMod.MOD_ID);
    }
}
