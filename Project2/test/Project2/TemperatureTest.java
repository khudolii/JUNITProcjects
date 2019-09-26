/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

import Project2.Temperature;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TemperatureTest {
    
    public TemperatureTest() {
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
     * Test of power_empty method, of class Temperature.
     */
    @Test
    public void testPower_empty() {
        System.out.println("power_empty test");
        Temperature instance = new Temperature(100.,200.,1700.);
        double expResult = 170.0;
        double result = instance.power_empty();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("power_empty test success");
    }

    /**
     * Test of toString method, of class Temperature.
     */
    @Test
    public void testToString() {
        System.out.println("toString test");
        Temperature instance = new Temperature(100.,200.,1700.);
        String expResult = "Temperature{square=1700.0}";
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("toString test success");
    }

    /**
     * Test of getSquare method, of class Temperature.
     */
    @Test
    public void testGetSquare() {
        System.out.println("getSquare test");
        Temperature instance = new Temperature(100.,200.,1700.);
        double expResult = 1700.0;
        double result = instance.getSquare();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getSquare test success");
    }

    /**
     * Test of setSquare method, of class Temperature.
     */
    @Test
    public void testSetSquare() {
        System.out.println("setSquare test");
        double square = 180.0;
        Temperature instance = new Temperature(100.,200.,1700.);
        instance.setSquare(square);
        double expResult = 180.0;
        double result = instance.getSquare();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setSquare test success");
    }
    
}
