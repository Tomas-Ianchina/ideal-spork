/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7g6.Entidades;

/**
 *
 * @author TOMI
 */
public class Entidades {
    private String nombre;
    private double edad;
    private double peso;
    private String sexo;
    private double altura;
    private double porcentajeEdad;
    private double porcentajePeso;
    
    public Entidades() {
        
    }
    
    public Entidades(String nombre,double edad,double peso,String sexo,double altura,double porcentajeEdad,double porcentajePeso) {
    this.nombre = nombre;
    this.edad = edad;
    this.peso = peso;
    this.sexo = sexo;
    this.altura = altura;
    this.porcentajeEdad = porcentajeEdad;
    this.porcentajePeso = porcentajePeso;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public double getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    public String getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setPorcentajeEdad(double porcentajeEdad) {
        this.porcentajeEdad = porcentajeEdad;
    }

    public void setPorcentajePeso(double porcentajePeso) {
        this.porcentajePeso = porcentajePeso;
    }

    public double getPorcentajeEdad() {
        return porcentajeEdad;
    }

    public double getPorcentajePeso() {
        return porcentajePeso;
    }
    
    
    
}
