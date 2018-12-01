
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import model.Game;
import view.*;

/**
 *
 * @author gj3593
 */
public class CityOfAaron {

    // Keep copy of the current Game object in the main Class.
    public static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game game) {
        currentGame = game;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            View startProgramView = new StartProgamView();
            startProgramView.displayView();

        } catch (Throwable te) {

            System.out.println("Exception Handling Error");
            System.out.print(te.getMessage());
            te.printStackTrace();
            System.exit(0);
        }
    }
}
