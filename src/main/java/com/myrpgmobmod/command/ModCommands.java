package com.myrpgmobmod.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class ModCommands {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("openmobeditor").executes(context -> {
                context.getSource().getPlayer().sendMessage(Text.literal("Открытие редактора мобов..."), false);
                // Тут вызывай открытие GUI — будет позже реализовано, как GUI-класс
                return 1;
            }));
        });
    }
}
