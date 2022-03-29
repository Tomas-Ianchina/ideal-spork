/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv18;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] numeros;
        int i,n;
        n = 1;
        numeros= new int[100];
        
        for (i = 0;i < 100; i++ ) {
            numeros[i] = n;
            
            n++;
        }
        
        
        for (i = 99; i >= 0;i-- ) {
            
            System.out.println(numeros[i]);
            
            
        }
      
        
        
        
        
    }
    
}
