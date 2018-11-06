package view;


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
                System.out.println("You will assume the role of the leader over the city of Aaron. Wheat is the\n"
                        + "staff of life, and is used as the main currency in the city. As ruler over the city, the your task\n"
                        + "is to manage the village’s wheat crops so that the people of the village can be adequately fed,\n"
                        + "while dealing with rats, and random crop yields. The city is blessed when the people pay their\n"
                        + "tithes and offerings. After serving for 10 years, you will be judged by the people. If too\n"
                        + "many people die during the your term of office, you will be removed from office and the game ends.");
                break;
            case "B":
                System.out.println("The City Of Aaron is in vicinity of Ammonihah, near cities of Moroni and Nephihah.");
                break;
            case "C":
                System.out.println("The Map can be accessed in the Game Menu by selecting View The Map.\n"
                        + "The map will contain a 2-dimensional array of locations.\n"
                        + "Each location has a name, a description of what you can see at this location");
                break;
            case "D":
                System.out.println("To move to a new location go to the Game Menu and select Move To A New Location\n"
                        + "You will be prompted to enter the coordinates of the location on the map that you want to\n"
                        + "move to.");
                break;
            case "E":
                System.out.println("A list of animals, provisions and tools in the city storehouse can be viewed in the\n "
                        + "Reports Menu by selecting View The Provisions In The Storehouse.\n");
                break;
            case "F":
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

    private void mainMenuView() {

        MainMenuView view = new MainMenuView();
        view.displayView();
    }
}
