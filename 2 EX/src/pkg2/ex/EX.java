/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.ex;

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
       int a,b,c,d,o;
        System.out.println("Ingrese la variable a");
        a = leer.nextInt();
         System.out.println("Ingrese la variable b");
        b = leer.nextInt();
         System.out.println("Ingrese la variable c");
        c = leer.nextInt();
         System.out.println("Ingrese la variable d");
        d = leer.nextInt();
                
        
        
        System.out.println("////////////////////////////////");
        System.out.println(a + "Es el valor actual de a");
        System.out.println(b + "Es el valor actual de b");
        System.out.println(c + "Es el valor actual de c");
        System.out.println(d + "Es el valor actual de d");
        
        
        
        System.out.println("////////////////////////////////");
        
        
        o = b;
        b = c;
        c = a;
        a = d;
        d = o;
        
        
        
        System.out.println(a + "Es el valor actual de a");
        System.out.println(b + "Es el valor actual de b");
        System.out.println(c + "Es el valor actual de c");
        System.out.println(d + "Es el valor actual de d");
        
        
        
        
        
                
    }
    
}
