/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9g6.Servicio;

import ejercicio9g6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades(0, 0);
    
    
    public void DevolverMayor(Entidades m ) {
        if(m.getNumero1()<m.getNumero2() ) {
            System.out.println("El numero 2 es mayor con "+m.getNumero2());
            double c = m.getNumero1();
            m.setNumero1(m.getNumero2());
            m.setNumero2(c);
        } else if(m.getNumero1()>m.getNumero2() ) {
            System.out.println("El numero1 es mayor con "+m.getNumero1());
         
        } else if(m.getNumero1() == m.getNumero2() ) {
            System.out.println("Son iguales");
        }
    }
    
    
    
    
    public void Potenciacion(Entidades m) {
        System.out.println("La potencia de "+m.getNumero1()+" elevado a la "+m.getNumero2()+" es");
        double potencia;
        potencia = (Math.pow(m.getNumero1(),m.getNumero2()));
        System.out.println(potencia);
    }
    
    
    public void Raiz(Entidades m) {
        System.out.println("La raiz de "+m.getNumero2()+"al cuadrado");
        double resultado = Math.sqrt(m.getNumero2());
        System.out.println(" El resultado es "+resultado);
    }
}
