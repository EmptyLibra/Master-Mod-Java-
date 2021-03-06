package com.master.mastermod.core.init;
import com.master.mastermod.MasterMod;
import com.master.mastermod.common.entity.DarkCubeEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// Регистрация всех существ
public class EntityTypesInit {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,
			MasterMod.MOD_ID);

	public static final RegistryObject<EntityType<DarkCubeEntity>> DARK_CUBE = ENTITY_TYPES.register("dark_cube",
			() -> EntityType.Builder.of(DarkCubeEntity::new, EntityClassification.MONSTER).sized(1.0f, 1.0f)
					.build(new ResourceLocation(MasterMod.MOD_ID, "dark_cube").toString()));
}
