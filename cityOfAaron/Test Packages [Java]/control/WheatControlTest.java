/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.GameControl;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gj3593
 */
public class WheatControlTest {

    public WheatControlTest() {
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

    /**
     * Test of caclculateHarvest method, of class WheatControl.
     */
    @Test
    public void testCaclculateHarvest1() {
        Random randomGenerator = new Random();
        System.out.println("caclculateHarvest");
        int tithesPercent = 99;
        int acresPlanted = 1;
        int expResult = 1 + randomGenerator.nextInt(5);
        int result = WheatControl.caclculateHarvest(tithesPercent, acresPlanted);
        assertEquals(expResult, result);
    }
 @Test
    public void testCaclculateHarvest2() {
        Random randomGenerator = new Random();
        System.out.println("caclculateHarvest");
        int tithesPercent = 7;
        int acresPlanted = 2;
        int expResult = (1 + randomGenerator.nextInt(3)) * 2;
        int result = WheatControl.caclculateHarvest(tithesPercent, acresPlanted);
        assertEquals(expResult, result);
    }
 @Test
    public void testCaclculateHarvest3() {
        Random randomGenerator = new Random();
        System.out.println("caclculateHarvest");
        int tithesPercent = 8;
        int acresPlanted = 4;
        int expResult = (2 + randomGenerator.nextInt(3)) * 4;
        int result = WheatControl.caclculateHarvest(tithesPercent, acresPlanted);
        assertEquals(expResult, result);
    }
}
