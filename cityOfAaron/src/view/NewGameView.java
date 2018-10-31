package view;

import cityofaaron.CityOfAaron;
import model.Player;
import model.Game;
import java.util.Scanner;

/**
 *
 * @author gj3593
 */
public class NewGameView {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public NewGameView() {

        message = "Starting a new game...\n\n";

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

    /**
     * Create a new Game with the named Player and call the GameMenuView.
     */
    private void createAndStartGame(String playerName) {

        // Eventuallu, we will do this:
        // Game game = GameControl.createNewGame(playerNmae);
        //
        // but for this week, we'll just do this...
        Player player = new Player();
        player.setName(playerName);

        Game game = new Game();
        game.setThePlayer(player);

        CityOfAaron.setCurrentGame(game);

        System.out.println();
        System.out.println("Welcome to the game, " + CityOfAaron.getCurrentGame().getThePlayer().getName() + "!\n"
                + "Next week we will have a GameMenuView that you will see. But for now,\n"
                + "we're just going to send you back to the Main Menu.\n");

        // Once the GameMenuView is created, we will call it here.
        // GameMenuView gameMenu = new GameMenuView();
        // gameMenu.displayView();
    }
}
