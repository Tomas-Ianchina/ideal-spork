/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9g6.Entidades;

/**
 *
 * @author TOMI
 */
public class Entidades {
    private double numero1;
    private double numero2;
    
    public Entidades () {
        
    }
    
    public Entidades(double numero1,double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    @Override
    public String toString() {
        return "Entidades{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    
    
    
}
