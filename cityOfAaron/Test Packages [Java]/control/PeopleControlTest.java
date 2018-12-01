/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yazzie Family
 */
public class PeopleControlTest {

    public PeopleControlTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCaclculateMortality() {
        Random randomGenerator = new Random();
        System.out.println("caclculateMortality");
        int bushelsForFood = 4;
        int currentPopulation = 4;
        int expResult = 8;
      //  int result = WheatControl.caclculateHarvest(bushelsForFood, currentPopulation);
        //assertEquals(expResult, result);
    }

}
