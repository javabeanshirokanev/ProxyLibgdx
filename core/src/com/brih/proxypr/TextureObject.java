package com.brih.proxypr;

import com.badlogic.gdx.graphics.Texture;

public class TextureObject implements TextureObjectInterface {
    public Texture getTexture() {
        return new Texture("badlogic.jpg");
    }
}
