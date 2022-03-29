/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.exjv;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class EXjv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int m;
       
        System.out.println(" Ingrese la cantidad de minutos");
        m = leer.nextInt();
        convertidor(m);
        
        
        
        
    }
    
    
    public static void convertidor(int m) {
        int d,h;
        h = m/60;
        d = 0;
        do {
           if (h >=24) {
               h = h - 24;
               d++;
           }
            
            
            
            
        }while (h >= 24) ;
    
        if (h <= 0 ) {
            System.out.println("Equivalen a "+d+" Dias"  );
            
            
            
        } else {
            System.out.println("Equivalen a "+d+" Dias y "+h+" Horas");
        }
        
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
