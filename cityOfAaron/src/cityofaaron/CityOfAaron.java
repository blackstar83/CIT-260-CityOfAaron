
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
import model.*;

/**
 *
 * @author gj3593
 */
public class CityOfAaron {

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    

    // Keep copy of the current Game object in the main Class.
    //public static Game currentGame = null;
    public static PrintWriter getOutFile() {
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
    public static Player player = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CityOfAaron.logFile = logFile;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            CityOfAaron.inFile
                    = new BufferedReader(new InputStreamReader(System.in));
            CityOfAaron.outFile = new PrintWriter(System.out, true);
            StartProgamView startProgamView = new StartProgamView();
            startProgamView.displayView();

        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage()
            );
            e.printStackTrace();;
        } finally {
            try {
                if (CityOfAaron.inFile != null) {
                    CityOfAaron.inFile.close();
                }
                if (CityOfAaron.outFile != null) {
                    CityOfAaron.outFile.close();
                }
                if (CityOfAaron.logFile != null){
                    CityOfAaron.logFile.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
}
