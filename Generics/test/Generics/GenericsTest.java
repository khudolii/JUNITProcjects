/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GenericsTest {
    
    public GenericsTest() {
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
     * Test of count method, of class JavaLaba8Kurs2Trimestr3.
     */
    @Test
    public void testCount() {
        System.out.println("count test");
        String arg =  "Hello, Jimhh. How Aare you?" +
                "Would you like to consider an interest offer?";
        Generics instance = new Generics();
        String expResult = "{a=3, c=1, d=2, e=7, f=2, h=4, i=4, j=1, k=1, l=4, m=1, n=3, o=8, r=4, s=2, t=3, u=3, w=2, y=2}";
        String result = instance.count(arg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("count test success");
    }
    
}
