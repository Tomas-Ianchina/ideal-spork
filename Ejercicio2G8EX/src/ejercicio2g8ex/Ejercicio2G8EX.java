/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2g8ex;

import ejercicio2g8ex.Cantantes.Cantantes;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio2G8EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Cantantes> lista = new ArrayList();
        int t = 0;
        do {
            Cantantes m = new Cantantes();
            System.out.println("Ingrese el nombre del cantante que desea agregar");
            m.setNombre(leer.next());
            System.out.println("Ingrese su disco mas vendido");
            m.setDiscoMasVendido(leer.next());
            lista.add(m);
            System.out.println("Desea agregar a otro cantante?");
            String rta  = leer.next();
            if(rta.equals("No")) {
                t++;
            }
        } while(t == 0 );
        
        for(Cantantes aux: lista) {
            System.out.println(aux);
        }
        
        
        System.out.println("Elimar un cantante");
        System.out.println("Ingrese el nombre del cantante");
        String g = leer.next();
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getNombre().equals(g)) {
                lista.remove(i);
            }
        }
        
        System.out.println("la nueva lista es :");
          for(Cantantes aux: lista) {
            System.out.println(aux);
        }
    

    }
    
    
    
}
