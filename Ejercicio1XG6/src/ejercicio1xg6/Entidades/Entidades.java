/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1xg6.Entidades;

/**
 *
 * @author TOMI
 */
public class Entidades {
    private  String Titulo;
    private String Autor;
    
    
    
    public Entidades () {
        
    }
    
    public Entidades (String Titulo,String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }
    
    
}
