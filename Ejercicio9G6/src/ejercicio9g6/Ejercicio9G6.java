/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9g6;

import ejercicio9g6.Entidades.Entidades;
import ejercicio9g6.Servicio.Servicio;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio9G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio v = new Servicio();
       Scanner leer = new Scanner(System.in);
       Entidades m = new Entidades();
        System.out.println("Se crearan 2  numeros al azar");
        m.setNumero1((int) (Math.random()*10));
        System.out.println("El primer numero es "+m.getNumero1());
        m.setNumero2((int) (Math.random()*10));
        System.out.println("El segundo numero es "+m.getNumero2());
        
        v.DevolverMayor(m);
        v.Potenciacion(m);
        v.Raiz(m);
    }
    
}
