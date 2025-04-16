package com.myrpgmobmod.entity.behavior;

public class MeleeAttackBehavior implements Behavior {
    @Override
    public void perform() {
        System.out.println("Моб выполняет ближнюю атаку");
    }
}