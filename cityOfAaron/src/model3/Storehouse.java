/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model3;

import java.io.Serializable;
/**
 *
 * @author gj3593
 */
public class Storehouse implements Serializable {
    private Author theAuthor;
    private Animal theAnimal;
    private InventoryItem theInventoryItem;
    private Provision theProvision;
    
    public Storehouse(){
        //Empty constructor for JavaBeans
    }
    
    public Author getTheAuthor() {
        return theAuthor;
    }
    
    public void setTheAuthor(Author theAuthor) {
        this.theAuthor = theAuthor;
    }
    
    public Animal getTheAnimal() {
        return theAnimal;
    }
    
    public void setTheAnimal (Animal theAnimal) {
        this.theAnimal = theAnimal;
    }
    
    public InventoryItem getTheInventoryItem() {
        return theInventoryItem;
    }
    
    public void setTheInventoryItem (InventoryItem theInventoryItem) {
        this.theInventoryItem = theInventoryItem;
    }
    
    public Provision getTheProvision() {
        return theProvision;
    }
    
    public void setTheProvision(Provision theProvision) {
        this.theProvision = theProvision;
    }
}
