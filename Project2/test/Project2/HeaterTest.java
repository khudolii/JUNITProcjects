/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

import Project2.Heater;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HeaterTest {
    
    public HeaterTest() {
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
     * Test of suitable method, of class Heater.
     */
    @Test
    public void testSuitable() {
        System.out.println("suitable test");
        Heater instance = new Heater(100.,200.,90.,20.,-5.,1.5,0.7);
        assertTrue(instance.suitable());
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("suitable test success");
    }

    /**
     * Test of getT_Inside method, of class Heater.
     */
    @Test
    public void testGetT_Inside() {
        System.out.println("getT_Inside test");
        Heater instance = new Heater(100.,200.,90.,20.,-5.,1.5,0.7);
        double expResult = 20.0;
        double result = instance.getT_Inside();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getT_Inside test success");
    }

    /**
     * Test of setT_Inside method, of class Heater.
     */
    @Test
    public void testSetT_Inside() {
        System.out.println("setT_Inside test");
        double t_inside = 30.0;
        Heater instance = new Heater(100.,200.,90.,20.,-5.,1.5,0.7);
        instance.setT_Inside(t_inside);
        double expResult = 30.0;
        double result = instance.getT_Inside();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setT_Inside test success");
    }

    /**
     * Test of getT_Outside method, of class Heater.
     */
    @Test
    public void testGetT_Outside() {
        System.out.println("getT_Outside test");
        Heater instance = new Heater(100.,200.,90.,20.,-5.,1.5,0.7);
        double expResult = -5.0;
        double result = instance.getT_Outside();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getT_Outside test success");
    }

    /**
     * Test of setT_Outside method, of class Heater.
     */
    @Test
    public void testSetT_Outside() {
        System.out.println("setT_Outside test");
        double t_outside = -10.0;
        Heater instance = new Heater(100.,200.,90.,20.,-5.,1.5,0.7);
        instance.setT_Outside(t_outside);
        double expResult = -10.0;
        double result = instance.getT_Outside();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setT_Outside test success");
    }

    /**
     * Test of getHeight method, of class Heater.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight test");
        Heater instance = new Heater(100.,200.,90.,20.,-5.,1.5,0.7);
        double expResult = 1.5;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getHeight test success");
    }

    /**
     * Test of setHeight method, of class Heater.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight test");
        double height = 10.0;
        Heater instance = new Heater(100.,200.,90.,20.,-5.,1.5,0.7);
        instance.setHeight(height);
        double expResult = 10.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setHeight test success");
    }

    /**
     * Test of getK method, of class Heater.
     */
    @Test
    public void testGetK() {
        System.out.println("getK test");
        Heater instance = new Heater(100.,200.,90.,20.,-5.,1.5,0.7);
        double expResult = 0.7;
        double result = instance.getK();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getK test success");
    }

    /**
     * Test of setK method, of class Heater.
     */
    @Test
    public void testSetK() {
        System.out.println("setK test");
        double k = 0.9;
        Heater instance = new Heater(100.,200.,90.,20.,-5.,1.5,0.7);
        instance.setK(k);
        double expResult = 0.9;
        double result = instance.getK();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setK test success");
    }

    /**
     * Test of toString method, of class Heater.
     */
    @Test
    public void testToString() {
        System.out.println("toString test");
        Heater instance = new Heater(100.,200.,90.,20.,-5.,1.5,0.7);
        String expResult = "Heater{t_inside=20.0, t_outside=-5.0, height=1.5, k=0.7}";
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("toString test success");
    }
    
}
