package com.myrpgmobmod.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MobPresetManager {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path CONFIG_DIR = Paths.get("config", "myrpgmobmod");

    public static void savePreset(String name, MobPreset preset) {
        try {
            if (!Files.exists(CONFIG_DIR)) Files.createDirectories(CONFIG_DIR);

            Path file = CONFIG_DIR.resolve(name + ".json");
            try (Writer writer = new FileWriter(file.toFile())) {
                GSON.toJson(preset, writer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static MobPreset loadPreset(String name) {
        Path file = CONFIG_DIR.resolve(name + ".json");
        if (!Files.exists(file)) return null;

        try (Reader reader = new FileReader(file.toFile())) {
            return GSON.fromJson(reader, MobPreset.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void deletePreset(String name) {
        try {
            Files.deleteIfExists(CONFIG_DIR.resolve(name + ".json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
