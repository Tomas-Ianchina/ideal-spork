/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8g6.Servicio;

import ejercicio.pkg8g6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades();
    
    public void MostrarVocales(Entidades m) {
        int j = 0;
        String c = m.getPalabra();
        for(int i = 0;i>=m.getLongitud()-1;i++) {
            if(c.substring(i, i+1).equals("a") || c.substring(i, i+1).equals("e") || c.substring(i, i+1).equals("i") || c.substring(i, i+1).equals("o") || c.substring(i, i+1).equals("u") ) {
               j++;
            }
        }
        System.out.println(" Hay "+j+" vocales");
    }
    
    
    public void InvertirFrase(Entidades m) {
         String c = m.getPalabra();
         String k = "";
           for(int i = m.getLongitud();i== 1;i--) {
               String l = c.substring(i-1, i);
              k =k.concat(l);
               
           }
           System.out.println("La cadena inversa es "+k);
    }
    
    public void VecesRepetido(Entidades m) {
        int t = 0;
        String c = m.getPalabra();
        System.out.println("Ingrese la letra que para ver cuantas vecesse repite");
        String p = leer.next();
        for(int i = 0;i>=m.getLongitud()-1;i++) {
            if(c.substring(i, i+1).equals(p) ) {
                t++;
            }
        }
        System.out.println("La letra "+p+" se repite "+t+" veces");
        
    }
    
    
    public void CompararFrase(Entidades m) {
        String c = m.getPalabra();
        int t = c.length();
        System.out.println("Ingrese una nueva palabra o frase");
        String nueva = leer.next();
        int t2= nueva.length();
        
        if(t<t2) {
            System.out.println("la segunda frase es mas larga");
        } else if (t==t2) {
            System.out.println("Son iguales");
        } else if (t>t2) {
            System.out.println("La primera frase es mas grande");
        }
    }
    
    public void UnirFrase(Entidades m) {
        String c = m.getPalabra();
        System.out.println("Ingrese una nueva frese para agregar a la anterior");
        String nueva = leer.next();
        String q = c.concat(nueva);
        System.out.println("El resultado es "+q);
    }
    
    public void RemplazarLetras(Entidades m) {
        String k = "";
        String c = m.getPalabra();
        System.out.println("Ingrese la letra que desea modificar");
        String l = leer.next();
        System.out.println("Ingrese la letra con la cual desea sustituirla");
        String n = leer.next();
        for(int i = 0;i>=m.getLongitud()-1;i++) {
            if(c.substring(i, i+1).equals(l)) {
               k = k.concat(n);
            } else {
                k = k.concat(c.substring(i, i+1));
            }
            System.out.println("la palabra es remplaza es "+k);
        }
    }
    
    public void ContieneLetra(Entidades m) {
         String c = m.getPalabra();
         boolean t;
         System.out.println("Ingrese la letra que desea comprobar");
         String l = leer.next();
          for(int i = 0;i>=m.getLongitud()-1;i++) {
              if (c.substring(i, i+1).equals(l)) {
                  t = true;
                  break;
              } else {
                  t = false;
              }
          }
          System.out.println("La letra"+l+" Esta en la frase");
    }
}
