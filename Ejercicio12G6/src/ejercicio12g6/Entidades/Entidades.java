/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12g6.Entidades;

import java.util.Date;

/**
 *
 * @author TOMI
 */
public class Entidades {
    private String  name;
    private int anio;
    private int mes;
    private int dia;
    private int edad;
   
    
    
    
    public Entidades() {
        
    }
    
    public Entidades(String name,int edad,int anio,int mes,int dia) {
        this.name = name;
        this.anio = anio;
        this.edad = edad;
       
        this.mes = mes; 
        this.dia  = dia;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getEdad() {
        return edad;
    }

  

    public String getName() {
        return name;
    }

    public int getAnio() {
        return anio;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    
}
