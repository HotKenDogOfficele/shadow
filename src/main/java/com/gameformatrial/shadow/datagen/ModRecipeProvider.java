//package com.gameformatrial.shadow.datagen;
//
//import com.gameformatrial.shadow.Shadow;
//import net.minecraft.core.HolderLookup;
//import net.minecraft.data.PackOutput;
//import net.minecraft.data.recipes.*;
//import net.minecraft.world.item.crafting.*;
//import net.minecraft.world.level.ItemLike;
//import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
//
//import java.util.List;
//import java.util.concurrent.CompletableFuture;
//
//public abstract class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
//    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
//        super(pOutput, pRegistries);
//    }
//
//    @Override
//    protected void buildRecipes(RecipeOutput pRecipeOutput) {
////        List<ItemLike> SMELTABLES = List.of();
//
////        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, WeaponsTools.SHADOW_SWORD.get())
////                .pattern("A")
////                .pattern("A")
////                .pattern("B")
////                .define('A', WeaponsTools.SHADOW_SLIME.get())
////                .define('B', Items.STICK)
////                .unlockedBy(getHasName(WeaponsTools.SHADOW_SLIME.get()), has(WeaponsTools.SHADOW_SLIME.get())).save(pRecipeOutput);
//
////        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, WeaponsTools.SHADOW_SLIME.get(), 9)
////                .requires(WeaponsTools.SHADOW_BLOCK.get())
////                .unlockedBy(getHasName(WeaponsTools.SHADOW_BLOCK.get()), has(WeaponsTools.SHADOW_BLOCK.get())).save(pRecipeOutput);
//
////        oreSmelting(pRecipeOutput, SMELTABLES, RecipeCategory.MISC, Moditems..get(), 0.25f, 200, "");
////        oreBlasting(pRecipeOutput, SMELTABLES, RecipeCategory.MISC, Moditems..get(), 0.25f, 100, "");
//
//    }
//
//    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
//                                      float pExperience, int pCookingTIme, String pGroup) {
//        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
//                pExperience, pCookingTIme, pGroup, "_from_smelting");
//    }
//
//    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
//                                      float pExperience, int pCookingTime, String pGroup) {
//        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
//                pExperience, pCookingTime, pGroup, "_from_blasting");
//    }
//
//    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
//                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
//        for(ItemLike itemlike : pIngredients) {
//            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
//                    .save(recipeOutput, Shadow.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
//        }
//    }
//}
