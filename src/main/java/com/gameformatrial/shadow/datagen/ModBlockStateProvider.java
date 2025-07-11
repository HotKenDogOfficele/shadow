//package com.gameformatrial.shadow.datagen;
//
//import com.gameformatrial.shadow.Shadow;
//import com.gameformatrial.shadow.blocks.BlockGen;
//import net.minecraft.data.PackOutput;
//import net.minecraft.world.level.block.Block;
//import net.minecraftforge.client.model.generators.BlockStateProvider;
//import net.minecraftforge.common.data.ExistingFileHelper;
//import net.minecraftforge.registries.RegistryObject;
//
//public class ModBlockStateProvider extends BlockStateProvider {
//    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
//        super(output, Shadow.MODID, exFileHelper);
//    }
//
//    @Override
//    protected void registerStatesAndModels() {
//        blockWithItem(BlockGen.SHADOW_ORE);
//    }
//
//    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
//        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
//    }
//}
