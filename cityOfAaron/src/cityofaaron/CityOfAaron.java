
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import model.Game;
import model.Player;
import model.Storehouse;
import model.Map;
import model.*;
import view.*;

/**
 *
 * @author gj3593
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 

        /*Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheMap(new Map());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setCurrentPopulation(105);
        theGame.setAcresOwned(2000);
        theGame.setWheatInStorage(15000);

        System.out.println(theGame.toString());

        Animal theAnimal = new Animal();
        theAnimal.setName("name");
        theAnimal.setAge(3);

        System.out.println(theAnimal.toString());

        Author theAuthor = new Author();
        theAuthor.setName("Name");
        theAuthor.setTitle("Title");

        System.out.println(theAuthor.toString());

        Provision theProvision = new Provision();
        theProvision.setName("Name");
        theProvision.setPerishable(true);

        System.out.println(theProvision.toString());

        InventoryItem theInventoryItem = new InventoryItem();
        theInventoryItem.setItemType(ItemType.Tool);
        theInventoryItem.setQuantity(10);
        theInventoryItem.setCondition(Condition.Good);

        System.out.println(theInventoryItem.toString());

        Storehouse theStorehouse = new Storehouse();
        theStorehouse.setAnimals(new Animal[]{});

        System.out.println(theStorehouse.toString());

        Point thePoint = new Point();
        thePoint.setRow(2);
        thePoint.setColumn(2);

        System.out.println(thePoint.toString());
        
         */
        StartProgamView startProgramView = new StartProgamView();
        startProgramView.displayView();
    }

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
}
