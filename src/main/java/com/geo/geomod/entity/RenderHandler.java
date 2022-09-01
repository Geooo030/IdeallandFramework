package com.geo.geomod.entity;

import com.geo.geomod.entity.creatures.moroon.EntityMoroonUnitBase;
import com.geo.geomod.entity.creatures.render.RenderBullet;
import com.geo.geomod.entity.creatures.render.RenderMoroonHumanoid;
import com.geo.geomod.entity.projectiles.EntityIdlProjectile;
import com.geo.geomod.IdlFramework;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityMoroonUnitBase.class, RenderMoroonHumanoid::new);

        RenderingRegistry.registerEntityRenderingHandler(EntityIdlProjectile.class, renderManager -> new RenderBullet<>(renderManager, new ResourceLocation(IdlFramework.MODID,
                "textures/entity/projectiles/bullet_norm.png")));
    }
}
