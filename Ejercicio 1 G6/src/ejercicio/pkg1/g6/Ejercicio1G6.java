/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.g6;

import ejercicio.pkg1.g6.info.Datos;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio1G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     Datos m = new Datos (leer.next(),leer.next(),leer.next());
    
        System.out.println("El libro es" + m.titulo);
        System.out.println("El autor es" + m.autor);
        System.out.println("La cantidad de paginas es " + m.pag);
        System.out.println(m.ISBN+" es el codigo");
     
     
        
        
        System.out.println("");
     
     
     
     
     
    }
    
}
