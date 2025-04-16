package com.myrpgmobmod.entity;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class MobLoader {

    public static List<MobPreset> loadPresets() {
        List<MobPreset> mobs = new ArrayList<>();
        Path folder = Paths.get("config/myrpgmobmod/mob_presets");
        if (!Files.exists(folder)) {
            return mobs;
        }

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(folder, "*.json")) {
            for (Path entry : stream) {
                String content = Files.readString(entry);
                JsonObject json = JsonParser.parseString(content).getAsJsonObject();
                MobPreset preset = new Gson().fromJson(json, MobPreset.class);
                mobs.add(preset);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return mobs;
    }
}