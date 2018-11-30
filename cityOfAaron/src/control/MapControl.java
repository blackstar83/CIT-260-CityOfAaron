/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.*;
import cityofaaron.CityOfAaron;
import exceptions.MapControlException;



/**
 *
 * @author apere
 */
public class MapControl {

    public MapControl() {
        //empty constructor 
    }

    public static Map createMap() {

        Map map = new Map();
        int noOfRows = 5;
        int noOfColumns = 5;

        Location[][] locations = new Location[noOfRows][noOfColumns];

        locations[0][0] = new Location("W", "Watchtower", "This is the Watchtower", new String[]{});
        locations[0][1] = new Location("F", "Field", "", new String[]{});
        locations[0][2] = new Location("R", "River", "", new String[]{});
        locations[0][3] = new Location("T", "Temple", "", new String[]{});
        locations[0][4] = new Location("G", "Granary/Storehouse", "", new String[]{});

        locations[1][0] = new Location("C", "Ruler's Court", "", new String[]{});
        locations[1][1] = new Location("U", "Undeveloped Land", "", new String[]{});
        locations[1][2] = new Location("V", "Village", "", new String[]{});
        locations[1][3] = new Location("L", "Lamanite Lands", "", new String[]{});
        locations[1][4] = new Location("F", "Field", "", new String[]{});

        locations[2][0] = new Location("R", "River", "", new String[]{});
        locations[2][1] = new Location("T", "Temple", "", new String[]{});
        locations[2][2] = new Location("G", "Granary/Storehouse", "", new String[]{});
        locations[2][3] = new Location("C", "Ruler's Court", "", new String[]{});
        locations[2][4] = new Location("U", "Undeveloped Land", "", new String[]{});

        locations[3][0] = new Location("V", "Village", "", new String[]{});
        locations[3][1] = new Location("L", "Lamanite Lands", "", new String[]{});
        locations[3][2] = new Location("F", "Field", "", new String[]{});
        locations[3][3] = new Location("R", "River", "", new String[]{});
        locations[3][4] = new Location("T", "Temple", "", new String[]{});

        locations[4][0] = new Location("G", "Granary/Storehouse", "", new String[]{});
        locations[4][1] = new Location("C", "Ruler's Court", "", new String[]{});
        locations[4][2] = new Location("U", "Undeveloped Land", "", new String[]{});
        locations[4][3] = new Location("V", "Village", "", new String[]{});
        locations[4][4] = new Location("W", "Watchtower", "", new String[]{});

        map.setLocations(locations);

        Point point = new Point(2, 3);
        map.setCurrentLocation(point);
        return map;
    }
public static void checkNewLocation(int column, int row) throws MapControlException {
    Map map = CityOfAaron.getCurrentGame().getTheMap();
    Location[][] locations = map.getLocations();
    if (column < 0 || row < 0) {
        throw new MapControlException("\n Enter Positive Numbers Only.\n");
    }else if (row >= locations.length || column >= locations[0].length) {
                throw new MapControlException("\n Enter a Number not Greater than 5.\n");
               }    
    }
}    
