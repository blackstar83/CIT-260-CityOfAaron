package view;

import java.util.Scanner;
import view.*;

/**
 *
 * @author gj3593
 */
public class GameMenuView {

    /**
     * The message that will be displayed by this view.
     */
    protected String message;

    /**
     * Constructor
     */
    public GameMenuView() {

        message = "Game Menu\n"
                + "---------\n"
                + "A - View the map\n"
                + "B - Move to a new location\n"
                + "C - Manage the Crops\n"
                + "D - Live the year\n"
                + "E - Reports Menu\n"
                + "F - Save Game\n"
                + "G - Return to the Main Menu\n";
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
                viewMapView();
                break;
            case "B":
                newLocationView();
                break;
            case "C":
                manageCropsView();
                break;
            case "D":
                liveYearView();
                break;
            case "E":
                reportsMenuView();
                break;
            case "F":
                saveGameView();
                break;
            case "G":
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

    private void viewMapView() {

        //ViewMapView view = new ViewMapView();
        //view.displayView();
        System.out.println("*** viewMapView() called. Implementation coming soon.");
    }

    private void newLocationView() {
        
        //NewLocationView view = new NewLocationView();
        //view.displayView();
        System.out.println("*** newLocationView() called. Implementation coming soon.");
    }

    private void manageCropsView() {
        
        //ManageCropsView view = new ManageCropsView();
        //view.displayView();
        System.out.println("*** manageCropsView() called. Implementation coming soon.");
    }

    private void liveYearView() {
        
        //LiveYearView view = new LiveYearView();
        //view.displayView();
        System.out.println("*** liveYearView() called. Implementation coming soon.");
    }

    private void reportsMenuView() {
        
        ReportsMenuView view = new ReportsMenuView();
        view.displayView();
        //System.out.println("*** reportsMenuView() called. Implementation coming soon.");
    }
    
    private void saveGameView() {
        
        SaveGameView view = new SaveGameView();
        view.displayView();
        //System.out.println("*** saveGameView() called. Implementation coming soon.");
    }

    private void mainMenuView() {
        
        MainMenuView view = new MainMenuView();
        view.displayView();
    }
}
