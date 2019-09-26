/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextFile;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TextFileTest {
    
    public TextFileTest() {
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
     * Test of comparingDoubles method, of class JavaLaba9Kurs2Trimestr3.
     */
    @Test
    public void testComparingDoubles() throws Exception {
        System.out.println("comparingDoubles test");
        int prec = 3;
        List<Double> expResult = new ArrayList<>();
        expResult.add(1.5895);
        expResult.add(-1.589666);
        expResult.add(2.78965);
        expResult.add(-2.78973);
        List<Double> result = TextFile.comparingDoubles(prec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("comparingDoubles test success");
    }
    
}
