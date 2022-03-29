/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9jv.ex;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int i,n,m,r;
       i = 0;
        System.out.println("Ingrese el dividendo");
        m = leer.nextInt();
        System.out.println("Ingrese el divisor");
        n = leer.nextInt();
        
       
       do {
          m = m -n;
          i++;
           System.out.println((m+n)+"-"+n+" es "+m+", es la resta numero "+i);
           
           
       } while (m >= n);
       
       r = m;
       
   
        System.out.println("El resto es " + r);
       
       
       
    }
    
}
