/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4g6;

import ejercicio4g6.Entidades.Entidades;
import ejercicio4g6.Servicio.Servicio;

/**
 *
 * @author TOMI
 */
public class Ejercicio4G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Servicio v = new Servicio();
    Entidades m = v.CrearRectangulo();
    v.CrearArea(m);
    v.CrearPerimetro(m);
    v.DibujarRectangulo(m);
    }
    
    
    
    
    
    
    
    
    
}
