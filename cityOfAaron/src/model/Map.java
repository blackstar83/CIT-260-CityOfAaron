/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.io.Serializable;

/**
 *
 * @author apere
 */
public class Map implements Serializable {

    private Location[][] locations = new Location[5][5];
    private Point currentLocation;

    public Map() {
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Point getcurrentLocation() {
        return currentLocation;
    }
    
    public void setCurrentLocation(Point point) {
    }

    @Override
    public String toString() {
        return "Map {"
                + "Location=" + Arrays.toString(locations)
                + ", Point=" + currentLocation
                + " }";
    }
}