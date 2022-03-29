/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12g6.Persona;

import ejercicio12g6.Entidades.Entidades;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Persona {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades();
    
    public Entidades CrearPersona(){
        System.out.println("Ingrese el nombre de la persona");
        m.setName(leer.next());
        System.out.println("Ingrese el anio de nacimiento");
        m.setAnio(leer.nextInt());
        System.out.println("Ingrese el mes de nacimiento ");
        m.setMes(leer.nextInt()-1);
        System.out.println("Ingrese el dia de nacimiento");
        m.setDia(leer.nextInt());
        return m;
     
    }
    
    
    public void CalcularEdad(Entidades m ) {
        System.out.println("Ahora se calculara su edad");
        Date fecha = new Date(m.getAnio()-1900,m.getMes(),m.getDia());
        Date fechaActual = new Date(); 
        int anos;
        if (fechaActual.getMonth()< m.getMes()) {
            anos = fechaActual.getYear() - m.getAnio();
           anos = anos -1;
            System.out.println(m.getName()+ " Tiene "+anos);
        } else {
             anos = fechaActual.getYear() - m.getAnio();
            System.out.println(m.getName()+ " Tiene "+anos);
        }
        
        m.setEdad(anos);
        
        
    }
    
    public void MenorQ( Entidades m) {
        System.out.println("SE comprobara si es menor que...");
        System.out.println(" INgrese el nombre");
        String nombre = leer.next();
        System.out.println("Ingrese el año de nacimineto");
        int ano = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        int mes = leer.nextInt()-1;
        System.out.println("Ingrese el dia de nacimiento");
        int dia = leer.nextInt();
        Date fechas = new Date(ano-1900,mes,dia);
        Date hoy = new Date();
        int edad2 = hoy.getYear() - ano;
        
        if(m.getEdad() < edad2) {
            System.out.println(nombre+" es mayor");
        } else if (m.getEdad() > edad2 ) {
            System.out.println(m.getName()+" es mayor");
        } else if (m.getEdad() == edad2) {
            System.out.println("Tienen la misma edad");
        }
    }
    
    public void Perfil( Entidades m) {
        System.out.println("El nombre es"+m.getName());
        System.out.println("Tiene "+m.getEdad()+" años");
        
    }
    
    
    
}
