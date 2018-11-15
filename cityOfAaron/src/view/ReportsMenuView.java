package view;

import java.util.Scanner;
import view.*;

/**
 *
 * @author gj3593
 */
public class ReportsMenuView extends ViewBase {

    /**
     * Constructor
     */
    public ReportsMenuView() {

    }

    @Override
    protected String getMessage() {
        return "Reports Menu\n"
                + "---------\n"
                + "A - View the animals in the storehouse\n"
                + "B - View the tools in the storehouse\n"
                + "C - View the provisions in teh storehouse\n"
                + "D - Viewthe authors of this game\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        inputs[0] = getUserInput("Your Choice:");

        return inputs;
    }

    public String[] saveReport() {

        String[] inputs = new String[1];
        inputs[0] = getUserInput("Do you want to save the report? Yes or No");

        if (inputs[0].equalsIgnoreCase("Yes")) {

            getUserInput("Enter the name of the file you want to save.", false);
            System.out.println("File Saved implementation coming soon...");

        } else if (inputs[0].equals("No")) {

        }

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
                viewAnimals();
                saveReport();
                break;
            case "B":
                viewTools();
                saveReport();
                break;
            case "C":
                viewProvisions();
                saveReport();
                break;
            case "D":
                viewAuthors();
                saveReport();
                break;
        }

        return false;
    }

    private void viewAnimals() {

        System.out.println("*** viewAnimals() called. Implementation coming soon.\n");
    }

    private void viewTools() {

        System.out.println("*** viewTools() called. Implementation coming soon.\n");
    }

    private void viewProvisions() {

        System.out.println("*** viewProvisions() called. Implementation coming soon.\n");
    }

    private void viewAuthors() {

        System.out.println("*** viewAuthors() called. Implementation coming soon.\n");
    }
}
