/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
/**
 *
 * @author gj3593
 */
public class Storehouse implements Serializable {
    private Author[] authors;
    private Animal[] animals;
    private InventoryItem[] tools;
    private Provision[] provisions;
    
    public Storehouse(){
        //Empty constructor for JavaBeans
    }
    
    public Author[] getAuthors() {
        return authors;
    }
    
    public void setAuthors (Author[] authors) {
        this.authors = authors;
    }
    
    public Animal[] getAnimals() {
        return animals;
    }
    
    public void setAnimals (Animal[] animals) {
        this.animals = animals;
    }
    
    public InventoryItem[] getInventoryItems() {
        return tools;
    }
    
    public void setInventoryItems (InventoryItem[] tools) {
        this.tools = tools;
    }
    
    public Provision[] getProvisions() {
        return provisions;
    }
    
    public void setProvisions(Provision[] provisions) {
        this.provisions = provisions;
    }
}
