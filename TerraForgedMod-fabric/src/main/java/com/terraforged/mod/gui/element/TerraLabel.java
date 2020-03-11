/*
 *
 * MIT License
 *
 * Copyright (c) 2020 TerraForged
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.terraforged.mod.gui.element;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;

public class TerraLabel extends TerraButton {

    //    private final GuiLabel label;

    public TerraLabel(String text) {
        super(text);
        visible = true;
        //        label = new GuiLabel(
        //                Collections.singletonList(text),
        //                0xFFFFFF,
        //                Minecraft.getInstance().fontRenderer
        //        );
        //        label.visible = true;
    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks) {
        TextRenderer fontrenderer = MinecraftClient.getInstance().textRenderer;
        fontrenderer.drawWithShadow(getMessage(), x, y + (height - 8) / 2, 0xFFFFFF);
    }
}
