/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv17.ex;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv17Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      double n;
      boolean result;
        System.out.println("Ingrese el numero ");
        n = leer.nextDouble();
        
        result = compro(n);
      
        System.out.println(result);
      
    }
    
    
    
    
    public static boolean compro(double n) {
        double i,j;
        boolean t;
        j = 0;
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                j++;
            } 
            
         }
                
        if(j == 2 ) {
          t = true;
        } else {
            t = false;
        }
        
        
        return t;
        
    }
    
    
    
    
    
}
