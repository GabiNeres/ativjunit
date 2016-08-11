/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 20131064010207
 */
public class SomaTest {
    
    public SomaTest() {
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
     * Test of numeros method, of class Soma.
     */
    @Test
    public void testNumeros() {
        System.out.println("numeros");
        int x = 0;
        int y = 0;
        Soma instance = new Soma();
        instance.numeros(x, y);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of soma method, of class Soma.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        int x = 2;
        int y = 5;
        Soma instance = new Soma();
        int expResult = 7;
        int result = instance.soma(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of num method, of class Soma.
     */
    @Test
    public void testNum() {
        System.out.println("num");
        double x = 4.0;
        Soma instance = new Soma();
        String expResult = "Par";
        String result = instance.num(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
