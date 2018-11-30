/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import exceptions.MapControlException;
import control.MapControl;
import model.Point;

/**
 *
 * @DYazz
 */
public class NewLocationView extends ViewBase {

    /**
     * Constructor
     */
    public NewLocationView() {

    }

    @Override
    protected String getMessage() {
        return "Welcome to the Map, Your are going to a new Location";
    }

    //get the set of user inputs
    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get
        // from the user.
        String[] inputs = new String[2];

        inputs[0] = getUserInput(" Enter a Number between 1-5", true);
        inputs[1] = getUserInput(" Enter a Second Number between 1-5", true);

        // Repeat for each input you need, putting it into its proper slot in the array.
        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view. add an exception to this
     * view for group project
     */
    @Override
    public boolean doAction(String[] inputs) {
        // define the variables set to zero
        int row = 0;
        int column = 0;
        boolean inputInt = false;

        try {
            // change the user entered string into an int -parseInt
            row = Integer.parseInt(inputs[0]);
            column = Integer.parseInt(inputs[1]);
            MapControl.checkNewLocation(row, column);
            // created a variable so that we could continue the try
            inputInt = true;
            NewLocationView(row, column);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid number!! Enter numbers between 1-5.\n");

        } catch (MapControlException mce) {
            System.out.println(mce.getMessage());
        }

        return true;
    }

    private void NewLocationView(int row, int column) {
        Point point = new Point();
        point.setRow(row);
        point.setColumn(column);

        // stub because this is not done yet
        System.out.println("Implementation coming soon.\n");
        // TODO send back to the game menu- so we do not have a loop   

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayView();
    }
}