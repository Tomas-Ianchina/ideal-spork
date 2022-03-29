/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8g6.Entidades;

/**
 *
 * @author TOMI
 */
public class Entidades {
    private String palabra ;
    private int longitud;
    
    
    
    public Entidades() {
        
    }
    
    
    public Entidades (String palabra, int longitud) {
        this.palabra = palabra;
        this.longitud = longitud;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getPalabra() {
        return palabra;
    }

    public int getLongitud() {
        return longitud;
    }
    
    
    
    
    
    
    
    
}
