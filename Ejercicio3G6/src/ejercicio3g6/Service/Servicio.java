/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3g6.Service;

import ejercicio3g6.entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades(0, 0);
    
    public Entidades CrearOperacion() {
        System.out.println("Ingrese el numero 1 ");
        m.setNumero1(leer.nextDouble());
        System.out.println("Ingrese el numero 2 ");
        m.setNumero2(leer.nextDouble());
        
        
        
        return m;
        
        
    }
    
    
    
    public void CrearSuma(Entidades m) {
        double suma = 0;
        
        suma = m.getNumero1(suma) + m.getNumero2(suma);
        System.out.println("La suma es "+ suma);     
        
        
        
        
    }
    
    
     public void CrearResta(Entidades m) {
        double resta = 0;
        
        resta = m.getNumero1(resta) - m.getNumero2(resta);
        System.out.println("La resta es "+ resta);     
        
        
        
        
    }
     
     
     
      public void CrearDivision(Entidades m) {
        double division = 0;
        
        if (m.getNumero1(division) == 0 || m.getNumero2(division) == 0 ) {
            System.out.println("ERROR");
        } else {
            division = m.getNumero1(division) / m.getNumero2(division);
        System.out.println("La division es "+ division);     
        }
        
        
        
    }
    
      
      
     public void CrearMultiplicacion(Entidades m) {
        double multiplicacion = 0;
        if (m.getNumero1(multiplicacion) == 0 || m.getNumero2(multiplicacion) == 0 ) {
            System.out.println("ERROR");
        } else {
            multiplicacion = m.getNumero1(multiplicacion) * m.getNumero2(multiplicacion);
        System.out.println("La multiplicacion es "+ multiplicacion);     
        }
        
        
        
        
        
    }
      
      
      
   
      
     
    
    
    
    
}
