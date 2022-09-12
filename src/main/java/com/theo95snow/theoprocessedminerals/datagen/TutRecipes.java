package com.theo95snow.theoprocessedminerals.datagen;

import com.theo95snow.theoprocessedminerals.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Consumer;

public class TutRecipes extends RecipeProvider {
  public TutRecipes(DataGenerator generatorIn) {
    super(generatorIn);
  }

  protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

    ShapedRecipeBuilder.shaped(Registration.TIN_ROD.get(), 2)
            .pattern("x")
            .pattern("x")
            .define('x', Registration.TIN_INGOT.get())
            .group("theoprocessedminerals")
            .unlockedBy("tin", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.TIN_INGOT.get()))
            .save(consumer);

    SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RAW_TIN_CHUNK.get()),
                    Registration.TIN_INGOT.get(), 0.0f, 100)
            .unlockedBy("has_chunk", has(Registration.RAW_TIN_CHUNK.get()))
            .save(consumer, "tin_ingot1");
  }
}
