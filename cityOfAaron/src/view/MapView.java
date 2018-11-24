/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Map;
import model.Location;
import control.MapControl;
import model.Game;

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
        return "Welcome the city of Aaron!\n"
                + "-------------------\n"
                + " City's Map:\n"
                + "[W][F][R][T][G]\n"
                + "[C][U][V][L][F]\n"
                + "[R][T][G][C][U]\n"
                + "[V][L][F][R][T]\n"
                + "[G][C][U][V][W]\n"
                + "-------------------\n"
                + "Map's Definitions:\n"
                + "C = Ruler's Court\n"
                + "F = Field\n"
                + "G = Granary\n"
                + "L = Lamanite Lands\n"
                + "R = River\n"
                + "T = Temple\n"
                + "U = Undeveloped Land\n"
                + "V = Village\n"
                + "W = Watchtower\n\n"
                + "-------------------\n"
                + "More options:\n"
                + "M = Move to location on the map\n"
                + "E = Leave the Map Menu\n"
                ;
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Please make a selection:");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        // Create a function for this to call
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        
        // return false if you want this view to exit and return
        // to the view that called it.
       switch (inputs[0].trim().toUpperCase()){
            case "M":
                moveLocations();
                break;
            case "E":
                System.out.println("You are returning to the game menu.\n");
                return false;
        }
        
        return true;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private boolean moveLocations(){
        //NewLocationView view = new NewLocationView();
        //view.displayView();
        System.out.println("IMPLEMENTATION COMING SOON\n");
        return false;
    }
    
}