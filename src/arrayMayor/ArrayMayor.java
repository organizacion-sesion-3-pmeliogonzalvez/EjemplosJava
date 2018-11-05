/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arrayMayor;

/**
 * ArrayMayor.java
 * @Autor:  Pilar
 * @Fecha 02-abr-2017 18:08:14
 */
public class ArrayMayor {
public static int obt_mayorNumero(int lista[]){
    int indice,max=Integer.MIN_VALUE;
    for(indice=0;indice<lista.length;indice++){
    if(lista[indice]>max){
        max=lista[indice];
    }
}
return max;
}
}
