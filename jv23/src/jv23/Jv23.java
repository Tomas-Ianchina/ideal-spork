/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv23;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[][] matriz ;
       int[][] transpuesta;
       int n,i,j;
       matriz = new int[3][3];
       transpuesta = new int[3][3];
       n = 0;
       
      for(i = 0;i <matriz.length;i++) {
                for(j = 0; j <matriz.length;j++) {
                    System.out.println("Ingrese el numero");
                    matriz[i][j] = leer.nextInt();
                    
                    
                    
                   
                }
                
            }
       
       
       for(i = 0;i <transpuesta.length;i++) {
                for(j = 0; j <transpuesta.length;j++) {
                    
                    transpuesta[i][j] = matriz[j][i];
                    
   
                }
                
            }
       
        System.out.println("//////////////VERIFICANDO//////////////");
       for(i = 0;i <transpuesta.length;i++) {
                for(j = 0; j <transpuesta.length;j++) {
                     if ((transpuesta[i][j] == (-(matriz[i][j]))) ||transpuesta[i][j] == 0 ){
                         n++;
                     }
                }
                    
                    
            }
       
       
       
       
       
       
        for(i = 0;i <matriz.length;i++) {
                for(j = 0; j <matriz.length;j++) {
                    System.out.print(matriz[i][j]);
                  
                    
                    
                    
                   
                }
                System.out.println(" ");
            }
        
        System.out.println("/////////////////////////////////");
        
        
        
       
         for(i = 0;i <transpuesta.length;i++) {
                for(j = 0; j <transpuesta.length;j++) {
                    
                    System.out.print(transpuesta[i][j]);
   
                }
                System.out.println(" ");
            }
     
         if(n == 9) {
             System.out.println("Son antisimetricas");
         }
         
         
        
    }
    }
    

