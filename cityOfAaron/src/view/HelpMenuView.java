
package view;

import java.util.Scanner;
import view.*;

import java.util.Scanner;
import view.*;

/**
 *
 * @author gj3593
 */
public class HelpMenuView {
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public HelpMenuView() {

        message = "Help Menu\n"
                + "---------\n"
                + "The options on the help menu are: \n"
                + "A. What are the goals of the game?\n"
                + "B. Where is the city of Aaron?\n"
                + "C. How do I view the map?\n"
                + "D. How do I move to another location?\n"
                + "E. How do I display a list of animals, provisions and tools in the city storehouse?\n"
                + "F. Back to the Main Menu.";
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
                System.out.println("TODO What are the goals of the game.....?");
                break;
            case "B":
                System.out.println("TODO Where is the city of Aaron.....?");
                break;
            case "C":
                System.out.println("TODO How do I view the map....?");
                break;
            case "D":
                System.out.println("TODO How do I move to another location.....?");
                break;
            case "E":
                System.out.println("TODO How do I display a list of animals, provisions and tools in the city storehouse?");
                break;
            case "F":
                mainMenu();
                return false;
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

    private void mainMenu() {

        MainMenuView view = new MainMenuView();
        view.displayView();
    }
}
