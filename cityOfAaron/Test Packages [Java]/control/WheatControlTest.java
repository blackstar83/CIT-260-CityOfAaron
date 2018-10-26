/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
    public void testCaclculateHarvest() {
        System.out.println("caclculateHarvest");
        int tithesPercent = 0;
        int acresPlanted = 0;
        int expResult = 0;
        int result = WheatControl.caclculateHarvest(tithesPercent, acresPlanted);
        assertEquals(expResult, result);
    }

}
