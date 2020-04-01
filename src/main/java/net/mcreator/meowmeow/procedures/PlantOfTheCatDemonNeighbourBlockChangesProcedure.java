package net.mcreator.meowmeow.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.meowmeow.MeowmeowElements;

@MeowmeowElements.ModElement.Tag
public class PlantOfTheCatDemonNeighbourBlockChangesProcedure extends MeowmeowElements.ModElement {
	public PlantOfTheCatDemonNeighbourBlockChangesProcedure(MeowmeowElements instance) {
		super(instance, 1);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure PlantOfTheCatDemonNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure PlantOfTheCatDemonNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure PlantOfTheCatDemonNeighbourBlockChanges!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure PlantOfTheCatDemonNeighbourBlockChanges!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double xi = 0;
		double yi = 0;
		double zi = 0;
		double i = 0;
		double ini = 0;
		i = (double) 10;
		xi = (double) 10;
		yi = (double) 10;
		zi = (double) 10;
		ini = (double) 10;
		for (int index0 = 0; index0 < (int) ((i)); index0++) {
			world.setBlockState(new BlockPos((int) ((x + 5) - (xi)), (int) ((y + 5) - (yi)), (int) ((z + 5) - (zi))), Blocks.FIRE.getDefaultState(),
					3);
			xi = (double) ((ini) - 5);
			xi = (double) (ini);
			yi = (double) (ini);
			zi = (double) (ini);
		}
	}
}
