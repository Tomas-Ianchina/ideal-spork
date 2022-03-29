/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv13;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int n1,n2,n3,n4;
       System.out.println(" Ingrese el valor limite");
    n1 = leer.nextInt();
    
    
    do {
    System.out.println(" Ingrese el valor 1");
    n2 = leer.nextInt();
     System.out.println(" Ingrese el valor 2");
    n3 = leer.nextInt();
    n4 = (n2 + n3);
    }while(n1 >= n4);
    System.out.println("felicidades");
}
}
