package slexom.earthtojava.mobs.client.renderer.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import slexom.earthtojava.mobs.client.renderer.entity.feature.HornedSheepWoolLayer;
import slexom.earthtojava.mobs.client.renderer.entity.model.HornedSheepModel;
import slexom.earthtojava.mobs.entity.passive.HornedSheepEntity;
import slexom.earthtojava.mobs.init.EntityModeLayersInit;

@Environment(EnvType.CLIENT)
public class HornedSheepRenderer extends MobEntityRenderer<HornedSheepEntity, HornedSheepModel<HornedSheepEntity>> {

    public HornedSheepRenderer(EntityRendererFactory.Context context) {
        super(context, new HornedSheepModel<>(context.getPart(EntityModeLayersInit.HORNED_SHEEP_ENTITY_MODEL_LAYER)), 0.7F);
        this.addFeature(new HornedSheepWoolLayer(this, context.getModelLoader()));
    }

    public Identifier getTexture(HornedSheepEntity entity) {
        Identifier texture = new Identifier("earthtojavamobs:textures/mobs/sheep/horned_sheep/horned_sheep.png");
        Identifier textureBlink = new Identifier("earthtojavamobs:textures/mobs/sheep/horned_sheep/horned_sheep_blink.png");
        return entity.getBlinkRemainingTicks() > 0 ? textureBlink : texture;
    }
}