//package com.gameformatrial.shadow.datagen;
//
//import com.gameformatrial.shadow.Shadow;
//import com.gameformatrial.shadow.item.WeaponsTools;
//import net.minecraft.data.PackOutput;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.world.item.Item;
//import net.minecraft.world.item.ItemDisplayContext;
//import net.minecraft.client.data.models.ModelProvider;
////import net.minecraftforge.client.model.generators.ItemModelProvider;
//import net.minecraftforge.common.data.ExistingFileHelper;
//import net.minecraftforge.registries.RegistryObject;
//
//public class ModItemModelProvider extends ModelProvider {
//    public ModItemModelProvider(PackOutput output) {
//        super(output);
//    }
//
//    @Override
//    protected void registerModels() {
//        Swortshadow(WeaponsTools.SHADOW_SWORD);
//    }
//
//    private ModelProvider handheldItem(RegistryObject<Item> item) {
//        return withExistingParent(item.getId().getPath(),
//                ResourceLocation.parse("item/handheld")).texture("layer0",
//                ResourceLocation.fromNamespaceAndPath(Shadow.MODID,"item/" + item.getId().getPath()));
//    }
//
//    private ModelProvider Swortshadow(RegistryObject<Item> item) {
//        return withExistingParent(item.getId().getPath(),
//                ResourceLocation.parse("item/handheld"))
//                .texture("layer0", ResourceLocation.fromNamespaceAndPath(Shadow.MODID, "item/" + item.getId().getPath()))
//                .transforms()
//                .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND)
//                .rotation(0, 90, 0)
//                .translation(0, 5f, 0f)
//                .scale(5f, 5F, 1.2f)
//                .end()
//                .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND)
//                .rotation(0, 90, 0)
//                .translation(0, 15f, 0f)
//                .scale(5f, 5F, 1.2f)
//                .end()
//                .end();
//    }
//
//}