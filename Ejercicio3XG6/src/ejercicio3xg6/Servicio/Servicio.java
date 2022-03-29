/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3xg6.Servicio;

import ejercicio3xg6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades();
    
    
    public Entidades CrearValores() {
        System.out.println("Ingrese el valor de a");
        m.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de b");
        m.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de c");
        m.setC(leer.nextDouble());
        return m;
    }
    
    
    
    public void CrearDiscriminador(Entidades m) {
       double B = Math.pow(m.getB(), 2);
       m.setDiscri((B)-4*m.getA()*m.getC() );
        System.out.println("El discriminador es "+m.getDiscri());
    }
    
    
    public void TieneRaices(Entidades m) {
        boolean t = false;
        if(m.getDiscri()>=0) {
            t = true;
            System.out.println("Tiene 2 soluciones");
            
        } else if(m.getDiscri()<0){
            System.out.println("No tiene solucion");
            
        }
        m.setTienes(t);
    }
    public void TieneRaiz(Entidades m) {
       boolean t = false;
        if(m.getDiscri()== 0) {
            System.out.println("Tiene solo una solucion");
        
        }
        m.setTie(t);
    }
    
    public void ObtenerRaices(Entidades m) {
        if(m.getTienes()== true){
            double B = Math.pow(m.getB(), 2);
        double A = m.getA();
        double C = m.getC();
        double V = m.getB();
        double l = Math.sqrt(B-4*A*C);
        double resultado1;
        double resultado2;
        System.out.println("Se realizaran los calculos");
        resultado1 =(-V+l)/2*A;
        System.out.println("El resultado 1 es "+resultado1);
        resultado2 =(-V-l)/2*A;
        System.out.println("El resultado 2 es "+resultado1);
        } else {
            System.out.println("Solo tiene 1 resultado");
        }
        
    }
    
    public void ObtenerRaiz(Entidades m){
        if(m.getTie() == true) {
            double B = Math.pow(m.getB(), 2);
        double A = m.getA();
        double C = m.getC();
        double V = m.getB();
        double l = Math.sqrt(B-4*A*C);
        double resultado1;
        double resultado2;
        System.out.println("Se realizaran los calculos");
        resultado1 =(-V+l)/2*A;
        System.out.println("El resultado 1 es "+resultado1);
        } else {
            System.out.println("Tiene mas de 1 discriminante");
        }
      
    }
    
    public void Calcular
}
