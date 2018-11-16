package view;

import java.util.Scanner;
import view.*;

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

}
