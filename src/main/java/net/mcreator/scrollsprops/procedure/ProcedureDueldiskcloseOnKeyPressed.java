package net.mcreator.scrollsprops.procedure;

import net.minecraft.util.EnumHand;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.scrollsprops.item.ItemYellowClosed;
import net.mcreator.scrollsprops.item.ItemRedDiskClosed;
import net.mcreator.scrollsprops.item.ItemPurpleclosed;
import net.mcreator.scrollsprops.item.ItemClosedBlueDisk;
import net.mcreator.scrollsprops.item.ItemAcademyDuelDiskYellow;
import net.mcreator.scrollsprops.item.ItemAcademyDuelDiskRed;
import net.mcreator.scrollsprops.item.ItemAcademyDuelDiskBlue;
import net.mcreator.scrollsprops.item.ItemAcademyDuelDisk;
import net.mcreator.scrollsprops.item.ItemAcademyDiskPurple;
import net.mcreator.scrollsprops.item.ItemADuelDisk;
import net.mcreator.scrollsprops.ElementsScrollspropsMod;

import java.util.Map;

@ElementsScrollspropsMod.ModElement.Tag
public class ProcedureDueldiskcloseOnKeyPressed extends ElementsScrollspropsMod.ModElement {
	public ProcedureDueldiskcloseOnKeyPressed(ElementsScrollspropsMod instance) {
		super(instance, 277);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure DueldiskcloseOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double diamonds = 0;
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemAcademyDuelDiskBlue.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemClosedBlueDisk.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		} else if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemClosedBlueDisk.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemAcademyDuelDiskBlue.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemAcademyDuelDiskRed.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemRedDiskClosed.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		} else if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemRedDiskClosed.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemAcademyDuelDiskRed.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemAcademyDuelDiskYellow.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemYellowClosed.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		} else if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemYellowClosed.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemAcademyDuelDiskYellow.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemAcademyDiskPurple.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemPurpleclosed.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		} else if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemPurpleclosed.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemAcademyDiskPurple.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		}
		if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemADuelDisk.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemAcademyDuelDisk.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		} else if ((((entity instanceof EntityLivingBase) ? ((EntityLivingBase) entity).getHeldItemOffhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ItemAcademyDuelDisk.block, (int) (1)).getItem())) {
			if (entity instanceof EntityLivingBase) {
				ItemStack _setstack = new ItemStack(ItemADuelDisk.block, (int) (1));
				_setstack.setCount(1);
				((EntityLivingBase) entity).setHeldItem(EnumHand.OFF_HAND, _setstack);
				if (entity instanceof EntityPlayerMP)
					((EntityPlayerMP) entity).inventory.markDirty();
			}
		}
	}
}
