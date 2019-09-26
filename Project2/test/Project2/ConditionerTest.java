/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

import Project2.Conditioner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionerTest {
    
    public ConditionerTest() {
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
     * Test of suitable method, of class Conditioner.
     */
    @Test
    public void testSuitable() {
        System.out.println("suitable test");
        Conditioner instance = new Conditioner(100.,200.,150.,2,4);
        assertTrue(instance.suitable());
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("suitable test success");
    }

    /**
     * Test of getPeople method, of class Conditioner.
     */
    @Test
    public void testGetPeople() {
        System.out.println("getPeople test");
        Conditioner instance = new Conditioner(100.,200.,150.,2,4);
        double expResult = 2;
        double result = instance.getPeople();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getPeople test success");
    }

    /**
     * Test of setPeople method, of class Conditioner.
     */
    @Test
    public void testSetPeople() {
        System.out.println("setPeople test");
        int people = 5;
        Conditioner instance = new Conditioner(100.,200.,150.,2,4);
        instance.setPeople(people);
        double result = instance.getPeople();
        assertEquals(people, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setPeople test success");
    }

    /**
     * Test of getTech method, of class Conditioner.
     */
    @Test
    public void testGetTech() {
        System.out.println("getTech test");
        Conditioner instance = new Conditioner(100.,200.,150.,2,4);
        double expResult = 4;
        double result = instance.getTech();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getTech test success");
    }

    /**
     * Test of setTech method, of class Conditioner.
     */
    @Test
    public void testSetTech() {
        System.out.println("setTech test");
        int tech = 7;
        Conditioner instance = new Conditioner(100.,200.,150.,2,4);
        instance.setTech(tech);
        double result = instance.getTech();
        assertEquals(tech, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setTech test success");
    }

    /**
     * Test of toString method, of class Conditioner.
     */
    @Test
    public void testToString() {
        System.out.println("toString test");
        Conditioner instance = new Conditioner(100.,200.,150.,2,4);
        String expResult = "Conditioner{people=2, tech=4}";
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("toString test success");
    }
    
}
