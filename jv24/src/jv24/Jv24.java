/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv24;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
       int[][] num;
       int i,j,a,c,d;
       num = new int[3][3];
       String r = "";
       a = 0;
       c = 0;
       d = 0;
              
      
       for(i = 0;i <num.length;i++) {
                for(j = 0; j <num.length;j++) {
                    System.out.println("Ingrese el numero");
                    num[i][j] = leer.nextInt();
                
                    if(num[i][j] >= 10) {
                     System.out.println("ERROR");
                     r = "Error";
                     break;
                 }
                 
                }
                      
                
            }
       
       if ("Error".equals(r)) {
           System.out.println("No se puede seguir con el programa, Reinicie");
       } else {
           for(i = 0;i <num.length;i++) {
                for(j = 0; j <num.length;j++) {
                   if(i == 0) {
                       a = a + num[i][j];
                   }
                   if(i == j) {
                       c = c + num[i][j];
                   }
                   if(i == num.length - 1) {
                       d = d + num[i][j];
                   }
                    
                   
                }
                
            }
       }
      
        if((a == 15)&& (c==15) &&(d == 15)){
             System.out.println("Es magico");
        } else {
             System.out.println("No es magico");
        }
        
       
        
        
       
      
        
        
        
        
        
        
        
        
        
     
     
    }
    
}
