package control;

import java.util.Random;
import model.*;
import cityofaaron.CityOfAaron;

public class GameControl {

    private static Random randomGenerator = new Random();

    // create random number object for testing
    protected static void setRandomGenerator(Random random) {
        randomGenerator = random;
    }

    public static int getRandomNumber(int min, int max) {

        if (min < 0 || max < 0) {
            return -1;
        }
        //return -2
        if (max <= min) {
            return -2;
        }

        // return -3
        if (max == Integer.MAX_VALUE) {
            return -3;
        }

        int range = (max - min) + 1;

        return min + randomGenerator.nextInt(range);

    }

    public static String loadGameFromFile(String filename) {

        String name = filename;

        return name;

    }

    public static boolean gameShouldEnd(int mortalityRate) {

        if (mortalityRate > 0) {
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

        Storehouse storehouse = new Storehouse();
        Author[] author = {
            new Author("Gleyn Juarez", "Java Programmer"),
            new Author("Darren Yazzie", "Java Programmer"),
            new Author("Arturo Perez", "Java Programmer")
        };
        storehouse.setAuthors(author);
        game.setTheStorehouse(storehouse);

        InventoryItem[] tools = StorehouseControl.createTools();
        storehouse.setTools(tools);

        Animal[] animals = StorehouseControl.createAnimals();
        storehouse.setAnimals(animals);

        Provision[] provision = StorehouseControl.createProvisions();
        storehouse.setProvisions(provision);

        game.setTheStorehouse(storehouse);

        return game;

    }
}
