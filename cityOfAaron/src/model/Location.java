/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

public class Location extends Map implements Serializable {

    private String name;
    private String description;
    private String mapSymbol;
    private String[] gameTips;

    public Location() {
    }

    public Location(String mapSymbol, String name, String description, String[] tips){
        setMapSymbol (mapSymbol);
        setName(name);
        setDescription(description);
        setGameTips(tips);
}
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setGameTips(String[] gameTips) {
        this.gameTips = gameTips;
    }

    public String[] getGameTips() {
        return gameTips;
    }

    @Override
    public String toString() {
        return " Location {"
                + " name" + name
                + ", description" + description
                + ", mapSymbol" + mapSymbol
                + ", gameTips" + gameTips
                + " }";
    }
}
