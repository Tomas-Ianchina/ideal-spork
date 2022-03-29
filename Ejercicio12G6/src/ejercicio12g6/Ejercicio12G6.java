/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12g6;

import ejercicio12g6.Entidades.Entidades;
import ejercicio12g6.Persona.Persona;

/**
 *
 * @author TOMI
 */
public class Ejercicio12G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona v = new Persona();
        Entidades m = v.CrearPersona();
        v.CalcularEdad(m);
        v.MenorQ(m);
        v.Perfil(m);
    }
    
}
