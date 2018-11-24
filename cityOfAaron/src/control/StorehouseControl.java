/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import model.InventoryItem;
import model.ItemType;
import model.Condition;
import model.Storehouse;
import cityofaaron.CityOfAaron;
import model.Game;
import model.Author;
import model.Animal;
import model.Provision;

/**
 *
 * @author apere
 */
public class StorehouseControl {
    public StorehouseControl() {
        //empty constructor
    }
    
    public static InventoryItem[] createTools() {
        InventoryItem[] tools = new InventoryItem[5];
        
        tools[0] = new InventoryItem(ItemType.Tool, 200, Condition.Good, "Axes");
        tools[1] = new InventoryItem(ItemType.Tool, 210, Condition.Good, "Shovels");
        tools[2] = new InventoryItem(ItemType.Tool, 300, Condition.Good, "Hammers");
        tools[3] = new InventoryItem(ItemType.Tool, 250, Condition.Good, "Saws");
        tools[4] = new InventoryItem(ItemType.Tool, 180, Condition.Good, "Hoes");
        
        return tools;
}
    public static Animal[] createAnimals() {
        Animal[] animals = new Animal[5];
        
        animals[0] = new Animal(ItemType.Animal, 100, Condition.Good, "Horses", 5);
        animals[1] = new Animal(ItemType.Animal, 80, Condition.Good, "Dogs", 3);
        animals[2] = new Animal(ItemType.Animal, 50, Condition.Good, "Hens", 4);
        animals[3] = new Animal(ItemType.Animal, 60, Condition.Good, "llamas", 2);
        animals[4] = new Animal(ItemType.Animal, 110, Condition.Good, "lambs", 1000); 
        
        return animals;
        
    }
    
    public static Provision[] createProvisions() {
        Provision[] provisions = new Provision[6];
        
        provisions[0] = new Provision(ItemType.Provisions, 9, Condition.Good, "Soap", true);
        provisions[1] = new Provision(ItemType.Provisions, 1, Condition.Poor, "Pitcher/Water", false);
        provisions[2] = new Provision(ItemType.Provisions, 3, Condition.Good, "Tent", false);
        provisions[3] = new Provision(ItemType.Provisions, 8, Condition.Fair, "Clothes", false);
        provisions[4] = new Provision(ItemType.Provisions, 4, Condition.Good, "Coat", false);
        provisions[5] = new Provision(ItemType.Provisions, 5, Condition.Good, "Food", false);
        
        return provisions;
    }
}
