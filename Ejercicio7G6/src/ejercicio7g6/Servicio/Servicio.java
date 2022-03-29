/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7g6.Servicio;

import ejercicio7g6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades();
    int i = 0;
    public Entidades CrearPerfil(){
        System.out.println("Bienvenido Ingrese su nombre");
        m.setNombre(leer.next());
        System.out.println("Ahora ingrese su sexo");
       do {
            m.setSexo(leer.next());
        if (m.getSexo().equals("hombre")|| m.getSexo().equals("mujer")||m.getSexo().equals("otro")) {
            System.out.println("Gracias");
            i++;
        } else {
            System.out.println("Por favor ingrese de manera correcta");
        }
       }  while (i == 0);
        System.out.println("Ingrese su edad");
        m.setEdad(leer.nextDouble());
        System.out.println("Ingrese su Peso");
        m.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura");
        m.setAltura(leer.nextDouble());
       return m;
    }
    
    
    public void ConsultarIMC(Entidades m){
        System.out.println("Se comprobara su peso");
        double indice;
        double alto ; 
        int y = 0;
    
        double j;
        alto = m.getAltura()*m.getAltura();
        indice = m.getPeso()/alto;
        if(indice < 20){
            y = -1;
            System.out.println(m.getNombre()+" Esta por debajo de su peso ideal");
         
        } else if (indice >= 20 && indice <=25) {
            y = 0;
            System.out.println(m.getNombre()+" Esta en su peso ideal");
            
        } else if (indice <= 26) {
            y = 1;
            System.out.println(m.getNombre()+" Esta gordo");
           
        } 
       m.setPorcentajePeso(m.getPorcentajePeso() + y);
    }
    
    
    
    public void ConsultarEdad (Entidades m) {
        double age;
        int t = 0;
        if(m.getEdad()> 60) {
            boolean edad = true;
            if(edad == true) {
                System.out.println(m.getNombre()+" Esta viejo");
            }
            t = 0;
        } else {
             System.out.println(m.getNombre() +" Todavia es joven");
             t = 1;
        }
       m.setPorcentajeEdad(m.getPorcentajeEdad() + t);
    
    
    
    
    }
    public void PorcentPeso(Entidades m ) {
        double o; 
        o = (m.getPorcentajePeso() *100)/4;
        System.out.println("El porcentaje de personas en su peso ideal es "+o);
    }
    
    public void PorcentEdad(Entidades m ) {
        double o;
        o = (m.getPorcentajeEdad()*100)/4;
        System.out.println("El porcentaje de vejez es de "+o);
    }
    
}
