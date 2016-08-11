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
public class VendasTest {
    
    public VendasTest() {
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
     * Test of venda method, of class Vendas.
     */
    @Test
    public void testVenda() {
        System.out.println("venda");
        int x = 0;
        int y = 0;
        Vendas instance = new Vendas();
        instance.venda(x, y);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of saldo method, of class Vendas.
     */
    @Test
    public void testSaldo() {
        System.out.println("saldo");
        Vendas instance = new Vendas();
        int expResult = 3000;
        int result = instance.saldo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of desconto method, of class Vendas.
     */
    @Test
    public void testDesconto() {
        System.out.println("desconto");
        int x = 50;
        int y = 20;
        Vendas instance = new Vendas();
        double expResult = 7.0;
        double result = instance.desconto(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
