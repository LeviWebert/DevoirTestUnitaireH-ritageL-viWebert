/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo2;

import java.util.concurrent.locks.Condition;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lev.w
 */
public class ClasseExo2Test {
    
    public ClasseExo2Test() {
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
     * Test of CalculerForfait method, of class ClasseExo2.
     */
    @Test
    public void testCalculerForfait() {
        // Cas n°1
        boolean licencie = true;
        int age = 25;
        boolean carteNeige = true;
        boolean assurance = true;
        double expResult = 14.7;
        double result = ClasseExo2.CalculerForfait(licencie, age, carteNeige, assurance);
        result=Math.round(result*100.0)/100.0;
        assertEquals(expResult,result,0.0);
        
        // Cas n°2
        licencie = false;
        age = 25;
        carteNeige = true;
        assurance = true;
        expResult = 30;
        result = ClasseExo2.CalculerForfait(licencie, age, carteNeige, assurance);
        result=Math.round(result*100.0)/100.0;
        assertEquals(expResult, result,0.0);
        
        // Cas n°3
        licencie = false;
        age = 8;
        carteNeige = true;
        assurance = true;
        expResult = 21;
        result = ClasseExo2.CalculerForfait(licencie, age, carteNeige, assurance);
        result=Math.round(result*100.0)/100.0;
        assertEquals(expResult, result,0.0);
        
        // Cas n°4
        
        licencie = true;
        age = 12;
        carteNeige = true;
        assurance = false;
        expResult = 11.7;
        result = ClasseExo2.CalculerForfait(licencie, age, carteNeige, assurance);
        result=Math.round(result*100.0)/100.0;
        assertEquals(expResult, result,0.0);
    }
    
}
