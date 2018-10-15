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
public class InventoryItem implements Serializable {

    private ItemType itemType;
    private int quantity;
    private Condition condition;

    public InventoryItem() {
        //Empty constructor for JavaBean
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType type) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "InventoryItem {"
                + " itemTYpe=" + itemType
                + ", quantity=" + quantity
                + ", condition=" + condition
                + " }";
    }
}
