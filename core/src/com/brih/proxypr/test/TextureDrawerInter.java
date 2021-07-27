package com.brih.proxypr.test;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public interface TextureDrawerInter {
    void draw(Batch batch);
    void setTexture(Texture texture);
}
