package net.mcreator.meowmeow.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.meowmeow.entity.CatDemonEntity;
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
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PlantOfTheCatDemonNeighbourBlockChangesMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PlantOfTheCatDemonNeighbourBlockChangesMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PlantOfTheCatDemonNeighbourBlockChangesMobplayerCollidesWithPlant!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PlantOfTheCatDemonNeighbourBlockChangesMobplayerCollidesWithPlant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		entity.setFire((int) 20);
		if ((entity instanceof CatDemonEntity.CustomEntity)) {
			entity.setPositionAndUpdate(x, (y + 3), z);
			if (entity instanceof PlayerEntity) {
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				world.getBlockState(_bp).getBlock().onBlockActivated(world.getBlockState(_bp), world, _bp, (PlayerEntity) entity, Hand.MAIN_HAND,
						BlockRayTraceResult.createMiss(new Vec3d(_bp.getX(), _bp.getY(), _bp.getZ()), Direction.UP, _bp));
			}
		}
	}
}
