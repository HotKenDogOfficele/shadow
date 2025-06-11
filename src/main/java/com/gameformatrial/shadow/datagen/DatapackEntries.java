package com.gameformatrial.shadow.datagen;

import com.gameformatrial.shadow.Shadow;
import com.gameformatrial.shadow.world.GenBM;
import com.gameformatrial.shadow.world.GenCF;
import com.gameformatrial.shadow.world.GenPF;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class DatapackEntries  extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, GenCF::bootstrap)
            .add(Registries.PLACED_FEATURE, GenPF::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, GenBM::bootstrap);

    public DatapackEntries(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Shadow.MODID));
    }
}
