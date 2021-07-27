package com.brih.proxypr;

import com.badlogic.gdx.graphics.Texture;

public class TextureProxy implements TextureObjectInterface {

    private TextureObject textureObject = new TextureObject();
    private Texture texture = null;

    @Override
    public Texture getTexture() {
        if(texture != null) {
            return texture;
        } else {
            texture = textureObject.getTexture();
            return texture;
        }
    }
}
