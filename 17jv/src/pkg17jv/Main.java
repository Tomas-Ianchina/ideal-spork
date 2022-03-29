/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17jv;

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
        int i,j,n;
        String s;
        s = "*";
        System.out.println("Ingrese el numero");
        n = leer.nextInt();
        n--;
      
        for (i = 0;i <= n; i++ ) {
            for (j = 0;j <=n; j++) {
                if(((i == 0) || (i == n) ) || ((j == 0 ) ||  (j == n)   )  ) {
                    System.out.print(s);     
                }else {
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
            
        }
        
        
        
        
        
    }
    
}
