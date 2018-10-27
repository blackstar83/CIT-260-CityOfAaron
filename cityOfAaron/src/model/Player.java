/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author dyazz
 */
public class Player implements Serializable {

    private String name;
    private String itemType;
    private String itemNumber;
    private String quantity;

    public Player() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player {"
                + " name=" + name
                + "}";
    }
}
