package expatkitchen.RecipeManagement;






public class Step {
    private int stepID;
    private int stepOrder;
    private String instructionText;

    // Constructor
    public Step(int stepID, int stepOrder, String instructionText) {
        this.stepID = stepID;
        this.stepOrder = stepOrder;
        this.instructionText = instructionText;
    }

    // Encapsulation: Getters and Setters
    public int getStepID() {
        return stepID;
    }

    public void setStepID(int stepID) {
        this.stepID = stepID;
    }

    public int getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(int stepOrder) {
        this.stepOrder = stepOrder;
    }

    public String getInstruction() {
        return instructionText;
    }

    public void setInstructionText(String instructionText) {
        this.instructionText = instructionText;
    }
}
