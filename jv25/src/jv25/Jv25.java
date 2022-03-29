/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv25;


import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       Random azar = new Random();
       int i,j,n,t,a;
       int[][] num;
       int[][] mayor;
       num = new int[3][3];
       mayor = new int[10][10];
       n = 0; 
       t = 0;
       a = 0;
       
       for(i = 0;i <mayor.length;i++) {
                for(j = 0; j <mayor.length;j++) {
                    
                    mayor[i][j] = azar.nextInt(1);
                 
                }
                
            }
       
       for(i = 0;i <num.length;i++) {
                for(j = 0; j <num.length;j++) {
                    System.out.println("Ingres el numero");
                    num[i][j] = leer.nextInt();
                   
                }
                
            }
       
       
       
       for(i = 0;i <num.length;i++) {
                for(j = 0; j <num.length;j++) {
                    System.out.print(num[i][j]);  
                  
                    
                    
                   
                }
               System.out.println(" ");
            }
       
        System.out.println("////////////////////////");
         for(i = 0;i <mayor.length;i++) {
                for(j = 0; j <mayor.length;j++) {
                    
                    System.out.print(mayor[i][j]);                 
                }
                System.out.println("   ");
            }
       
       
       
       
         System.out.println("////////////////////////");
         for(i = 0;i <mayor.length;i++) {
                for(j = 0; j <mayor.length;j++) {
                    if (mayor[i][j] == num[n][t]){
                        
                        if (a == 3){
                             n++;
                             
                        } else if (a < 3) {
                            
                        
                        t++;
                        System.out.println("Concidencias en el espacio {"+i+"},{"+j+"}.");
                        a++;
                    }else {
                        n = 0 ;
                        t = 0;
                        a = 0;
                    }
                    
                                
                }
                a = 0;
            }
       
       
       
       
       if(a < 9  ) {
           System.out.println("No se encontro la matriz");
           
           
           
       }
       
       
       
       
   
    
       
       
    }
    
}
}
