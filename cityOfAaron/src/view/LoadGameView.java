package view;

import java.util.Scanner;

/**
 *
 * @author apere
 */
public class LoadGameView extends ViewBase {

    public LoadGameView() {

    }

    @Override
    protected String getMessage() {
        return "Load Game\n"
                + " N - Load New Game\n"
                + " S - Load Saved Game\n"
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
            // If option 1, call loadGame()
            case "N":
                loadNewGame();
                break;
            case "S":
                loadSavedGame();
                break;
            case "Q":
                System.out.println("Exit Load Game. Good-bye.");
                return false;
        }

        return true;
    }

    public void loadGameMenu() {
        boolean keepGoing = true;

        while (keepGoing == true) {

        }
    }

    private void loadNewGame() {

        LoadGameView view = new LoadGameView();
        System.out.println(" Implementation coming soon.");
    }

    private void loadSavedGame() {
        //LoadGameView view = new LoadGameView();
        //view.displayView();
        System.out.println("Implementation coming soon.");
    }
}
