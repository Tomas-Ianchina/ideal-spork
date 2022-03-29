/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.Entidades;

/**
 *
 * @author TOMI
 */
public class Entidades {
    private String titulo;
    private Integer tiempo;
    private String autor;
    
    public Entidades () {
        
    }

    public Entidades(String titulo, Integer tiempo, String autor) {
        this.titulo = titulo;
        this.tiempo = tiempo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTiempo() {
        return tiempo;
    }

    public void setTiempo(Integer tiempo) {
        this.tiempo = tiempo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Entidades{" + "titulo=" + titulo + ", tiempo=" + tiempo + ", autor=" + autor + '}';
    }
    
    
}
