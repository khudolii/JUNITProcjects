/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

import Project2.Teapot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TeapotTest {
    
    public TeapotTest() {
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
     * Test of time method, of class Teapot.
     */
    @Test
    public void testTime() {
        System.out.println("time test");
        Teapot instance = new Teapot(0.5,1.,90.);
        double expResult = 18.792;
        double result = instance.time();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("time test success");
    }

    /**
     * Test of toString method, of class Teapot.
     */
    @Test
    public void testToString() {
        System.out.println("toString test");
        Teapot instance = new Teapot(0.5,1.,90.);
        String expResult = "Teapot{volume=90.0}";
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("toString test success");
    }

    /**
     * Test of getVolume method, of class Teapot.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume test");
        Teapot instance = new Teapot(0.5,1.,90.);
        double expResult = 90.0;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getVolume test success");
    }

    /**
     * Test of setVolume method, of class Teapot.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume test");
        double volume = 180.0;
        Teapot instance = new Teapot(0.5,1.,90.);
        instance.setVolume(volume);
        double expResult = 180.0;
        double result = instance.getVolume();
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setVolume test success");
    }
    
}
