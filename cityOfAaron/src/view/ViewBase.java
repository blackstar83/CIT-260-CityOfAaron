package view;

import java.util.Scanner;

/**
 *
 * @author gj3593
 */
public abstract class ViewBase implements View {

    //constructor
    public ViewBase() {
    }

    /**
     * getting view content, this will allow the view to have dynamic content it
     * can change each time it's displayed
     */
    protected abstract String getMessage();

    /**
     * get and set input from user
     *
     * @return
     */
    protected abstract String[] getInputs();

    /**
     * perform action based on user's input
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to previous view
     */
    public abstract boolean doAction(String[] inputs);

    /**
     * control this view's display/prompt/action loop until user chooses an
     * action that causes this view to close.
     */
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {

            // get message that should be displayed
            // only print if it is non-null
            String message = getMessage();
            if (message != null) {
                System.out.println(getMessage());
            }

            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }

    /**
     * Get the user's input. Keep prompting them until they enter a value.
     *
     * @param prompt
     * @param allowEmpty - determines whether the user can enter no value (just
     * a return key)
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
     * pause the program for the specified amount of milliseconds
     *
     * @param milliseconds
     */
    protected static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) {
            // do nothing
        }
    }
    
    protected static int stringToInt (String[] inputs) {
        
         boolean inputValid = false;
         int stringToNum = 0;

            try {
                stringToNum = Integer.parseInt(inputs[0]);
                if (stringToNum < 0) {
                System.out.println("Please enter a positive number.");
                } else {
                inputValid = true;
                }
            } catch(NumberFormatException ex) {
                System.out.println("Please enter a number.");
            }
     
        return stringToNum;    
    }
    
}