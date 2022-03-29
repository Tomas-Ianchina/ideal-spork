/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6g6.Servicio;

import ejercicio6g6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades(0, 0);
    
    
    public Entidades ConfigurarCafetera() {
        int i = 0;
        do {
           i = 0;
            System.out.println("Establezca el tamaño de la cafetera");
            m.setCantidadMax(leer.nextInt());
            System.out.println("Establezca la cantidad inicial de cafe");
            m.setCantidadActual(leer.nextInt());
            if(m.getCantidadActual(0) > m.getCantidadMax(0) ) {
               System.out.println("Error la cantidad inicial es mayor a la capacidad maxima");
                System.out.println("Se reiniciara el procedimiento");
                i = 0;
            } else {
                i++;
            }
        } while (i == 0);
        return m;
    } 
    
    public void ServirTaza(Entidades m) {
        int taza1 = 100;
        int taza2 = 150;
        int taza3 = 200;
        int i = 0;
        
          System.out.println("Seleccione la taza");
          System.out.println("1.Taza Chica");
          System.out.println("2.Taza Mediana");
          System.out.println("3.Taza Grande");
          i = leer.nextInt();
        switch(i) {
            case 1: 
                int c = 0;
                if(m.getCantidadActual(taza1)< taza1) {
                    c = m.getCantidadActual(c);
                    m.setCantidadActual(0);
                    System.out.println("La taza se lleno con "+c+" Mililitros");
                } else {
                    System.out.println("La taza se lleno por completo");
                    m.setCantidadActual(m.getCantidadActual(taza1) - taza1);
                }
                break;
            case 2: 
                int d = 0;
                if(m.getCantidadActual(taza2)< taza2) {
                    d = m.getCantidadActual(d);
                    m.setCantidadActual(0);
                    System.out.println("La taza se lleno con "+d+" Mililitros");
                } else {
                    System.out.println("La taza se lleno por completo");
                    m.setCantidadActual(m.getCantidadActual(taza2) - taza2);
                }
                break;
            case 3: 
                int a = 0;
                if(m.getCantidadActual(taza3)< taza3) {
                    a = m.getCantidadActual(a);
                    m.setCantidadActual(0);
                    System.out.println("La taza se lleno con "+a+" Mililitros");
                } else {
                    System.out.println("La taza se lleno por completo");
                    m.setCantidadActual(m.getCantidadActual(taza3) - taza3);
                }
                break;
           
        }
        
    }
    
    public void VaciarCafetera(Entidades m) {
        System.out.println("Vaciando Cafetera");
        m.setCantidadActual(0);
    }
    
    
    public void AgregarCafe(Entidades m) {
        System.out.println("Cuanto Cafe desea Agregar?");
        int j = leer.nextInt();
        m.setCantidadActual(m.getCantidadActual(j) + j);
        if(m.getCantidadMax(j) < m.getCantidadActual(j)){
            System.out.println("Limite Sobrepasado");
            System.out.println("Vaciando cafetera");
            m.setCantidadActual(0);
        }
    }
    
    
    
}
