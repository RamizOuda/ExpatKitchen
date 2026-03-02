
package expatkitchen.RecipeManagement;

import java.util.ArrayList;
import java.util.List;


public class Recipe {
    private int recipeID;
    private String title;
    private String difficultyLevel;
    private int estimatedTime; // in minutes
    
    // Using ArrayList for dynamic data structures
    private List<Step> steps;
    private List<Ingredient> ingredients;

    // Constructor
    public Recipe(int recipeID, String title, String difficultyLevel, int estimatedTime) {
        this.recipeID = recipeID;
        this.title = title;
        this.difficultyLevel = difficultyLevel;
        this.estimatedTime = estimatedTime;
        this.steps = new ArrayList<>();
        this.ingredients = new ArrayList<>();
    }

    // Adds a new step to the recipe
    public void addStep(Step step) {
        this.steps.add(step);
    }

    // Adds a new ingredient to the recipe
    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    // Returns the total number of steps in this recipe
    public int getTotalSteps() {
        return this.steps.size();
    }

    // Returns a formatted string of the recipe details
    public String getRecipeDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Recipe ID: ").append(recipeID).append("\n");
        details.append("Title: ").append(title).append("\n");
        details.append("Difficulty: ").append(difficultyLevel).append("\n");
        details.append("Estimated Time: ").append(estimatedTime).append(" mins\n");
        
        details.append("Ingredients:\n");
        for (Ingredient ing : ingredients) {
            details.append(" - ").append(ing.getIngredientName()).append(" (").append(ing.getCategory()).append(")\n");
        }
        
        details.append("Steps:\n");
        for (Step step : steps) {
            details.append(" ").append(step.getStepOrder()).append(". ").append(step.getInstruction()).append("\n");
        }
        return details.toString();
    }

    // Encapsulation: Standard Getters and Setters
    public int getRecipeID() { return recipeID; }
    public void setRecipeID(int recipeID) { this.recipeID = recipeID; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDifficultyLevel() { return difficultyLevel; }
    public void setDifficultyLevel(String difficultyLevel) { this.difficultyLevel = difficultyLevel; }
    public int getEstimatedTime() { return estimatedTime; }
    public void setEstimatedTime(int estimatedTime) { this.estimatedTime = estimatedTime; }
    public List<Ingredient> getIngredients() { return ingredients; }
}
