package control;

import java.util.Random;
import model.*;

public class GameControl {

    private static Random randomGenerator = new Random();

    // create random number object for testing
    protected static void setRandomGenerator(Random random) {
        randomGenerator = random;
    }

    public static int getRandomNumber(int lowNumber, int highNumber) {

        if (lowNumber < 0 || highNumber < 0) {
            return -1;
        }
        //return -2
        if (highNumber <= lowNumber) {
            return -2;
        }

        // return -3
        if (highNumber == Integer.MAX_VALUE) {
            return -3;
        }

        int range = (highNumber - lowNumber) + 1;
        
        return lowNumber + randomGenerator.nextInt(range);

    }

    public static String loadGameFromFile(String filename) {
     
        String name = filename;

        return name;

    }

    public static boolean gameShouldEnd(int mortalityRate) {

        if (mortalityRate > 50) {
            return true;
        }
        return false;
    }

    public static boolean gameMatures(int yearNumber) {
        if (yearNumber > 10) {
            return true;
        }
        return false;
    }

    public static void saveGameToFile(Game game, String filename) {

    }

    public static void saveReportToFile(String[] filename) {

    }

    public static Game createNewGame(String playerName) {
        

        Player player = new Player();
        player.setName(playerName);

        Game game = new Game();
        game.setThePlayer(player);

        game.setCurrentPopulation(100);
        game.setAcresOwned(1000);
        game.setWheatInStorage(2700);

        Map theMap = MapControl.createMap();
        game.setTheMap(theMap);
        
        return game;
    }
    }