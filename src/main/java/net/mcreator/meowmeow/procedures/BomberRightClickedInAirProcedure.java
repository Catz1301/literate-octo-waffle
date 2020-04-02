package net.mcreator.meowmeow.procedures;

import net.minecraft.world.World;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;

import net.mcreator.meowmeow.MeowmeowElements;

@MeowmeowElements.ModElement.Tag
public class BomberRightClickedInAirProcedure extends MeowmeowElements.ModElement {
	public BomberRightClickedInAirProcedure(MeowmeowElements instance) {
		super(instance, 13);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BomberRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BomberRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BomberRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BomberRightClickedInAir!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		for (int _ct = 0; _ct < 5; _ct++) {
			world.addOptionalParticle(ParticleTypes.WITCH, x, y, z, 3, 3, 3);
		}
		if (!world.isRemote) {
			Entity entityToSpawn = new TridentEntity(EntityType.TRIDENT, world);
			entityToSpawn.setLocationAndAngles(x, y, z, world.rand.nextFloat() * 360F, 0);
			world.addEntity(entityToSpawn);
		}
	}
}
