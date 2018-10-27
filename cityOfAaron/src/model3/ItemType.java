/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model3;


import java.io.Serializable;
/**
 *
 * @author Yazzie Family
 */
public class ItemType implements Serializable {
    
    private String name;
    private String itemType;
    private String itemNumber;
    private String quantity;
    
    public ItemType() {
    
}

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setitemType(String itemType) {
        this.itemType = itemType;
    }

    public String getitemType() {
        return itemType;
    }
    
    public void setitemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getitemNumber() {
        return itemNumber;
    }
    
    public void setquantity(String quantity) {
        this.quantity = quantity;
    }

    public String getquantity() {
        return quantity;
    }
    
     @Override
    public String toString() {
        return " ItemType {"
                + " name" + name
                + ", ItemType" + itemType
                + ", itemNumber" + itemNumber
                + ", quantity" + quantity
                + " }";
    }
}
