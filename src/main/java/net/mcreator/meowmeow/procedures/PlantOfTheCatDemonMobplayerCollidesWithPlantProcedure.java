package net.mcreator.meowmeow.procedures;

import net.minecraft.world.World;
import net.minecraft.world.Explosion;
import net.minecraft.entity.Entity;

import net.mcreator.meowmeow.MeowmeowElements;

@MeowmeowElements.ModElement.Tag
public class PlantOfTheCatDemonMobplayerCollidesWithPlantProcedure extends MeowmeowElements.ModElement {
	public PlantOfTheCatDemonMobplayerCollidesWithPlantProcedure(MeowmeowElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure PlantOfTheCatDemonMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PlantOfTheCatDemonMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PlantOfTheCatDemonMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PlantOfTheCatDemonMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PlantOfTheCatDemonMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		float pitchRot = 0;
		entity.setFire((int) 20);
		if ((((entity.getDisplayName().getFormattedText())).equals("Cat Demon"))) {
			pitchRot = (float) 0.0f;
			entity.setPositionAndUpdate(x, (y + 3), z);
			if (!world.isRemote) {
				world.createExplosion(null, (int) x, (int) y, (int) z, (float) 4, Explosion.Mode.BREAK);
			}
			for (int index0 = 0; index0 < (int) (720); index0++) {
				pitchRot = (float) ((pitchRot) + 1.0f);
				entity.rotationYaw = 0;
				entity.rotationPitch = (pitchRot);
			}
		}
	}
}
