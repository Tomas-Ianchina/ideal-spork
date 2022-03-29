/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodelcirculo.main;

import ejerciciodelcirculo.main.EntidadesElementos.EntidadesCircunferencia;
import ejerciciodelcirculo.main.metodos.Logica;

/**
 *
 * @author TOMI
 */
public class EjercicioDelCirculoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Logica v1 = new Logica();
        EntidadesCircunferencia m = v1.CrearCircunferencia();
        v1.CrearArea(m);
        v1.CrearDiametro(m);
      
        
        
        
        
        
        
        
        
      
    }
    
}
