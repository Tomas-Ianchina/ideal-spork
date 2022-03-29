/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19jv;

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
       int i,n,t;
       
      
        System.out.println("Ingrese el tamaño ");
        n = leer.nextInt();
       
       int[] numeros;
       numeros = new int[n];
        
       for(i = 0; i < n; i++ ) {
           
           numeros[i]= (int) (Math.random()*10);
           
           
           
       }
      
      
        System.out.println("Ingrese el numero que desea buscar");
        t = leer.nextInt();
        
        for(int var:numeros) {
            
            if (t == var) {
                System.out.println("Se encontro el numero " + t);
                
            } 
            
            
            
            
        }
        
        System.out.println(" No se encontro el valor " + t);
        
        
        
        
        for(int var:numeros) {
            System.out.println(var);
            
            
            
            
        }
        
      
      
    }
    
}
