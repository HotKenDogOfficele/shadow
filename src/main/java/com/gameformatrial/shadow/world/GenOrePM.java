package com.gameformatrial.shadow.world;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class GenOrePM {
    public static List<PlacementModifier> orePlacement(PlacementModifier pCountPlacement, PlacementModifier pHeightRangePlacement) {
        return List.of(pCountPlacement, InSquarePlacement.spread(), pHeightRangePlacement, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int pCount, PlacementModifier pHeightRangePlacement) {
        return List.of(CountPlacement.of(pCount), pHeightRangePlacement);
    }

    public static List<PlacementModifier> rareOrePlacement(int pChance, PlacementModifier pHeightRangePlacement) {
        return List.of(RarityFilter.onAverageOnceEvery(pChance), pHeightRangePlacement);
    }
}
