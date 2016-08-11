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
public class MediaTest {
    
    public MediaTest() {
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
     * Test of numeros method, of class Media.
     */
    @Test
    public void testNumeros() {
        System.out.println("numeros");
        int x = 0;
        int y = 0;
        Media instance = new Media();
        instance.numeros(x, y);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of media method, of class Media.
     */
    @Test
    public void testMedia() {
        System.out.println("media");
        int x = 2;
        int y = 2;
        Media instance = new Media();
        double expResult = 2.0;
        double result = instance.media(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of num method, of class Media.
     */
    @Test
    public void testNum() {
        System.out.println("num");
        int x = 1;
        int y = 2;
        Media instance = new Media();
        String expResult = "X < Y";
        String result = instance.num(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
