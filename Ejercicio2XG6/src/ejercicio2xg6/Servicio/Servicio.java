/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2xg6.Servicio;

import ejercicio2xg6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades();
    
    public Entidades CrearPuntos() {
        System.out.println("Ingrese el numero del punto X1");
        m.setX1(leer.nextDouble());
        System.out.println("Ingrese el numero del punto Y1");
        m.setY1(leer.nextDouble());
        System.out.println("Ingrese el numero del punto X2");
        m.setX2(leer.nextDouble());
        System.out.println("Ingrese el numero del punto Y2");
        m.setY2(leer.nextDouble());
        
        return m;
    }
    
    
    
    public void CalcularDistancia(Entidades m) {
        double resultado;
        double X =m.getX2()-m.getX1() * m.getX2()-m.getX1(); 
        double Y =m.getY2()-m.getY1() * m.getY2()-m.getY1();
        resultado = Math.sqrt(X + Y);
        System.out.println("El resultado de la distancia entre los puntos es"+resultado);
    }
}
