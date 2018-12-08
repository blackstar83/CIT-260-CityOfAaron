package view;

import java.util.Scanner;
import control.GameControl;
import exceptions.GameControlException;
import java.io.IOException;
/**
 *
 * @author apere
 */
public class LoadGameView extends ViewBase {

    public LoadGameView() {

    }

    @Override
    protected String getMessage() {
        return "Load Saved Game\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];
        inputs[0] = getUserInput("Your Choice:"
         + "\t\t-OR-\n"
         + "Press Enter to return to the Main Menu", true);

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

        String filePath = inputs[0];

        try {
            GameControl.testInput(inputs);
            GameControl.loadGameFromFile(filePath);
        } catch (GameControlException ex) {
            ErrorView.display(this.getClass().getName(), ex.getMessage());
            return false;
        } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "I/O Error: " + ex.getMessage());
        }

        View gameMenu = new GameMenuView();
        gameMenu.displayView();

        return false;
    }
    }
