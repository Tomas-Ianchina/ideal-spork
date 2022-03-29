/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double num;
        int i,n,t,s;
        s = 0;
        t = 0;
        n = 0;
        i = 0;
       while(s == 0 ) {
            System.out.println("Ingrese el numero ");
            num = leer.nextDouble();
            if ((num) % 5 == 0) {
                break;
            }
            if((num) %2 == 0) {
                n++;
            } else {
                i++;
            }
            
            
            t++;
       }
            
            
            
            
            
       
        
        
        System.out.println(n+ " Es la cantidad de numeros pares");
        System.out.println(i+ " Es la cantidad de numeros impares");
        System.out.println(t+ " Es la cantidad de numeros ingresados");
        
        
        
        
        
    }
    
}
