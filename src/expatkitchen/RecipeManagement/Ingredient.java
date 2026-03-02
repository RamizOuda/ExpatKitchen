package expatkitchen.RecipeManagement;

import java.util.Objects;





public class Ingredient {
    private int ingredientID;
    private String name;
    private String category;

    // Constructor
    public Ingredient(int ingredientID, String name, String category) {
        this.ingredientID = ingredientID;
        this.name = name;
        this.category = category;
    }

    // Encapsulation: Private attributes accessed via Getters and Setters
    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public String getIngredientName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}