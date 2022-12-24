
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.desertupdate.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.desertupdate.block.DsfsafsdBlock;
import net.mcreator.desertupdate.DesertUpdateMod;

public class DesertUpdateModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DesertUpdateMod.MODID);
	public static final RegistryObject<Block> DSFSAFSD = REGISTRY.register("dsfsafsd", () -> new DsfsafsdBlock());
}
