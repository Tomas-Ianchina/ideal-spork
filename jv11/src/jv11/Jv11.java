/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv11;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i,j;
        i = 10;
        j = 0;
        double r,n;
        System.out.println("Ingrese el numero");
        n = leer.nextDouble();
        r = n;
      
        do {
         if(r < i){
             r = r *i;
             r = r % i;
             j++;
             break;
         } else {
            r = r / i;
            j++;
         }
           
       
        } while (r > 0);
        
        System.out.println(j);
        
     
        
    }
        
        
        
       
        
       
    }
    

