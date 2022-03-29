/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3g9.Baraja;

/**
 *
 * @author TOMI
 */
public class Carta {
    private Integer Nro;
    private String Palo;
    

    public Integer getNro() {
        return Nro;
    }
    

    public void setNro(Integer Nro) {
        this.Nro = Nro;
    }

    public Carta() {
    }

    public String getPalo() {
        return Palo;
    }

    public void setPalo(String Palo) {
        this.Palo = Palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "Nro=" + Nro + ", Palo=" + Palo + '}';
    }

   

   
    
    
}
