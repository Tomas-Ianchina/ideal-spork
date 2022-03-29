/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1g9;

import ejercicio1g9.Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio1G9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
     ArrayList<Persona> Lista = new ArrayList();
     
     int i = 0;
       
     do {
        Persona j = new Persona();
        System.out.println("Ingrese el nombre de las persona");
        j.setNombre(leer.next());
        System.out.println("Ingrese el Apellido");
        j.setApellido(leer.next());
        System.out.println("Ingrese el Dni de la persona");
        j.setDni(leer.nextInt());
        j.DatosPerro();
        Lista.add(j);
        i++;
       
    } while(i < 2);
    
     for(Persona aux: Lista) {
          
         System.out.println(aux);
     
     }
       
        
        
    }
    
    
    
    
   
    
    
}
