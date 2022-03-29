/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6g6;

import ejercicio6g6.Entidades.Entidades;
import ejercicio6g6.Servicio.Servicio;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio6G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Servicio v = new Servicio();
        Entidades m = v.ConfigurarCafetera();
        int  i;
        
         System.out.println("La CapacidadMax de su cafetera es "+ m.getCantidadMax(0));
        do {
            System.out.println("La Capacidad Actual es de "+m.getCantidadActual(0));
            System.out.println("Que desea hacer?");
            System.out.println("1.Servir taza");
            System.out.println("2.Vaciar Cafetera");
            System.out.println("3.Agregar Cafe");
            System.out.println("4.Apagar Cafetera");
            i = leer.nextInt();
            
            switch(i) {
                case 1:
                    v.ServirTaza(m);
                    break;
                case 2:
                    v.VaciarCafetera(m);
                    break;
                case 3:
                    v.AgregarCafe(m);
                    break;
                case 4:
                    System.out.println("Apagando");
                    break;
            }
            
            
        } while (i != 4);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
