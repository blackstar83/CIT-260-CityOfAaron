package view;

import java.util.Scanner;

/**
 *
 * @author apere
 */
public class SaveGameView extends ViewBase {

    public SaveGameView() {

    }

    @Override
    protected String getMessage() {
        return "Save Game\n"
                + " I - Save Game\n"
                + " Q - Quit\n";
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

    private void saveGame() {

        // NewGameView view = new NewGameView();
        //view.displayView();
        System.out.println("Success your game has been saved.");
    }

}
