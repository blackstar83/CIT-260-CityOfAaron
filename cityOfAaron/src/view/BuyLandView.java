/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Yazzie Family
 */
public class BuyLandView extends ViewBase {

    /**
     * Constructor
     */
    public BuyLandView() {

    }

    @Override
    protected String getMessage() {
        return "Buy Land View.\n"
                + "B – Buy Land.\n"
                + "E – Exit.\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Change this text to prompt the user for the input.");

        // Repeat for each input you need, putting it into its proper slot in the array.
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
            case "B":
                buyLand();
                break;
            case "E":
                System.out.println("You are now exiting the buy land option.");
                return false;
        }
        return true;
    }

    private void buyLand() {
        System.out.println("*** buyLand() called. Implementation coming soon.\n");
    }
}