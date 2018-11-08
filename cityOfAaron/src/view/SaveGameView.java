package view;

import java.util.Scanner;        
/**
 *
 * @author apere
 */

public class SaveGameView {
    
    protected String message;
   
    public SaveGameView() {
        
        message = "Save Game\n"
                + " I - Save Game\n" 
                + " Q - Quit\n";
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
            // If option 1, call saveGame()
            case "I":
                saveGame();
                break;    
            case "Q":
                System.out.println("Success Game Saved. Good-bye.");
                return false;
        }

        return true;
    }
    
    public void saveGameMenu() {
        boolean keepGoing = true;

        while (keepGoing == true) {

            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
}

  private void saveGame() {

        // NewGameView view = new NewGameView();
        //view.displayView();
        System.out.println("Success your game has been saved.");
    }
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {

            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
}
