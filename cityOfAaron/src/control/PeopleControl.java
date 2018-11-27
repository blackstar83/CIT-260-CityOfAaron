/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.GameControl;

/**
 *
 * @author Yazzie Family
 */
public class PeopleControl {

    public static int calculateMortality(int bushelsForFood, int currentPopulation) {
        if (bushelsForFood < 0) {
            return -1;
        }

        if (currentPopulation < 0) {
            return -1;
        }

        int numberOfPeopleFed = bushelsForFood / 20;

        if (numberOfPeopleFed > currentPopulation) {
            return 0;
        }

        return currentPopulation - numberOfPeopleFed;
    }

}
