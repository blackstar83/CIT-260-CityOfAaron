/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.WheatControlException;
import control.WheatControl;

import java.util.Scanner;

/**
 *
 * @author apere
 */
public class PayTithesView extends ViewBase {

    public PayTithesView() {

    }

    @Override
    protected String getMessage() {
        return "Will a man rob God?.";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        String[] inputs = new String[1];

        inputs[0] = getUserInput("What percentage of tithes and offerings will you pay?");

        return inputs;
    }

    /**
     * Perform the action indicated by the user
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {

        
        int tithes = 0;
        boolean inputValid = false;

        try {
            tithes = Integer.parseInt(inputs[0]);
            if (WheatControl.checkTithing(tithes) == false) {
                ErrorView.display(this.getClass().getName(), "Tithing value of "
                        + tithes
                        + " is invalid. It should be between 0 and 100.");
                return true;
            }
            inputValid = true;
            saveTithes(tithes);
        } catch (NumberFormatException ex) {
            ErrorView.display(this.getClass().getName(), "Please enter a number.");
        }

        return !inputValid;
    }
 private void saveTithes(int tithingPercent) {
        //TODO stub function, to be completed after AnnualReport is implemented 
        this.console.println("Saving tithing percent");
    }

}
