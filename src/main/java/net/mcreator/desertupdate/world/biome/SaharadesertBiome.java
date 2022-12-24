
package net.mcreator.desertupdate.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;

public class SaharadesertBiome {

	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(0f, 0f),
			Climate.Parameter.span(-0.8f, -0.8f), Climate.Parameter.span(0.51f, 0.51f), Climate.Parameter.span(0.8f, 0.8f),
			Climate.Parameter.point(0), Climate.Parameter.span(0.354140364942f, 0.354140364942f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-1838169).waterColor(4159204).waterFogColor(329011)
				.skyColor(-1838169).foliageColorOverride(-4661710).grassColorOverride(-6699755).build();

		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();

		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("desert_update:patch_cactus_saharadesert", VegetationFeatures.PATCH_SUGAR_CANE,
						List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));

		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);

		BiomeDefaultFeatures.addDesertVegetation(biomeGenerationSettings);

		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);

		BiomeDefaultFeatures.addExtraGold(biomeGenerationSettings);

		BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);

		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.HUSK, 50, 1, 3));

		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.5f).downfall(0.1f).specialEffects(effects)
				.mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}

}
