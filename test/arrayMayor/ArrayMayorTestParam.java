/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayMayor;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Pilar
 */
@RunWith(Parameterized.class)
public class ArrayMayorTestParam {
    int res;
    int [] vecparam;
    public ArrayMayorTestParam(int result, int[] vec) {
        res=result;
        vecparam=vec;
    }
    
    @Parameters
    public static Collection<Object[]> datos(){
      return Arrays.asList(new Object[][]{{9,new int[]{1,9,5}},{5,new int[]{1,5,9}}});
    }
   
    /**
     * Test of obt_mayorNumero method, of class ArrayMayor.
     */
    @Test
    public void testObt_mayorNumero_NORMAL() {
        System.out.println("obt_mayorNumero_NORMAL");
        assertEquals(this.res,  ArrayMayor.obt_mayorNumero(this.vecparam));
    }
   
    @Test  (expected  = Exception.class)
public void testObt_mayorNumero_NULL2() {
        System.out.println("obt_mayorNumero_NULL");
        assertEquals(9,  ArrayMayor.obt_mayorNumero(null));
        
    }
}
