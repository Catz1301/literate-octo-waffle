package net.mcreator.meowmeow.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.meowmeow.MeowmeowElements;

@MeowmeowElements.ModElement.Tag
public class PlantOfTheCatDemonNeighbourBlockChangesMobplayerCollidesWithPlantProcedure extends MeowmeowElements.ModElement {
	public PlantOfTheCatDemonNeighbourBlockChangesMobplayerCollidesWithPlantProcedure(MeowmeowElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlantOfTheCatDemonNeighbourBlockChangesMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 20);
	}
}
