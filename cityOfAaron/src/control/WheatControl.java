package control;

import exceptions.WheatControlException;
import exceptions.GameControlException;

public class WheatControl {

    public static int calculateLossToRats(int tithesPercent, int wheatInStorage) throws WheatControlException, GameControlException {
       
        if (wheatInStorage < 0) {
            throw new WheatControlException("There is no wheat in storage.");
        }

        if (tithesPercent < 0 || tithesPercent > 100) {
            throw new WheatControlException("Tithing amount should be between 0-100.");
        }
        
        int chanceOfRats = GameControl.getRandomNumber(1, 100);

        if (chanceOfRats >= 30) {
            return 0;
        }

        int high = 2;
        int low = 1;
 
        if (tithesPercent < 8) {
            low = 6;
            high = 10;
        }

        if (tithesPercent >= 8 && tithesPercent <= 12) {
            low = 3;
            high = 7;
        }

        if (tithesPercent > 12) {
            low = 3;
            high = 5;
        }

        int bushelsLost = 0;
        
        int lossToRats = GameControl.getRandomNumber(low, high);
        double percentLost = lossToRats * 0.01;
  
        bushelsLost = (int) (wheatInStorage * percentLost);

        return bushelsLost;
    }

    public static int calculateHarvest(int tithesPercent, int acresPlanted) throws WheatControlException, GameControlException {

        if (acresPlanted < 0) {
            throw new WheatControlException("There is no wheat in storage.");
        }

        if (tithesPercent < 0 || tithesPercent > 100) {
            throw new WheatControlException("Tithing amount should be between 0-100.");
        }

        int high = 2;
        int low = 1;

        //if tithingPercent < 8 then low = 1, high = 3       
        if (tithesPercent < 8) {
            low = 1;
            high = 3;
        }

        //if tithingPercent >= 8 AND tithingPercent <= 12 then low = 2, high = 4
        if (tithesPercent >= 8 && tithesPercent <= 12) {
            low = 2;
            high = 4;
        }

        //if tithingPercent > 12 then low = 2, high = 5        
        if (tithesPercent > 12) {
            low = 2;
            high = 5;
        }

        int yield = 0;

        yield = GameControl.getRandomNumber(low, high);

        return yield * acresPlanted;
    }

    public static void checkNumber(int stringToNum) throws WheatControlException {
        if (stringToNum < 0) {
            throw new WheatControlException("Please enter a positive number.");
        }
    }

    public static boolean checkTithing(int tithes) {
        return tithes >= 0 && tithes <= 100;
    }
}
