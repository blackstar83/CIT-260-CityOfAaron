package view;

import model.*;
import cityofaaron.CityOfAaron;

/**
 *
 * @author gj3593
 */
public class ReportsMenuView extends ViewBase {

    public ReportsMenuView() {

    }

    @Override
    protected String getMessage() {
        return "Welcome to: Reports Menu.\n"
                + "A - View the animals in the storehouse\n"
                + "T - View the tools in the storehouse\n"
                + "P - View the provisions in the storehouse\n"
                + "G - View the authors of this game\n"
                + "Q - Back to Game Menu\n";
    }

    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Please make your selection.");

        // Repeat for each input you need, putting it into its proper slot in the array.
        // Create a function for this to call
        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {

        switch (inputs[0].trim().toUpperCase()) {
            case "A":
                animalsInStorehouse();
                break;
            case "T":
                toolsInStorehouse();
                break;
            case "P":
                provisionsInStorehouse();
                break;
            case "G":
                author();
                break;
            case "Q":
                this.console.println("Back to Reports Menu...");
                return false;
        }

        return true;

    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private boolean animalsInStorehouse() {

        this.console.println("These are the available animals in the storehouse.");
        Game game = CityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getTheStorehouse();
        Animal[] animals = storehouse.getAnimals();

        if (animals == null) {
            this.console.println("No animals available.");
        } else {
            String animalName;
            int animalCount;
            for (int i = 0; i < animals.length; i++) {
                animalName = animals[i].getName();
                animalCount = animals[i].getQuantity();
                this.console.println(animalCount + " " + animalName);
            }
            long total = 0;
            for (Animal animal : animals) {
                animalCount = animal.getQuantity();
                total += animalCount;
            }
            this.console.println("There is a total of " + total + "animals in the Storehouse.");
        }
        return true;
    }

    private void toolsInStorehouse() {
        this.console.println("These are the available tools for you to use.");
        Game game = CityOfAaron.getCurrentGame();
        Storehouse storehouse = game.getTheStorehouse();
        InventoryItem[] tools = storehouse.getTools();

        if (tools == null) {
            this.console.println("No tools available.");
        } else {
            String toolName;
            int toolCount;
            for (int i = 0; i < tools.length; i++) {
                toolName = tools[i].getName();
                toolCount = tools[i].getQuantity();
                this.console.println(toolCount + " " + toolName);
            }
            long total = 0;
            for (InventoryItem tool : tools) {
                toolCount = tool.getQuantity();
                total += toolCount;
            }
            this.console.println("There is a total of " + total + " tools in the Storehouse.");
        }

    }

    private boolean provisionsInStorehouse() {
        this.console.println("Provisons in Storehouse coming soon!");
        return true;
    }

    private boolean author() {
        this.console.println("Created by");
        return true;
    }

}
