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
public class PessoaTest {
    
    public PessoaTest() {
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
     * Test of fala method, of class Pessoa.
     */
    @Test
    public void testFala() {
        System.out.println("fala");
        Pessoa instance = new Pessoa();
        instance.fala();
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of idade method, of class Pessoa.
     */
    @Test
    public void testIdade() {
        System.out.println("idade");
        int idade = 19;
        Pessoa instance = new Pessoa();
        int expResult = 19;
        int result = instance.idade(idade);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of nome method, of class Pessoa.
     */
    @Test
    public void testNome() {
        System.out.println("nome");
        String nome = "Maria";
        Pessoa instance = new Pessoa();
        String expResult = "Maria";
        String result = instance.nome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
