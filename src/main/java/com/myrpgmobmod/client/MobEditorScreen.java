package com.myrpgmobmod.client;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class MobEditorScreen extends Screen {
    private TextFieldWidget nameField;
    private TextFieldWidget modelField;
    private TextFieldWidget animationField;
    private TextFieldWidget healthField;
    private TextFieldWidget damageField;
    private TextFieldWidget speedField;

    protected MobEditorScreen() {
        super(Text.literal("Mob Editor"));
    }

    @Override
    protected void init() {
        int centerX = this.width / 2;
        int y = this.height / 4;

        nameField = new TextFieldWidget(this.textRenderer, centerX - 100, y, 200, 20, Text.literal("Name"));
        this.addSelectableChild(nameField); y += 25;

        modelField = new TextFieldWidget(this.textRenderer, centerX - 100, y, 200, 20, Text.literal("Model"));
        this.addSelectableChild(modelField); y += 25;

        animationField = new TextFieldWidget(this.textRenderer, centerX - 100, y, 200, 20, Text.literal("Animation"));
        this.addSelectableChild(animationField); y += 25;

        healthField = new TextFieldWidget(this.textRenderer, centerX - 100, y, 200, 20, Text.literal("Health"));
        this.addSelectableChild(healthField); y += 25;

        damageField = new TextFieldWidget(this.textRenderer, centerX - 100, y, 200, 20, Text.literal("Damage"));
        this.addSelectableChild(damageField); y += 25;

        speedField = new TextFieldWidget(this.textRenderer, centerX - 100, y, 200, 20, Text.literal("Speed"));
        this.addSelectableChild(speedField); y += 25;

        this.addDrawableChild(new ButtonWidget(centerX - 100, y, 95, 20, Text.literal("Save"), button -> savePreset()));
        this.addDrawableChild(new ButtonWidget(centerX + 5, y, 95, 20, Text.literal("Delete"), button -> deletePreset()));
    }

    private void savePreset() {
        JsonObject json = new JsonObject();
        json.addProperty("name", nameField.getText());
        json.addProperty("model", modelField.getText());
        json.addProperty("animation", animationField.getText());
        json.addProperty("health", healthField.getText());
        json.addProperty("damage", damageField.getText());
        json.addProperty("speed", speedField.getText());

        try (FileWriter writer = new FileWriter("config/myrpgmobmod/preset.json")) {
            writer.write(json.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deletePreset() {
        File file = new File("config/myrpgmobmod/preset.json");
        if (file.exists()) {
            file.delete();
        }
    }

    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        this.renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);

        nameField.render(matrices, mouseX, mouseY, delta);
        modelField.render(matrices, mouseX, mouseY, delta);
        animationField.render(matrices, mouseX, mouseY, delta);
        healthField.render(matrices, mouseX, mouseY, delta);
        damageField.render(matrices, mouseX, mouseY, delta);
        speedField.render(matrices, mouseX, mouseY, delta);
    }
}
