/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6jv.ex;

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
        int i,n;
        double m,t,c;
        System.out.println("ingrese la cantidad de personas ");
        n = leer.nextInt();
        t = 0;
        c = 0;
        for (i = 1;i <= n;i++) {
           
            System.out.println("Ingrese la altura de la persona "+i);
            m = leer.nextDouble();   
            c = c + m;
            t++;
            
            
            
            
            
        }
        m = c/t;
        
        
        System.out.println("La altura promedio es "+m);
    }
    
}
