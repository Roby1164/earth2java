package net.slexom.earthtojavamobs.client.renderer.entity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.util.ResourceLocation;

import java.text.MessageFormat;

public class E2JWolfRenderer extends WolfRenderer {
    private final String registryName;

    public E2JWolfRenderer(EntityRendererManager renderManagerIn, String registryName) {
        super(renderManagerIn);
        this.registryName = registryName;
    }

    @Override
    public ResourceLocation getEntityTexture(WolfEntity entity) {
        String resourceTexture = MessageFormat.format("earthtojavamobs:textures/mobs/wolf/{0}/{0}.png", this.registryName);
        String resourceTextureAngry = MessageFormat.format("earthtojavamobs:textures/mobs/wolf/{0}/{0}_angry.png", this.registryName);
        ResourceLocation texture = new ResourceLocation(resourceTexture);
        ResourceLocation textureAngry = new ResourceLocation(resourceTextureAngry);
        return entity.isAngry() ? textureAngry : texture;
    }

}
