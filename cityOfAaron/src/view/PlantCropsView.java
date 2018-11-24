/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author apere
 */
public class PlantCropsView extends ViewBase {

    public PlantCropsView() {

    }

    @Override
    protected String getMessage() {
        return "Plant some crops!";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        inputs[0] = getUserInput("How many acres of land do you want to plant?");

        return inputs;
    }

    /**
     * Perform the action indicated by the user.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {

        someActionHandler();
        System.out.println("Implementation coming soon, back to the Manage Crops Menu!!");
        return false;
    }

    private boolean someActionHandler() {

        return true;
    }
}
