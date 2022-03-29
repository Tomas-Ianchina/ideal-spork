/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int n,n1,j;
       String i;
       i = "*";
       n = 1; 
     
       do {
           n1 = 0;
           System.out.println("Ingrese un numero");
           n1 = leer.nextInt();
           System.out.print(n1 + " ");
           for (j = 1; j <= n1; j++) {
               System.out.print(i);
               
                   
           }
           System.out.println();
       
        n++;   
       } while (n <= 4 );
    }
    
}
