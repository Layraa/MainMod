package com.myrpgmobmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.entity.EntityType;

import static com.myrpgmobmod.MyRpgMobMod.MOD_ID;

public class ModEntities {
    public static final EntityType<MyMobEntity> MY_MOB = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MOD_ID, "my_mob"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MyMobEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build()
    );

    public static void register() {
        System.out.println("Registering entities for " + MOD_ID);
    }

    public static DefaultAttributeContainer.Builder createMobAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 4.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25);
    }
}
