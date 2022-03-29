/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv14ex;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv14EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double n,m,h,e,M,t;
       int i,j;
       // t es la suma de los hijos
       //M es el promedio
       // m cantidad de hijos por familia
       // e es la suma de las edades
       // h edad de hijo * familia
      e = 0;
      t = 0;
        System.out.println("Ingrese la cantidad de familias");
        n = leer.nextDouble();
        
        for(i = 1;i <=n;i++) {
            System.out.println("Cuantos hijos tiene la familia "+i);
            m = leer.nextDouble();
            t = t + m;
            for(j = 1;j <=m;j++){
                System.out.println("indique cuantos años tiene el hijo"+j);
                h = leer.nextDouble();
                e = e + h;
                
            
            }
        }
      
       M = e/t;
       
        System.out.println("la media de las edades es "+M);
    }
    
}
