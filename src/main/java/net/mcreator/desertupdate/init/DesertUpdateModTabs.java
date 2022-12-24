
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.desertupdate.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DesertUpdateModTabs {
	public static CreativeModeTab TAB_FTGGHDRG;

	public static void load() {
		TAB_FTGGHDRG = new CreativeModeTab("tabftgghdrg") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.EXPOSED_CUT_COPPER_SLAB);
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
