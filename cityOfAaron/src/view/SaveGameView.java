package view;

import java.io.IOException;
import cityofaaron.CityOfAaron;
import exceptions.GameControlException;
import model.Game;
import control.GameControl;
/**
 *
 * @author apere
 */
public class SaveGameView extends ViewBase {

    public SaveGameView() {

    }

    @Override
    protected String getMessage() {
        return "Saving Game!";
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
    public boolean doAction(String[] inputs){
        
       String filePath = inputs[0];
       Game game = CityOfAaron.getCurrentGame();
       
         try {
           GameControl.saveGameToFile(game, filePath);
       } catch(GameControlException gce) {
           ErrorView.display(this.getClass().getName(), gce.getMessage());
           return false;
       } catch (IOException ex) {
            ErrorView.display(this.getClass().getName(), "I/O Error: " + ex.getMessage());
        }
         this.console.println("Game has been saved as " + filePath);
         return false;
        }
    }

