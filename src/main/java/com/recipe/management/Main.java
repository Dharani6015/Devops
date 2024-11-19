package com.recipe.management;

import com.recipe.management.models.Recipe;
import com.recipe.management.services.RecipeService;

public class Main {
    public static void main(String[] args) {
        RecipeService recipeService = new RecipeService();

        // Add Recipes
        Recipe recipe1 = new Recipe();
        recipe1.setId("1");
        recipe1.setName("Pasta");
        recipe1.setIngredients("Pasta, Sauce, Cheese");
        recipe1.setInstructions("Boil pasta. Add sauce. Sprinkle cheese.");
        recipeService.addRecipe(recipe1);

        Recipe recipe2 = new Recipe();
        recipe2.setId("2");
        recipe2.setName("Pizza");
        recipe2.setIngredients("Dough, Tomato Sauce, Cheese, Toppings");
        recipe2.setInstructions("Prepare dough. Add sauce and toppings. Bake.");
        recipeService.addRecipe(recipe2);

        // Retrieve and display recipe with ID "2"
        Recipe retrievedRecipe = recipeService.getRecipeById("2");
        if (retrievedRecipe != null) {
            System.out.println("Recipe Found:");
            System.out.println("ID: " + retrievedRecipe.getId());
            System.out.println("Name: " + retrievedRecipe.getName());
            System.out.println("Ingredients: " + retrievedRecipe.getIngredients());
            System.out.println("Instructions: " + retrievedRecipe.getInstructions());
        } else {
            System.out.println("Recipe not found!");
        }
    }
}

