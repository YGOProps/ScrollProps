
package net.mcreator.scrollsprops.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.scrollsprops.creativetab.TabCards;
import net.mcreator.scrollsprops.ElementsScrollspropsMod;

@ElementsScrollspropsMod.ModElement.Tag
public class ItemGateGuardiansCombined extends ElementsScrollspropsMod.ModElement {
	@GameRegistry.ObjectHolder("scrollsprops:gate_guardians_combined")
	public static final Item block = null;
	public ItemGateGuardiansCombined(ElementsScrollspropsMod instance) {
		super(instance, 110);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("scrollsprops:gate_guardians_combined", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("gate_guardians_combined");
			setRegistryName("gate_guardians_combined");
			setCreativeTab(TabCards.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
