package view;

import java.util.Scanner;
import view.*;
import control.GameControl;
import exceptions.GameControlException;

/**
 *
 * @author gj3593
 */
public class GameMenuView extends ViewBase {

    /**
     * Constructor
     */
    public GameMenuView() {

    }

    @Override
    protected String getMessage() {
        return "Game Menu\n"
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
            case "A":
                mapView();
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

    @Override //using this override to place getAnnualReport and gameShouldEnd inside displayView while loop.
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {
            //display the annual report 
            getAnnualReport();

            if (GameControl.gameShouldEnd(0)) {
                this.console.println("Most of your people are dead!! Try again.");
                return;

            } else if (GameControl.gameMatures(1)) {
                //TODO when fully implemented, this will contain currentYear variable from annual report.
                //TODO create end of game report showing total game statistics. Use Annual Report format but bring in stats from every year.
                this.console.println("You Succeeded!! After 10 Years, your people are alive!!");
                return;
            }
            // get message that should be displayed
            // only print if it is non-null
            String message = getMessage();
            if (message != null) {
                this.console.println(getMessage());
            }
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }

    private void mapView() {

        MapView view = new MapView();
        view.displayView();
        //System.out.println("*** viewMapView() called. Implementation coming soon.");
    }

    private void newLocationView() {

        View newLocationView = new NewLocationView();
        newLocationView.displayView();
        //System.out.println("*** newLocationView() called. Implementation coming soon.");
    }

    private void manageCropsView() {

        View manageCropsMenu = new ManageCropsView();
        manageCropsMenu.displayView();
        //System.out.println("*** manageCropsView() called. Implementation coming soon.");
    }

    private void liveYearView() {

        //LiveYearView view = new LiveYearView();
        //view.displayView();
        this.console.println(" Implementation coming soon.");
    }

    private void reportsMenuView() {
        ReportsMenuView reportsMenu = new ReportsMenuView();
        reportsMenu.displayView();
        //System.out.println("*** reportsMenuView() called. Implementation coming soon.");
    }

    private void saveGameView() {

        SaveGameView saveGame = new SaveGameView();
        saveGame.displayView();
        //System.out.println("*** saveGameView() called. Implementation coming soon.");
    }

    private void getAnnualReport() {

        this.console.println("Annual Report\n"
                + "----------------------\n"
                + "The Year Number is 1.\n"
                + "0 people starved.\n"
                + "5 people moved into the city.\n"
                + "The current population is 100.\n"
                + "The number of acres of land owned by the city is 1000.\n"
                + "The number of bushels per acre in this year's harvest is 3.\n"
                + "The total number of bushels of wheat harvested is 3000.\n"
                + "The number of bushels paid in tithes and offerings is 300.\n"
                + "The number of bushels of wheat eaten by rats is 0.\n"
                + "The number of bushels of wheat in store is 2700.\n");

    }

}
