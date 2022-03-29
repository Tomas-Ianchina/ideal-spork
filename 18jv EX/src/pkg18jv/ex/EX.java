/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18jv.ex;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,i;
        int[] num;
        
        System.out.println("Ingrese a cantidad de numeros ");
        n = leer.nextInt();
        
        num = new int[n];
               
        
        
        for(i = 0;i<n;i++) {
            num[i] = leer.nextInt();
            
        }
        n = 0;
        for(int var:num) {
            n = n + var;
            
            
        }
        
        
        System.out.println("la suma es "+n);
        
    }
    
}
