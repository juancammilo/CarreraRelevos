/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerarelevos;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jkammilo
 */
public class UtilitariaTest {
    
    public UtilitariaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test del metodo generarNumero, de la clase Utilitaria.
     */
    @Test
    public void testGenerarNumero() {
        
        int result = Utilitaria.generarNumero();
        assert result >=0 && result <4;
        
    }
    
}
