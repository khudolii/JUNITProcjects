/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import Generics.Palindrom;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromTest {
    
    public PalindromTest() {
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
     * Test of isPal method, of class Palindrom.
     */
    @Test
    public void testIsPal() {
        System.out.println("isPal test");
        String[] arr = {"A roza upala na lapu azora",
        "Let it snow, let it snow, let it snow",
        "Was it a car or a cat I saw?",
        "Madam, I'm Adam!",
        "Your day breaks, your mind aches"};
        Palindrom instance = new Palindrom();
        boolean[] expResult = {true, false, true, true, false};
        boolean[] result = instance.isPal(arr);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("isPal test success");
    }
    
}
