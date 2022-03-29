/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2xg6;

import ejercicio2xg6.Entidades.Entidades;
import ejercicio2xg6.Servicio.Servicio;

/**
 *
 * @author TOMI
 */
public class Ejercicio2XG6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio v = new Servicio();
        Entidades m = v.CrearPuntos();
        
        v.CalcularDistancia(m);
    }
    
}
