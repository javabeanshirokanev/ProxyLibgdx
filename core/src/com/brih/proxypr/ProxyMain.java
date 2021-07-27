package com.brih.proxypr;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.brih.proxypr.test.TextureDrawer;
import com.brih.proxypr.test.TextureDrawerInter;
import com.brih.proxypr.test.TextureDrawerProxy;

public class ProxyMain extends ApplicationAdapter {
	SpriteBatch batch;
	TextureObjectInterface textureObject;

	TextureDrawerInter textureDrawer;
	Texture img;

	private TextureDrawerInter createDrawer() {
		TextureDrawer textureDrawer = new TextureDrawer();
		textureDrawer.setX(100);
		textureDrawer.setY(50);
		textureDrawer.setW(200);
		textureDrawer.setH(150);
		textureDrawer.setTexture(img);
		return textureDrawer;
	}

	private TextureDrawerInter createDrawerProxy() {
		TextureDrawerProxy textureDrawer = new TextureDrawerProxy();
		textureDrawer.setX(100);
		textureDrawer.setY(50);
		textureDrawer.setW(200);
		textureDrawer.setH(150);
		return textureDrawer;
	}
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		textureObject = new TextureProxy();
		img = new Texture("badlogic.jpg");
		textureDrawer = createDrawerProxy();
		//textureDrawer.setTexture(img);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		batch.begin();
		//img = textureObject.getTexture();
		//batch.draw(img, 0, 0);
		textureDrawer.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
