/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class PropiedadesNumerosTest {
    
    public PropiedadesNumerosTest() {
    }


    /**
     * Test of esPar method, of class PropiedadesNumeros.
     */
    @Test
    public void testEsPar() {
        System.out.println("esPar");
        int n = 4;
        PropiedadesNumeros instance = new PropiedadesNumeros();
        boolean expResult = true;
        boolean result = instance.esPar(n);
        assertEquals(expResult, result);
       
    }
    
}
