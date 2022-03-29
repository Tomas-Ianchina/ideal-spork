/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3g6;

import ejercicio3g6.Service.Servicio;
import ejercicio3g6.entidades.Entidades;

/**
 *
 * @author TOMI
 */
public class Ejercicio3G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio v1 = new Servicio();
       Entidades m = v1.CrearOperacion();
       v1.CrearSuma(m);
       v1.CrearResta(m);
       v1.CrearMultiplicacion(m);
       v1.CrearDivision(m);
       
       
       
    }
    
}
