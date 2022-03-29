/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv15;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String rta;
        int i,n1,n2,n3;
        
        
       
        System.out.println("Menu: ");
        System.out.println("1.Suma");
        System.out.println("2.Resta ");
        System.out.println("3.Multiplicacion ");
        System.out.println("4.Division ");
        System.out.println("5.Salir ");
        
    
        rta = "n";
        do {
           System.out.println("Que desea Hace");
        i = leer.nextInt();
        
        switch (i) {
            case 1:
              System.out.println("Ingrese el numero 1");
              n1 = leer.nextInt();
              System.out.println("Ingrese el numero 2");
              n2 = leer.nextInt();
              n3 = n1 + n2;
              System.out.println("El resultado es " + n3);
              break;
            case 2:
              System.out.println("Ingrese el numero 1");
              n1 = leer.nextInt();
              System.out.println("Ingrese el numero 2");
              n2 = leer.nextInt();
              n3 = n1 - n2;
              System.out.println("El resultado es " + n3);
              break;
            case 3:
              System.out.println("Ingrese el numero 1");
              n1 = leer.nextInt();
              System.out.println("Ingrese el numero 2");
              n2 = leer.nextInt();
              n3 = n1 * n2;
              System.out.println("El resultado es " + n3);
              break;
            case 4:
              System.out.println("Ingrese el numero 1");
              n1 = leer.nextInt();
              System.out.println("Ingrese el numero 2");
              n2 = leer.nextInt();
              n3 = n1 / n2;
              System.out.println("El resultado es " + n3);
              break;
            case 5:
              System.out.println("Seguro que desea Salir (s/n)");
              rta = leer.next();
              break;
             
        }
        
        
        
        
    } while (rta.equals("n"));
        
        System.out.println("Buenas noches");
    }
    
}
