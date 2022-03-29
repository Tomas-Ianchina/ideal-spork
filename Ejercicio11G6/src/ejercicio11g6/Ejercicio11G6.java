/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11g6;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio11G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int anio;
    int mes;
    int day;
    System.out.println(" Ingrese el año");
    anio = leer.nextInt();
    System.out.println("Ingrese el mes ");
    mes = leer.nextInt();
     System.out.println("Ingrese el dia ");
    day = leer.nextInt();
    Date fecha = new Date(anio-1900,mes-1,day);
    Date fechaActual = new Date();
    int hoy = fechaActual.getYear() - (anio-1900);
        System.out.println(hoy +" años");
    }
    
}
