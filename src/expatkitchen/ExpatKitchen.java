
package expatkitchen;

import java.util.List;

import expatkitchen.RecipeManagement.Ingredient;
import expatkitchen.RecipeManagement.Step;
import expatkitchen.RecipeManagement.Recipe;
import expatkitchen.RecipeManagement.RecipeManager;


public class ExpatKitchen {

 
    public static void main(String[] args) {
        // 1. Initialize the Manager
        RecipeManager manager = new RecipeManager();

        // 2. Create Ingredients
        Ingredient chicken = new Ingredient(1, "Chicken Breast", "Meat");
        Ingredient rice = new Ingredient(2, "Rice", "Grains");
        Ingredient soySauce = new Ingredient(3, "Soy Sauce", "Condiment");

        // 3. Create Steps
        Step step1 = new Step(101, 1, "Cut the chicken breast into small cubes.");
        Step step2 = new Step(102, 2, "Boil the rice for 15 minutes.");
        Step step3 = new Step(103, 3, "Fry the chicken and add soy sauce.");

        // 4. Create a Recipe and add elements
        Recipe chickenRiceRecipe = new Recipe(1001, "Chicken Fried Rice", "Beginner", 25);
        chickenRiceRecipe.addIngredient(chicken);
        chickenRiceRecipe.addIngredient(rice);
        chickenRiceRecipe.addIngredient(soySauce);
        
        chickenRiceRecipe.addStep(step1);
        chickenRiceRecipe.addStep(step2);
        chickenRiceRecipe.addStep(step3);

        // 5. Add recipe to the manager
        manager.addRecipe(chickenRiceRecipe);

        // --- Demonstration ---

        System.out.println("=== EXPAT KITCHEN: ALL RECIPES ===");
        for (Recipe r : manager.listAllRecipes()) {
            System.out.println(r.getRecipeDetails());
            System.out.println("Total Steps: " + r.getTotalSteps());
        }

        System.out.println("\n=== SEARCH RESULTS FOR 'RICE' ===");
        List<Recipe> searchResults = manager.searchRecipesByIngredient("Rice");
        if (searchResults.isEmpty()) {
            System.out.println("No recipes found.");
        } else {
            for (Recipe r : searchResults) {
                System.out.println("- Found matching recipe: " + r.getTitle());
            }
        }
    }

    }
    










/*

public class Main {
    public static void main(String[] args) {
        // 1. Initialize the Manager
        RecipeManager manager = new RecipeManager();

        // 2. Create Ingredients
        Ingredient chicken = new Ingredient(1, "Chicken Breast", "Meat");
        Ingredient rice = new Ingredient(2, "Rice", "Grains");
        Ingredient soySauce = new Ingredient(3, "Soy Sauce", "Condiment");

        // 3. Create Steps
        Step step1 = new Step(101, 1, "Cut the chicken breast into small cubes.");
        Step step2 = new Step(102, 2, "Boil the rice for 15 minutes.");
        Step step3 = new Step(103, 3, "Fry the chicken and add soy sauce.");

        // 4. Create a Recipe and add elements
        Recipe chickenRiceRecipe = new Recipe(1001, "Chicken Fried Rice", "Beginner", 25);
        chickenRiceRecipe.addIngredient(chicken);
        chickenRiceRecipe.addIngredient(rice);
        chickenRiceRecipe.addIngredient(soySauce);
        
        chickenRiceRecipe.addStep(step1);
        chickenRiceRecipe.addStep(step2);
        chickenRiceRecipe.addStep(step3);

        // 5. Add recipe to the manager
        manager.addRecipe(chickenRiceRecipe);

        // --- Demonstration ---

        System.out.println("=== EXPAT KITCHEN: ALL RECIPES ===");
        for (Recipe r : manager.listAllRecipes()) {
            System.out.println(r.getRecipeDetails());
            System.out.println("Total Steps: " + r.getTotalSteps());
        }

        System.out.println("\n=== SEARCH RESULTS FOR 'RICE' ===");
        List<Recipe> searchResults = manager.searchRecipesByIngredient("Rice");
        if (searchResults.isEmpty()) {
            System.out.println("No recipes found.");
        } else {
            for (Recipe r : searchResults) {
                System.out.println("- Found matching recipe: " + r.getTitle());
            }
        }
    }
}
*/