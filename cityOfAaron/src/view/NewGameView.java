package view;

import cityofaaron.CityOfAaron;
import model.*;
import control.*;

/**
 *
 * @author gj3593
 */
public class NewGameView extends ViewBase {

    /**
     * Constructor
     */
    public NewGameView() {

    }

    @Override
    protected String getMessage() {
        return "Starting a new game...\n\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        inputs[0] = getUserInput("Please enter your name, or press 'Enter' to return to the Main Menu:", true);

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
        // There is only one action here: Initialize the Game
        // and set it in the main CityOfAaron class.

        //If the user just hit 'enter' , then bail out without
        //doing the action. Returning false will take us back
        //to the main menu.
        if (inputs[0] == null || inputs[0].equals("")) {
            System.out.println("No player name entered. Returning to the Main menu...");
            return false;
        }

        String playerName = inputs[0];
        createAndStartGame(playerName);

        //Return false so we don't loop.
        return false;
    }

    /**
     * Create a new Game with the named Player and call the GameMenuView.
     */
    private void createAndStartGame(String playerName) {

        Game game = GameControl.createNewGame(playerName);

        CityOfAaron.setCurrentGame(game);

        System.out.println();
        System.out.println("Welcome: " + CityOfAaron.getCurrentGame().getThePlayer().getName() + "!\n");
        //System.out.println("Welcome to the game, " + CityOfAaron.getCurrentGame().getThePlayer().getName() + "!\n"
        //+ "The Current Annual Report will be displayed here.\n"
        //+ "\n"
        //+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n"
        //+ "Pellentesque maximus orci et tellus ultricies, consectetur auctor nibh euismod.\n"
        //+ "Donec vehicula mauris eget libero molestie, nec viverra diam egestas.\n"
        //+ "Fusce condimentum sem sed dolor porttitor, pellentesque finibus nisi iaculis.\n");

        // Once the GameMenuView is created, we will call it here.
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayView();
    }
}
