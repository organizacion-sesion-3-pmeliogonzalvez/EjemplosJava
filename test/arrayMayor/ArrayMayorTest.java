/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayMayor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pilar
 */
public class ArrayMayorTest {
    
    public ArrayMayorTest() {
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
     * Test of obt_mayorNumero method, of class ArrayMayor.
     */
    @Test
    public void testObt_mayorNumero_NORMAL() {
        System.out.println("obt_mayorNumero_NORMAL");
        assertEquals(9,  ArrayMayor.obt_mayorNumero(new int[]{2,3,9,6}));
    }
     @Test
    public void testObt_mayorNumero_PRINCIPIO() {
        System.out.println("obt_mayorNumero_PRINCIPIO");
        assertEquals(9,  ArrayMayor.obt_mayorNumero(new int[]{9,3,7}));
    }
     @Test
    public void testObt_mayorNumero_FINAL() {
        System.out.println("obt_mayorNumero_FINAL");
        assertEquals(9,  ArrayMayor.obt_mayorNumero(new int[]{2,3,9}));
    }
     @Test
    public void testObt_mayorNumero_DUPLICADO() {
        System.out.println("obt_mayorNumero_DUPLICADO");
        assertEquals(9,  ArrayMayor.obt_mayorNumero(new int[]{9,3,9,6}));
    }
     @Test
    public void testObt_mayorNumero_1_ELEMENTO() {
        System.out.println("obt_mayorNumero_1_ELMENTO");
        assertEquals(9,  ArrayMayor.obt_mayorNumero(new int[]{9}));
    }
     @Test
    public void testObt_mayorNumero_NEGATIVOS() {
        System.out.println("obt_mayorNumero_NEGATIVOS");
        assertEquals(-4,  ArrayMayor.obt_mayorNumero(new int[]{-4,-6,-7,-22}));
    }
    @Test
    public void testObt_mayorNumero_NULL() {
        System.out.println("obt_mayorNumero_NULL");
        try{
            assertEquals(9,  ArrayMayor.obt_mayorNumero(null));
            fail("Debería saltar excepción");
        }catch(Exception e){}
    }
    @Test  (expected  = Exception.class)
public void testObt_mayorNumero_NULL2() {
        System.out.println("obt_mayorNumero_NULL");
        assertEquals(9,  ArrayMayor.obt_mayorNumero(null));
    }
}
