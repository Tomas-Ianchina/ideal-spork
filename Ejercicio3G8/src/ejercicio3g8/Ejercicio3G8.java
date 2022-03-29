/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3g8;

import ejercicio3g8.Alumnos.Alumnos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio3G8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      ArrayList<Alumnos> Alumno = new ArrayList();
      String rta = "";
      
      do {
          Alumnos m = new Alumnos(); 
          System.out.println(" Ingrese el nombre del alumno");
          m.setNombre(leer.next());
          for(int i = 0;i < 3;i++) {
              System.out.println("Ingrese la nota n°"+i);
              m.setNotas(leer.nextInt());
          }
          Alumno.add(m);
          System.out.println("Quiere ingresar otro alumno?");
          rta = leer.next();
      
      } while(rta.equals("Si"));
      
        System.out.println("Ahora se calculara la nota final ");
        System.out.println("Ingrese el nombre del alumno a buscar");
        String name = leer.next();
        Alumnos m = new Alumnos();
        Alumnos k;
        int t = 0;
        for(int j = 0; j < Alumno.size();j++) {
            k = Alumno.get(j);
            if (k.getNombre().equals(name)) {
                double promedio = k.CrearNotaFinal();
                System.out.println("La nota final de  Es "+promedio);
                t++;
            } else {
                System.out.println("...");
            }
          
        }
    if (t == 0 ) {
        System.out.println(" No se encontro el alumno");
    }
   
   
    
    
    
}
}