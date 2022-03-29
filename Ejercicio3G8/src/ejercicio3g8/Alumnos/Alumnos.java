/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3g8.Alumnos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Alumnos {
    String nombre;
    ArrayList<Integer> notas = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public String toString() {
        return "Alumnos{" + "Nombre=" + nombre + ", Notas=" + notas + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(Integer notas) {
        this.notas.add(notas);
    }

    public Alumnos(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList();
        this.leer =  new Scanner(System.in).useDelimiter("\n");
    }

    public Alumnos() {
    }

    public double CrearNotaFinal() {
        double contador = 0;
        for(int i = 0;i < 3;i++) {
            contador = contador + notas.get(i);
            
        }
        return contador/3;
    } 
    
    
    
    
    
    
    
    
}
