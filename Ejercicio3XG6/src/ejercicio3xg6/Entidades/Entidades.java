/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3xg6.Entidades;

/**
 *
 * @author TOMI
 */
public class Entidades {
    private double a;
    private double b;
    private double c;
    private double discri;
    private boolean Tienes;
    private boolean Tie;
    public Entidades(){
        
    }
    
    public Entidades(double a,double b, double c,double discri,boolean Tienes,boolean Tie) {
        this.a=a;
        this.b=b;
        this.c=c;
        this.discri=discri;
        this.Tienes=Tienes;
        this.Tie=Tie;
    }
    
    
    
    public void setA(double a) {
        this.a=a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscri() {
        return discri;
    }

    public void setDiscri(double discri) {
        this.discri = discri;
    }

    public boolean getTienes() {
        return Tienes;
    }

    public void setTienes(boolean Tienes) {
        this.Tienes = Tienes;
    }

    public boolean getTie() {
        return Tie;
    }

    public void setTie(boolean Tie) {
        this.Tie = Tie;
    }
    
    
    
}
