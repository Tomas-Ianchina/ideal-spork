/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv13ex;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv13EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int i,j,n;
       
        System.out.println("Indique la cantidad de numeros ");
        n = leer.nextInt();
       
       for(i = 1;i<=n;i++){
           for(j = 1;j<=i;j++){
               System.out.print(j);
           }
           System.out.println(" ");
       }
       
       
       
    }
    
}
