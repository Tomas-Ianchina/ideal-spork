/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20jv.ex;

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
        int n;
        int[] num;
        System.out.println("ingrese el numero de casillas");
        n = leer.nextInt();
        
        num = new int[n];
        
        llenado(num,n);
        impresion(num);
        
        
        
        
        
        
    }
    
    
    
    public static void llenado(int[] num, int n) {
        
        int i;
        
        
        
        for (i = 0; i < n; i++) {
            num[i] = (int) (Math.random()*10);
           
        }
        
        
               
    }
    
    
    
    public static void impresion(int[] num) {
        
        for(int var:num) {
            System.out.print(var+" ");
            
            
            
        }
        
        System.out.println(" ");
    }
    
    
}
