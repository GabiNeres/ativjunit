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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
     * Test of numeros method, of class Calculadora.
     */
    @Test
    public void testNumeros() {
        System.out.println("numeros");
        int x = 0;
        int y = 0;
        Calculadora instance = new Calculadora();
        instance.numeros(x, y);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of subtracao method, of class Calculadora.
     */
    @Test
    public void testSubtracao() {
        System.out.println("subtracao");
        int x = 5;
        int y = 4;
        Calculadora instance = new Calculadora();
        int expResult = 1;
        int result = instance.subtracao(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of multiplicacao method, of class Calculadora.
     */
    @Test
    public void testMultiplicacao() {
        System.out.println("multiplicacao");
        int x = 2;
        int y = 5;
        Calculadora instance = new Calculadora();
        double expResult = 10.0;
        double result = instance.multiplicacao(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
