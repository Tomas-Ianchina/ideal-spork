/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5g8;

import ejercicio5g8.Paises.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author TOMI
 */
public class Ejercicio5G8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      TreeSet<Paises>Conjunto = new TreeSet();
      String rta = "";
      
      do {
          Paises m = new Paises();
          System.out.println("Ingrese el nombre del Pais");
          m.setNombre(leer.next());
          Conjunto.add(m);
          System.out.println("Deseea ingresar otro pais?");
          rta = leer.next();
      } while (rta.equals("Si"));
      
      
      
      
      
      for(Paises aux:Conjunto) {
          System.out.println(aux);
      }
      
     Iterator<Paises> it = Conjunto.iterator() ;
        System.out.println("Ingrese el pais que desea buscar y eliminar");
        String g = leer.next();
        Paises m = new Paises();
     while(it.hasNext()) {
      
         if(it.next().getNombre().equals(g)) {
             it.remove();
             System.out.println("Se elimino");
             break;
         } else {
             System.out.println("No se encontro el pais");
         }
     }
     
        System.out.println("//////////////////");
        System.out.println("La lista sin el pais elegido");
        for(Paises aux:Conjunto) {
          System.out.println(aux);
      }
        
    }
    
    
    
    

}
