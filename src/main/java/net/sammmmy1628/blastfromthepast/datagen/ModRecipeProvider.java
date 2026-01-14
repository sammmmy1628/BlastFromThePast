package net.sammmmy1628.blastfromthepast.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.sammmmy1628.blastfromthepast.init.BFTPItems;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(BFTPItems.SNOWDO_EGG.get()),
                        RecipeCategory.FOOD, BFTPItems.SNOWDO_EGG_COOKED.get(), 0.35F, 200)
                .unlockedBy("has_snowdo_egg", has(BFTPItems.SNOWDO_EGG.get()))
                .save(pWriter, "snowdo_egg_cooked_from_smelting");

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(BFTPItems.SNOWDO_EGG.get()),
                        RecipeCategory.FOOD, BFTPItems.SNOWDO_EGG_COOKED.get(), 0.35F, 100)
                .unlockedBy("has_snowdo_egg", has(BFTPItems.SNOWDO_EGG.get()))
                .save(pWriter, "snowdo_egg_cooked_from_smoking");

        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(BFTPItems.SNOWDO_EGG.get()),
                        RecipeCategory.FOOD, BFTPItems.SNOWDO_EGG_COOKED.get(), 0.35F, 600)
                .unlockedBy("has_snowdo_egg", has(BFTPItems.SNOWDO_EGG.get()))
                .save(pWriter, "snowdo_egg_cooked_from_campfire_cooking");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BFTPItems.GELIMELON_SEEDS.get(), 1)
                .requires(BFTPItems.GELIMELON_SLICE.get())
                .unlockedBy("has_gelimelon_slice", has(BFTPItems.GELIMELON_SLICE.get()))
                .save(pWriter);
    }
}