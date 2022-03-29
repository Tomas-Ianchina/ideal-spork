/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2g8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio2G8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ArrayList <String> Raza = new ArrayList();
       Scanner leer = new Scanner(System.in);
       int i = 0;
       String rta;
       do {
           System.out.println("Hola quiere ingresar la raza de un perro");
           Raza.add(leer.next());
           System.out.println("Queres ingresar otra raza?");
           rta = leer.next();
           if (rta.equals("no")) {
               System.out.println("Buenas noches");
               i = 1;
           } 
           
           
       } while(i == 0);
       
       
       for(i = 0; i < Raza.size();i++) {
           String m = Raza.get(i);
           if(m.equals("retriever")){
               Raza.remove(m);
           } 
       }

       
       for(String var:Raza){
           System.out.println(var);
       }
       
    }
    
}
