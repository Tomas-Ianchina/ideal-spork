/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14jv;

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
     int n1,n2,i;
    System.out.println("");
    
    n2 = 0;
    for (i = 0;i <= 20; i++ ){
        System.out.println(" Ingrese los numeros ");
        n1 = leer.nextInt();
        
        n2 = n1 + n2;
       if(n1 == 0){
           System.out.println("Se encontro el numero 0");
           break;
       }
    
    
    
    
    
}
    System.out.println("La suma de los numeros son " + n2);
    
    
    
    
}
}
