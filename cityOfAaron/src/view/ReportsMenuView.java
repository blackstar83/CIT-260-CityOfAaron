package view;

import java.util.Scanner;
import view.*;

/**
 *
 * @author gj3593
 */
public class ReportsMenuView {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public ReportsMenuView() {

        message = "Reports Menu\n"
                + "---------\n"
                + "A - View the animals in the storehouse\n"
                + "B - View the tools in the storehouse\n"
                + "C - View the provisions in teh storehouse\n"
                + "D - Viewthe authors of this game\n";
    }

    /**
     * Get the user's input. Keep prompting them until they enter a value.
     *
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a
     * return key)
     * @return
     */
    protected String getUserInput(String prompt, boolean allowEmpty) {

        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;

        while (inputReceived == false) {

            System.out.println(prompt);
            input = keyboard.nextLine();

            // Make sure we avoid a null-pointer error.
            if (input == null) {
                input = "";
            }

            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();

            if (input.equals("") == false || allowEmpty == true) {
                inputReceived = true;
            }
        }

        return input;
    }

    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we
     * don't have to type it ourselves.
     *
     * @param prompt
     * @return
     */
    protected String getUserInput(String prompt) {
        return getUserInput(prompt, false);
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    public String[] getInputs() {

        String[] inputs = new String[1];
        inputs[0] = getUserInput("Your Choice:");

        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs) {

        switch (inputs[0].trim().toUpperCase()) {
            case "A":
                viewAnimals();
                saveReports();
                break;
            case "B":
                viewTools();
                saveReports();
                break;
            case "C":
                viewProvisions();
                saveReports();
                break;
            case "D":
                viewAuthors();
                saveReports();
                break;
        }

        return true;
    }

    /**
     * Control this view's display/prompt/action loop until the user chooses and
     * action that causes this view to close.
     */
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {

            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }

    private void viewAnimals() {

        System.out.println("*** viewAnimals() called. Implementation coming soon.");
    }

    private void viewTools() {

        System.out.println("*** viewTools() called. Implementation coming soon.");
    }

    private void viewProvisions() {

        System.out.println("*** viewProvisions() called. Implementation coming soon.");
    }

    private void viewAuthors() {

        System.out.println("*** viewAuthors() called. Implementation coming soon.");
    }

    private void saveReports() {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to save the report? Yes or No");
        String saveInput = input.nextLine();

        if (saveInput.equals("Yes") || saveInput.equals("yes")) {

            System.out.println("Enter the name of the file you want to save.");
            String fileName = input.nextLine();

            System.out.println("*** Save File Implementation coming soon.");

        } else if (saveInput.equals("No") || saveInput.equals("no")) {
        }
    }

    private void mainMenuView() {

        MainMenuView view = new MainMenuView();
        view.displayView();
    }

}
