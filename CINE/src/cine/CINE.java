/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

import cine.Entidades.Entidades;
import cine.Utilidades.Utilidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class CINE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
        ArrayList<Entidades> lista = new ArrayList();
        String rta = ""; 
        
        do{
            Entidades m = new Entidades();
            System.out.println("Ingrese el titulo de la pelicula");
            m.setTitulo(leer.next());
            System.out.println("Ingrese el Autor de la pelicula");
            m.setAutor(leer.next());
            System.out.println("Ingrese el tiempo de la pelicula en minutos");
            m.setTiempo(leer.nextInt());
            lista.add(m);
            System.out.println("Quiere ingresar el nombre de otra pelicula");
            rta = leer.next();
        } while(rta.equals("Si"));
        
        
       for(Entidades aux:lista) {
           System.out.println(aux);
       }
        
        System.out.println("Las peliculas que duran mas de 60 minutos son");
        System.out.println("//////////////////////////////////////////////");
       for(int i = 0; i < lista.size();i++) {
           Entidades k = lista.get(i) ;
           if(k.getTiempo()>=60) {
           System.out.println(k);
       }
       }
       System.out.println("//////////////////////////////////////////////");
        System.out.println("Las peliculas ordenadas por tiempo de forma decs son");
        Collections.sort(lista, Utilidades.OrdenarporDuracionDes);
       
        for(Entidades aux:lista) {
           System.out.println(aux);
       }
        
         System.out.println("//////////////////////////////////////////////");
        System.out.println("Las peliculas ordenadas por tiempo de forma Asc son");
        Collections.sort(lista, Utilidades.OrdenarporDuracionAsc);
        
          for(Entidades aux:lista) {
           System.out.println(aux);
       }
       
          
          System.out.println("//////////////////////////////////////////////");
        System.out.println("Las peliculas ordenadas por titulo son");
        Collections.sort(lista, Utilidades.OrdenarporTitulonAsc);
        
          for(Entidades aux:lista) {
           System.out.println(aux);
       }
          
          
       System.out.println("//////////////////////////////////////////////");
        System.out.println("Las peliculas ordenadas por autor son");
        Collections.sort(lista, Utilidades.OrdenarporAutorAsc);
        
          for(Entidades aux:lista) {
           System.out.println(aux);
       }   
          
          
          
    }
    
}
