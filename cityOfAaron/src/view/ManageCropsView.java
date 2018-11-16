package view;

import java.util.Scanner;
import view.*;

/**
 *
 * @author gj3593
 */
public class ManageCropsView extends ViewBase {

    /**
     * Constructor
     */
    public ManageCropsView() {

    }

    @Override
    protected String getMessage() {
        return "Manage Crops Menu\n"
                + "---------\n"
                + "A - Buy land\n"
                + "B - Sell land\n"
                + "C - Feed the people\n"
                + "D - Plant crops\n"
                + "E - Pay tithes and offerings\n"
                + "F - Return to the Game Menu\n";
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
                buyLandView();
                break;
            case "B":
                sellLandView();
                break;
            case "C":
                feedThePeopleView();
                break;
            case "D":
                plantCropsView();
                break;
            case "E":
                payTithesView();
                break;
            case "F":
                return false;
        }

        return true;
    }

    private void buyLandView() {

        BuyLandView view = new BuyLandView();
        view.displayView();
        //System.out.println("*** buyLandView() called. Implementation coming soon.");
    }

    private void sellLandView() {

        SellLandView view = new SellLandView();
        view.displayView();
        //System.out.println("*** sellLandView() called. Implementation coming soon.");
    }
    
    private void feedThePeopleView() {
        FeedThePeopleView view = new FeedThePeopleView();
        view.displayView();
        //System.out.println("*** sellLandView() called. Implementation coming soon.");
    }
    
    private void plantCropsView() {
        PlantCropsView view = new PlantCropsView();
        view.displayView();
        //System.out.println("*** sellLandView() called. Implementation coming soon.");
    }
    
    private void payTithesView() {
        PayTithesView view = new PayTithesView();
        view.displayView();
        //System.out.println("*** sellLandView() called. Implementation coming soon.");
    }
    /**
     * All your new methods will go here.
     */

}
