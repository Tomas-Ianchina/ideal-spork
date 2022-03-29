/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.Utilidades;

import cine.Entidades.Entidades;
import java.util.Comparator;

/**
 *
 * @author TOMI
 */
public class Utilidades {
    public static Comparator<Entidades> OrdenarporDuracionDes = new Comparator<Entidades> () {
        @Override
        public int compare(Entidades t, Entidades t1) {
           return t1.getTiempo().compareTo(t.getTiempo());
        }
    };
    
    public static Comparator<Entidades> OrdenarporDuracionAsc = new Comparator<Entidades> () {
        @Override
        public int compare(Entidades t, Entidades t1) {
           return t.getTiempo().compareTo(t1.getTiempo());
        }
    };
    
     public static Comparator<Entidades> OrdenarporTitulonAsc = new Comparator<Entidades> () {
        @Override
        public int compare(Entidades t, Entidades t1) {
           return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
       public static Comparator<Entidades> OrdenarporAutorAsc = new Comparator<Entidades> () {
        @Override
        public int compare(Entidades t, Entidades t1) {
           return t.getAutor().compareTo(t1.getAutor());
        }
    };
    
}
