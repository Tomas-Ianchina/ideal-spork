/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv16;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int m,b,l,c,n;
       l = 5;
       b = 0;
       m = 0;
       n = 0;
       String cadena,i,f;
       
       
       do{ 
       System.out.println("Ingrese la cadenas ");
       cadena = leer.next();
       c = cadena.length();
       i = cadena.substring(0,1);
       f = cadena.substring(c-1,c);
       if(((c == l) && ("x".equals(i)) && ("o".equals(f)))) {
           b = b + 1 ;
       } else {
           m = m + 1;
       }
       if("&&&&&".equals(cadena)) {
          n = n + 1;
          m = m - 1;
          
       }
       } while (n == 0 );
       
        System.out.println("Las palabras bien escritas son " + b);
        System.out.println("Las palabras mal escritas son " + m);
       
    }
    
}
