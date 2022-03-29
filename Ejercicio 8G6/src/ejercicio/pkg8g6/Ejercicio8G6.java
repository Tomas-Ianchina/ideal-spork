/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8g6;

import ejercicio.pkg8g6.Entidades.Entidades;
import ejercicio.pkg8g6.Servicio.Servicio;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio8G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio v = new Servicio();
        Scanner leer = new Scanner(System.in);
        Entidades m = new Entidades();
        System.out.println("Ingrese la palabra  o frase");
        m.setPalabra(leer.next());
        m.setLongitud((m.getPalabra().length()));
       
        System.out.println("Ahora nos continuaremos con los metodos");
        System.out.println("Mostrar vocales");
        v.MostrarVocales(m);
        System.out.println("Invertir frase");
        v.InvertirFrase(m);
        System.out.println("Unir frase");
        v.UnirFrase(m);
        System.out.println("Contiene letra");
        v.ContieneLetra(m);
        System.out.println("Remplazar letra");
        v.RemplazarLetras(m);
        System.out.println("Comparar Frase ");
        v.CompararFrase(m);
        System.out.println("Veces repetido");
        v.VecesRepetido(m);
    }
    
}
