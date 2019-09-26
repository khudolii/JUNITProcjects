/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project2;

import Project2.ElectricalAppliance;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ElectricalApplianceTest {
    
    public ElectricalApplianceTest() {
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
     * Test of power method, of class ElectricalAppliance.
     */
    @Test
    public void testPower() {
        System.out.println("power test");
        ElectricalAppliance instance = new ElectricalAppliance(10.,13.);
        double expResult = 130.0;
        double result = instance.power();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Power test success");
    }

    /**
     * Test of toString method, of class ElectricalAppliance.
     */
    @Test
    public void testToString() {
        System.out.println("toString test");
        ElectricalAppliance instance = new ElectricalAppliance(10.,13.);
        String expResult = "ElectricalAppliance{voltage=10.0, current=13.0}";
        String result = instance.toString();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("toString test success");
    }

    /**
     * Test of getVoltage method, of class ElectricalAppliance.
     */
    @Test
    public void testGetVoltage() {
        System.out.println("getVoltage test");
        ElectricalAppliance instance = new ElectricalAppliance(10.,13.);
        double expResult = 10.0;
        double result = instance.getVoltage();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getVoltage test success");
    }

    /**
     * Test of setVoltage method, of class ElectricalAppliance.
     */
    @Test
    public void testSetVoltage() {
        System.out.println("setVoltage test");
        double voltage = 15.0;
        ElectricalAppliance instance = new ElectricalAppliance(10.,13.);
        instance.setVoltage(voltage);
        double expResult = 15.;
        double result = instance.getVoltage();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setVoltage test success");
    }

    /**
     * Test of getCurrent method, of class ElectricalAppliance.
     */
    @Test
    public void testGetCurrent() {
        System.out.println("getCurrent test");
        ElectricalAppliance instance = new ElectricalAppliance(10.,13.);
        double expResult = 13.0;
        double result = instance.getCurrent();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("getCurrent test success");
    }

    /**
     * Test of setCurrent method, of class ElectricalAppliance.
     */
    @Test
    public void testSetCurrent() {
        System.out.println("setCurrent test");
        double current = 15.0;
        ElectricalAppliance instance = new ElectricalAppliance(10.,13.);
        instance.setCurrent(current);
        double expResult = 15.;
        double result = instance.getCurrent();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("setCurrent test success");
    }
    
}
