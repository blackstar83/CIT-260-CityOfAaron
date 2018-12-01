package control;

import exceptions.WheatControlException;
import exceptions.GameControlException;

public class WheatControl {

    /**
     * Calculate the amount of wheat harvested, based on the percentage of
     * tithing paid. Assume that GameControl.getRandomNumber(low,high) is
     * available to be called. private static int calculateHarvest(int
     * tithesPercent int acresPlanted) {
     *
     * @param tithesPercent
     * @param acresPlanted
     * @return The random number
     */
    public static int caclculateHarvest(int tithesPercent, int acresPlanted) throws WheatControlException {
        //int low = 0, high = 0;
        if (acresPlanted < 0) {
            throw new WheatControlException("Storage is empty");
        }
            //return -1;
            
        if (tithesPercent < 0 || tithesPercent > 100) {
            throw new WheatControlException("Tithes should be between 1-100. Try again!!");
        }
            //return -2;
            int high = 2;
            int low = 1;
            //if tithingPercent < 8 then low = 1, high = 3

        if (tithesPercent < 8) {
            low = 1;
            high = 3;
        }

        //if (tithesPercent >= 8 && tithesPercent <= 12) {
         if (tithesPercent >= 8 && tithesPercent <= 12) {
            low = 2;
            high = 4;
        }

          if (tithesPercent > 12) {
            low = 2;
            high = 5;
        }

        int yield = 0;

        //try {
          //  yield = GameControl.getRandomNumber(low, high);
        //} catch (GameControlException ex) {
          //  System.out.println(ex.getMessage());
        //}

        return yield * acresPlanted;
    }

    public static void checkNumber(int stringToNum) throws WheatControlException {
        if (stringToNum < 0) {
            throw new WheatControlException("Positive numbers only.");
        }
    }    
    

    public static void checkTithing(int tithes) throws WheatControlException {
        if (tithes < 0) {
            throw new WheatControlException("Positive numbers only.");
        } else if (tithes > 100) {
            throw new WheatControlException("Enter a number lower than 100.");
        }
    }

}
