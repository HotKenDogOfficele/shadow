package com.gameformatrial.shadow.datagen;

import com.gameformatrial.shadow.Shadow;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Shadow.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
//        tag(BlockTags.MINEABLE_WITH_PICKAXE)
//                .add(BlockGen.SHADOW_ORE.get());
//
//        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                .add(BlockGen.SHADOW_ORE.get());
//
//        tag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL)
//                .addTag(Shadow_Tags.Blocks.NEEDS_SHADOW_TOOL)
//                .remove(BlockGen.SHADOW_ORE.get());
//
//
//        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
//                .addTag(Shadow_Tags.Blocks.NEEDS_SHADOW_TOOL);
//
//        tag(Shadow_Tags.Blocks.INCOORECT_FOR_SHADOW_TOOL)
//                .addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                .remove(Shadow_Tags.Blocks.NEEDS_SHADOW_TOOL);
    }
}