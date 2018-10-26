
package control;

import control.GameControl;
import java.util.Random;
public class LossToRats {
/**
     * Calculate the amount of wheat in storage lost to rats, based on
     * the percentage of tithing paid. Assume that GameControl.getRandomNumber(low, high)
     * is available to be called.
     *
     * @param tithesPercent
     * @param WheatInStorage
     * @return The random number
     */
public static double caclculateLossToRats(int tithesPercent, int WheatInStorage) {
        int low = 0, high = 0;
 
        if (WheatInStorage < 0) {
            return -1;
        }
        if (tithesPercent < 0 || tithesPercent > 100) {
            return -2;
        }
        
        int chanceOfRats = GameControl.getRandomNumber(1, 100); 
        if (chanceOfRats >= 30) {  
            return 0;
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

        double percentLost = GameControl.getRandomNumber(low, high) * 0.01;

        return WheatInStorage * percentLost;
    }
}
