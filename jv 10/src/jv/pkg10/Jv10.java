/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv.pkg10;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int i,n,m;
      
      m = (int) (Math.random()*10);
      n = (int)  (Math.random()*10);
      
      m = m*n;
        System.out.println(m);
      do {
          System.out.println("ingrese el numero");
          i = leer.nextInt();
          
          
      } while (i != m );
      
        System.out.println("Felicitaciones encontro el numero");
      
      
      
      
      
    }
    
}
