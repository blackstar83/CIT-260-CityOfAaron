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
public class SellLandView extends ViewBase {

    /**
     * Constructor
     */
    public SellLandView() {

    }

    @Override
    protected String getMessage() {
        return "Sell Land View.\n"
                + "S – Sell Land.\n"
                + "E – Exit.\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        inputs[0] = getUserInput("Change this text to prompt the user for the input.");

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
            case "S":
                sellLand();
                break;
            case "E":
                this.console.println("You are now exiting the buy land option.");
                return false;
        }
        return true;
    }

    private void sellLand() {
        this.console.println(" Implementation coming soon.\n");
    }
}
