package net.mcreator.meowmeow.procedures;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.meowmeow.block.DeathBlockBlock;
import net.mcreator.meowmeow.MeowmeowElements;

@MeowmeowElements.ModElement.Tag
public class CaliforniaEntityWalksOnTheBlockProcedure extends MeowmeowElements.ModElement {
	public CaliforniaEntityWalksOnTheBlockProcedure(MeowmeowElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure CaliforniaEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CaliforniaEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CaliforniaEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CaliforniaEntityWalksOnTheBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CaliforniaEntityWalksOnTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		double startingTime = 0;
		if ((entity instanceof PlayerEntity)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.UNLUCK, (int) 2, (int) 255, (false), (false)));
			if ((Math.random() < 0.1)) {
				entity.setCustomName(new StringTextComponent("Dunce"));
				if ((Math.random() < 0.1)) {
					entity.setCustomName(new StringTextComponent("Major Dunce"));
					if ((Math.random() < 0.2)) {
						world.setBlockState(new BlockPos((int) x, (int) ((((Math.random() * 10) % 5) + 3) + y), (int) z),
								DeathBlockBlock.block.getDefaultState(), 3);
					}
				}
			}
		}
	}
}
