package view;

import model.*;

/**
 *
 * @author gj3593
 */
public class ReportsMenuView extends ViewBase {

    public ReportsMenuView() {

    }

    @Override
    protected String getMessage() {
        return "WELCOME TO: REPORTS MENU.\n"
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
                loadAnimalsInStorehouse();
                break;
            case "T":
                loadToolsInStorehouse();
                break;
            case "P":
                loadProvisionsInStorehouse();
                break;
            case "G":
                loadAuthor();
                break;
            case "Q":
                System.out.println("Back to Reports Menu...");
                return false;
        }

        return true;

    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private boolean loadAnimalsInStorehouse() {
        System.out.println("Animals in Storehouse coming soon!");
        return true;
    }

    private boolean loadToolsInStorehouse() {
        System.out.println("Tools in Storehouse coming soon!");
        return true;
    }

    private boolean loadProvisionsInStorehouse() {
        System.out.println("Provisons in Storehouse coming soon!");
        return true;
    }

    private boolean loadAuthor() {
        System.out.println("Created by");
        return true;
    }

}
