/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg26jv;

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
        double e,resultado;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros que desea cambiar");
        e = leer.nextDouble();
        
        
       resultado = cambioy(e);
        System.out.println("La cantidad de "+e+" en yenes es "+resultado);
        resultado = cambiol(e);
        System.out.println("La cantidad de "+e+" en libras es "+resultado);
        resultado = cambiod(e);
          System.out.println("La cantidad de "+e+" en dolares es "+resultado);
        
        
    }
    
    
    
    
    
    public static double cambioy(double e) {
        double yenes = 130,resul;
        
        resul = yenes * e;
   
        
        
        
        
        
        
        
        return resul;
    }
    
    
      public static double cambiol(double e) {
        double l = 0.89 ,resul;
        
        resul = l * e;
   
        
        
        
        
        
        
        
        return resul;
      }
    
      public static double cambiod(double e) {
        double dolares = 1.28611,resul;
        
        resul = dolares * e;
   
        
        
        
        
        
        
        
        return resul;
      }
    
    
    
    
}
