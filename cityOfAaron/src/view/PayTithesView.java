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
            WheatControl.checkTithing(tithes);
            inputValid = true;
        } catch (NumberFormatException ex) {
            this.console.println("Enter a number.");
        } catch (WheatControlException wce) {
            this.console.println(wce.getMessage());
        }

        return !inputValid;
    }

}
