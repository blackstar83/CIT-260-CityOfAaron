package control;

import control.GameControl;

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
public static int caclculateHarvest(int tithesPercent, int acresPlanted) {
        int low = 0, high = 0;
        if (acresPlanted < 0) {
            return -1;
        }
        if (tithesPercent < 0 || tithesPercent > 100) {
            return -2;
        }

        if (tithesPercent < 8) {
            low = 1;
            high = 3;
        }

        if (tithesPercent >= 8 && tithesPercent <= 12) {

             low = 2;
             high = 4;
        }

        if (tithesPercent > 12) {

             low = 2;
             high = 5;
        }
        
        int yield = GameControl.getRandomNumber(low, high);
        return yield * acresPlanted;
    }
}
