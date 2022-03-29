/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv18.ex;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv18EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int[] v1;
        int[] v2;
        
        System.out.println("ingrese la cantidad de numeros");
        n = leer.nextInt();
        
        v1 = new int[n];
        v2 = new int[n];
        
        llenado(v1,v2,n);
        
        
        
        
        comparacion(v1,v2,n);
        
        
        
        
        
        System.out.println("Buenas noches ");
        
    }
    
    
    
    public static void llenado(int[] v1, int[] v2,int n) {
        int i;
        Scanner leer = new Scanner(System.in);
        
        for( i = 0;i<n;i++ ) {
            System.out.println(" ingrese el valor para v1");
            v1[i] = leer.nextInt();
            System.out.println(" ingrese el valor para v2");
            v2[i] = leer.nextInt();
            
        }
        
        
        
        
        
        
        
    }
    
    
    public static void comparacion(int [] v1, int[]v2,int n) {
        
        int i;
        
        for(i = 0; i <n; i++) {
            if ( v1[i] == v2[i]) {
                System.out.println("si");
                
                
                
            } else {
                break;
            }
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
