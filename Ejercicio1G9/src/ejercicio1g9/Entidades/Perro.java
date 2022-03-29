/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1g9.Entidades;

/**
 *
 * @author TOMI
 */
public class Perro {
    private String raza;
    private String tamaño;
    private Integer edad;

    public Perro() {
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", tama\u00f1o=" + tamaño + ", edad=" + edad + '}';
    }
    

    
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
    
    
}
