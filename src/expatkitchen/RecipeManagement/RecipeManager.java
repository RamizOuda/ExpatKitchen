package expatkitchen.RecipeManagement;

import java.util.ArrayList;
import java.util.List;


public class RecipeManager {
    // In-memory storage for V1. Easily replaceable with a Database Repository later.
    private List<Recipe> recipes;

    public RecipeManager() {
        this.recipes = new ArrayList<>();
    }

    // Adds a new recipe to the system
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    // Retrieves a recipe by its ID
    public Recipe getRecipeById(int id) {
        for (Recipe recipe : recipes) {
            if (recipe.getRecipeID() == id) {
                return recipe;
            }
        }
        return null; // Return null if not found
    }

    // Returns a list of all recipes
    public List<Recipe> listAllRecipes() {
        return this.recipes;
    }

    // Basic implementation of ingredient-based search (Future Scalability Focus)
    public List<Recipe> searchRecipesByIngredient(String ingredientName) {
        List<Recipe> matchedRecipes = new ArrayList<>();
        
        for (Recipe recipe : recipes) {
            for (Ingredient ingredient : recipe.getIngredients()) {
                // Case-insensitive search
                if (ingredient.getIngredientName().equalsIgnoreCase(ingredientName)) {
                    matchedRecipes.add(recipe);
                    break; // Move to the next recipe once a match is found
                }
            }
        }
        return matchedRecipes;
    }
}
