/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model2;

import java.io.Serializable;
 /**
 *
 * @author apere
 */

public class Map implements Serializable {
    private Location Location;
    private currentLocation Point;
    
    public Map(){
}

    public Location getLocation() {
        return Location;
    }

    public void setLocation(Location Location) {
        this.Location = Location;
    }

    public currentLocation getPoint() {
        return Point;
    }

    public void setPoint(currentLocation Point) {
        this.Point = Point;
    }

    @Override
    public String toString() {
        return "Map {" 
                + "Location=" + Location 
                + ", Point=" + Point 
                + "}";
    }
    
}
