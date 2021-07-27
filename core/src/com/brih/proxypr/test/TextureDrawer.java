package com.brih.proxypr.test;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class TextureDrawer implements TextureDrawerInter {
    private Texture texture;
    private float x, y, w, h;

    public Texture getTexture() {
        return texture;
    }

    public TextureDrawer() {
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void draw(Batch batch) {
        batch.draw(texture, x, y, w, h);
    }

    public void setH(float h) {
        this.h = h;
    }

    public void setW(float w) {
        this.w = w;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() { return x; }
    public float getY() { return y; }
    public float getW() { return w; }
    public float getH() { return h; }
}
