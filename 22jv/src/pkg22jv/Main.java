/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22jv;

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
    
       int i,j;
       int[][] num;
 
       num = new int[4][4];
    
        

            for(i = 0;i <num.length;i++) {
                for(j = 0; j <num.length;j++) {
                    
                    num[i][j] = (int) (Math.random()*10);
                    
                    
                    
                    
                }
                
            }
                
            
             for(i = 0;i <num.length;i++) {
                for(j = 0;j <num.length;j++) {
                    
                    System.out.print(num[i][j]);
                    
                    
                    
                    
                }
                 System.out.println(" ");
            }
            
            System.out.println("/////////////////////////////");
           
            for(i = 0; i <num.length;i++ ) {
                for(j = 0; j <num.length;j++){
                    
                    System.out.print(num[j][i]);
                    
                    
                    
                }
                    
                
                System.out.println(" ");
                
            }
                
            
            
            
            
            
            
            
        
        
        
        
       
    }
    
}
