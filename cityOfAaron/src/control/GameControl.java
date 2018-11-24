package control;

import java.util.Random;
import cityofaaron.CityOfAaron;
import model.Game;
import model.Player;
import model.Map;
import model.Author;
import model.Condition;
import model.InventoryItem;
import model.ItemType;
import model.Storehouse;
import model.Animal;
import model.Provision;


public class GameControl {

    private static Random randomGenerator = new Random();

    /**
     * Protected setter for tests to inject a mock random object.
     *
     * @param random
     */
    protected static void setRandomGenerator(Random random) {
        randomGenerator = random;
    }

    /**
     * Generates a random integer between lowValue and highValue, inclusive.
     * <ul>Requirements:
     * <li>lowValue and highValue must be positive integers (&gt;=0) (return
     * -1)</li>
     * <li>highValue must be greater than lowValue (return -2)</li>
     * <li>highValue cannot be equal to the maximum value for integers (return
     * -3)</li>
     * </ul>
     *
     * @param lowValue
     * @param highValue
     * @return The random number
     */
    public static int getRandomNumber(int lowValue, int highValue) {

        // if low < 0 or high < 0 the return -1
        if (lowValue < 0 || highValue < 0) {
            return -1;
        }

        // if high <= low then return -2
        if (highValue <= lowValue) {
            return -2;
        }

        // if high is the maximum value for integers, then return -3
        if (highValue == Integer.MAX_VALUE) {
            return -3;
        }
        // calculate the size of the range; add one so Random() includes high 
        int range = (highValue - lowValue) + 1;

        // return low and random(range size)
        return lowValue + randomGenerator.nextInt(range);
    }
    public static String loadGameFromFile(String filename) {
        // place holder til created
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
        //stub function that will be implamented later
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
            new Author("Darrel Yazzie", "Java Programmer"),
            new Author("Arturo Perez", "Java Programmer")        
        };        
        storehouse.setAuthors(author);
        
        //call createTools() to create a tools array and set it in the storehouse
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

