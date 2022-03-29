/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1g8ex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio1G8EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      ArrayList<Integer> Lista = new ArrayList();
      Integer i ;
      int t = 0; 
      int p = 0;
      do {
          System.out.println("Ingresar numeros");
          i = leer.nextInt();
          if(i == -99) {
              t++;
          } else {
              Lista.add(i);
          }
      } while (t == 0);
      

        System.out.println("Mostrando lista");
        for(Integer aux:Lista) {
            System.out.println(aux);
        }
        
        
        
        System.out.println("Sumatoriaaaa");
        
        for(int j = 0; j < Lista.size(); j++) {
            p = p + Lista.get(j);
            
        }
        System.out.println(p+" Es la suma de los numeros");
        
        
        p =(Integer) p/ Lista.size();
        
        System.out.println(p+ " es el promedio");
        
        
    }
    
}
