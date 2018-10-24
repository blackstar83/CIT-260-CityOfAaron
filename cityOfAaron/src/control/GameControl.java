/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author gj3593
 */
public class GameControl {
    
 /**
 *Generates a random integer between lowValue and highValue, inclusive.
 *<ul>Requirements:
 *<li>lowValue and highValue must be positive integers (&gt;=0) (return -1)</li>
 *<li>highValue must be greater than lowValue (return -2)</li>
 *<li>highValue cannot be equal to the maximum value for integers (return -3)</li>
 *</ul>
 *@param lowValue
 *@param highValue
 *@return The random number
 */
public static int getRandomNumber(int lowValue, int highValue){

    // if low < 0 or high < 0 the return -1

    // if high <= low then return -2

    // if high is the maximum value for integers, then return -3
    
    // calculate the size of the range; add one so Random() includes high value

    // return low + random(range size)

    // for now, return some value that would not be returned in any case
    return -100;
}
}