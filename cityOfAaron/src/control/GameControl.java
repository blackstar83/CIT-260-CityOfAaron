package control;

import java.util.Random;
import model.*;
import exceptions.GameControlException;
import java.io.*;
import cityofaaron.CityOfAaron;

public class GameControl {

    private static Random randomGenerator = new Random();

    // create random number object for testing
    protected static void setRandomGenerator(Random random) {
        randomGenerator = random;
    }

     public static int getRandomNumber(int min, int max) throws GameControlException {
        if (min < 0 || max < 0) {
            throw new GameControlException("Enter a number greater than zero.");
        }
        
        if (max <= min) {
            throw new GameControlException("The max number must be greater than the min number.");
        }
        
        if (max == Integer.MAX_VALUE) {
            throw new GameControlException("The max number cannot be the maximum value for integers.");
        }

        int range = (max - min) + 1;
        
        return min + randomGenerator.nextInt(range);
    }


    public static Game loadGameFromFile(String filePath) throws GameControlException, IOException {

        if (filePath == null) {
            throw new GameControlException("Enter a valid file path.");
        }

        Game game = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            game = (Game)in.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        CityOfAaron.setCurrentGame(game);
        Player player = new Player();
        game.getThePlayer();
        game.setThePlayer(player);

        return game;
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

    public static void saveGameToFile(Game game, String filePath) throws GameControlException, IOException {

        if (filePath == null) {
            throw new GameControlException("Enter a valid file path.");
        }
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(game);
        } catch (IOException ex) {
            throw new IOException("I/O Error: " + ex.getMessage());
        }
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
     public static void testInput(String[] inputs) throws GameControlException {

        if (inputs[0] == null || inputs[0].equals("")) {
            throw new GameControlException("No name entered; returning to the Main Menu.");
        }
    }
}
