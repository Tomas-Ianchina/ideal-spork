/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1xg6;

import ejercicio1xg6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio1XG6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Entidades m = new Entidades();
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese el titulo de la cancion");
        m.setTitulo(leer.next());
        System.out.println("Ingrese el autor de la cancion");
        m.setAutor(leer.next());
        
        System.out.println("El titulo de la cancion es "+m.getTitulo());
        System.out.println("Y el autor de la cancion es "+m.getAutor());
    }
    
}
