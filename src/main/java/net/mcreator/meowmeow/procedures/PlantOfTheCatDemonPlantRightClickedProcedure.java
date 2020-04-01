package net.mcreator.meowmeow.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.meowmeow.MeowmeowElements;

@MeowmeowElements.ModElement.Tag
public class PlantOfTheCatDemonPlantRightClickedProcedure extends MeowmeowElements.ModElement {
	public PlantOfTheCatDemonPlantRightClickedProcedure(MeowmeowElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlantOfTheCatDemonPlantRightClicked!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
	}
}
