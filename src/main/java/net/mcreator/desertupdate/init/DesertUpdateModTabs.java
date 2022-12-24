
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.desertupdate.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DesertUpdateModTabs {
	public static CreativeModeTab TAB_JE_OPA_OP_EEN_DRIEWIELER;

	public static void load() {
		TAB_JE_OPA_OP_EEN_DRIEWIELER = new CreativeModeTab("tabje_opa_op_een_driewieler") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.ZOMBIE_HEAD);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
