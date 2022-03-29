/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1g9.Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Persona {
    private Integer Dni;
    private String nombre;
    private String Apellido;
    ArrayList<Perro> lista = new ArrayList();
Scanner leer = new Scanner(System.in);
    public Persona() {
    }

    public Integer getDni() {
        return Dni;
    }

    public void setDni(Integer Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public ArrayList<Perro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Perro> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Persona{" + "Dni=" + Dni + ", nombre=" + nombre + ", Apellido=" + Apellido + ", lista=" + lista + '}';
    }

    

   
    
  
    public  void  DatosPerro() {
        Perro k = new Perro();
        System.out.println("Ingrese los datos del perro");
        System.out.println("Ingrese el tamaño del perro");
        k.setTamaño(leer.next());
        System.out.println("Ingrese la raza del perro");
        k.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro");
        k.setEdad(leer.nextInt());
         lista.add(k);
    }
    
  
    
    
}
