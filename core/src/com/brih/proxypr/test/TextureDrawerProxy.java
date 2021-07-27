package com.brih.proxypr.test;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.brih.proxypr.TextureObjectInterface;

public class TextureDrawerProxy implements TextureDrawerInter {
    private TextureDrawer textureDrawer = new TextureDrawer();
    private Texture errorTexture;

    public void setH(float h) {
        textureDrawer.setH(h);
    }

    public void setTexture(Texture texture) {
        textureDrawer.setTexture(texture);
    }

    public void setW(float w) {
        textureDrawer.setW(w);
    }

    public void setY(float y) {
        textureDrawer.setY(y);
    }

    public void setX(float x) {
        textureDrawer.setX(x);
    }

    public TextureDrawerProxy() {
        errorTexture = new Texture("error.jpg");
    }

    @Override
    public void draw(Batch batch) {
        Texture tex = textureDrawer.getTexture();
        if(tex != null) {
            textureDrawer.draw(batch);
        } else {
            batch.draw(errorTexture, textureDrawer.getX(), textureDrawer.getY(), textureDrawer.getW(), textureDrawer.getH());
        }
    }
}
