/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2g8ex.Cantantes;

/**
 *
 * @author TOMI
 */
public class Cantantes {
    private String nombre;
    private String DiscoMasVendido;

    public Cantantes() {
    }

    public Cantantes(String nombre, String DiscoMasVendido) {
        this.nombre = nombre;
        this.DiscoMasVendido = DiscoMasVendido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoMasVendido() {
        return DiscoMasVendido;
    }

    public void setDiscoMasVendido(String DiscoMasVendido) {
        this.DiscoMasVendido = DiscoMasVendido;
    }

    @Override
    public String toString() {
        return "Cantantes{" + "nombre=" + nombre + ", DiscoMasVendido=" + DiscoMasVendido + '}';
    }
    
    

}
