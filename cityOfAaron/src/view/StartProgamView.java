package view;

import java.util.Scanner;

/**
 *
 * @author gj3593
 */
public class StartProgamView {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public StartProgamView() {

        message = "Welcome to the City of Aaron!\n\n"
                + "TODO: Fill in the description with your own\n"
                + "game description.\n";
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

        // This view is not interactive. All it does is shows 
        // the game description.
        return null;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs) {
        // There are not inputs for this view. We're just going to pause
        // for a couple of seconds, and then launch the MainMenuView.
        startMainMenuView();
        // return false so whoever called us doesn't call us again.

        return false;
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

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    private void startMainMenuView() {
        // Pause for a couple of seconds.
        try {
            Thread.sleep(2000);
        } catch (InterruptedException exception) {
            //ignore this exception for now.
        }

        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}
