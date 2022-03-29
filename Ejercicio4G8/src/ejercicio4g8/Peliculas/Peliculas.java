/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4g8.Peliculas;

/**
 *
 * @author TOMI
 */
public class Peliculas {
    private String Nombre;
    private Integer Tiempo;
    private String Autor; 
    
    
    public Peliculas ( ) {
        
    }
    
    public Peliculas(String Nombre,Integer Tiempo,String Autor) {
        this.Nombre = Nombre; 
        this.Autor = Autor;
        this.Tiempo = Tiempo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getTiempo() {
        return Tiempo;
    }

    public void setTiempo(Integer Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "Nombre=" + Nombre + ", Tiempo=" + Tiempo + ", Autor=" + Autor + '}';
    }
    
    
}
