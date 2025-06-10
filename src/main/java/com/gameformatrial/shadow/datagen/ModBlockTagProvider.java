package com.gameformatrial.shadow.datagen;

import com.gameformatrial.shadow.Shadow;
import com.gameformatrial.shadow.blocks.BlockGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
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
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockGen.SHADOW_ORE.get());

        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(BlockGen.SHADOW_ORE.get());
//
        tag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL)
                .addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

//
//        tag(BlockTags.Blocks.INCOORECT_FOR_SHADOW_TOOL)
//                .addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
//                .remove(BlockTags.Blocks.NEEDS_SHADOW_TOOL);
    }
}