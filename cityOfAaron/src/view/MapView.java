/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.*;
import control.MapControl;

/**
 *
 * @author apere
 */
public class MapView extends ViewBase {

    public MapView() {
        // empty constructor
    }

    @Override
    protected String getMessage() {

        return null;
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // this view is not interactive, all it does is show the game description
        return null;

    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {

        // return false if you want this view to exit and return
        // to the view that called it.
        displayMap();
        return false;
    }

    public void displayMap() {
        this.console.println("The City of Aaron,");
        this.console.println("The map of the city. Where do you want to go?");
        this.console.println("*****************************");

        Map map = MapControl.createMap();
        Location[][] locations = map.getLocations();

        for (int i = 0; i < locations.length; i++) {

            for (int j = 0; j < locations[i].length; j++) {
                this.console.printf("%5s", map.getLocations()[i][j].getMapSymbol());
            }
            System.out.println();
        }
        this.console.println("*******************************");
        this.console.println("C - Ruler's Court");
        this.console.println("G - Granary/Storehouse");
        this.console.println("F - Field");
        this.console.println("U - Undeveloped land");
        this.console.println("V - Village");
        this.console.println("R - River");
        this.console.println("L - Lamanite lands");
        this.console.println("T - Temple");
        this.console.println("W - Watchtower\n");

        pause(3000);
    }

}
