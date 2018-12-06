
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import java.io.BufferedReader;
import model.Game;
import view.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author gj3593
 */
public class CityOfAaron {
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    // Keep copy of the current Game object in the main Class.
    //public static Game currentGame = null;
    public static PrintWriter getOutFile(){
        return outFile;
    }
    public static void setOutFile(PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }
    
    public static Game currentGame = null;
    public static Game getCurrentGame() {
        return currentGame;
    }
    public static void setCurrentGame(Game game) {
        currentGame = game;
    }
    public static BufferedReader getInFile() {
        return inFile;
    }
    public static void setInFile(BufferedReader inFile) {
        CityOfAaron.inFile = inFile;
    }
    //public static Game currentGame = null;
    //public static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            CityOfAaron.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            CityOfAaron.outFile = new PrintWriter(System.out, true);
            StartProgamView startProgamView = new StartProgamView();
            startProgamView.displayView();

        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString() +
                                "\nCause: " + e.getCause() +
                                "\nMessage: " + e.getMessage()
            );
            e.printStackTrace();;
        }
        finally {
            try {
            if (CityOfAaron.inFile != null)
                CityOfAaron.inFile.close();
            if (CityOfAaron.outFile != null)
                CityOfAaron.outFile.close();
        } catch (IOException ex) {
                ex.printStackTrace();
    }
    }
    }
    //@Override
    public String getInput() {
        boolean valid = false;
        String selection = null;
        try {
            while(!valid) {
               // selection = this.keyboard.readLine();
                selection = selection.trim();
            if(selection.length() < 1){
                System.out.println("You must enter a value.");
                continue;
            }
            break;
            }
        } catch(Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return selection;
    }
}
