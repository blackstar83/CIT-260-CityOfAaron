package view;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

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
                this.console.println("Success Game Saved. Good-bye.");
                return false;
        }

        return true;
    }

    private void saveGame() {

        FileWriter outFile = null;
        String fileLocation = "players.txt";
        try {
            outFile = new FileWriter(fileLocation);

            outFile.write("Arturo\n");
            outFile.write("Gleyn\n");

            outFile.flush();
        } catch (IOException ex1) {
            ErrorView.display(this.getClass().getName(),
                    "Error reading input: " + ex1.getMessage());
        } finally {
            if (outFile != null) {
                try {
                    outFile.close();
                } catch (IOException ex2) {
                    ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + ex2.getMessage());
                }
            }
        }

    }

}
