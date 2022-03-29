/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7g6;

import ejercicio7g6.Entidades.Entidades;
import ejercicio7g6.Servicio.Servicio;

/**
 *
 * @author TOMI
 */
public class Ejercicio7G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Servicio v = new Servicio();
      int l;
     
      for(l = 0;l <4;l++ ) {
           Entidades m = v.CrearPerfil();
           v.ConsultarIMC(m);
           v.ConsultarEdad(m);
           if (l == 3) {
               v.PorcentPeso(m);
      v.PorcentEdad(m);
           }
      }
      
        
      
      
      
    }
    
}
