/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5xg6.Entidades;

/**
 *
 * @author TOMI
 */
public class Entidades {
    private int Nm;
    private int mesScT;
    
    
    
    public Entidades() {
        
    }
    public Entidades(int Nm,int mesScT) {
        this.Nm = Nm;
        this.mesScT = mesScT;
    }

    public int getNm() {
        return Nm;
    }

    public void setNm(int Nm) {
        this.Nm = Nm;
    }

    public int getMesScT() {
        return mesScT;
    }

    public void setMesScT(int mesScT) {
        this.mesScT = mesScT;
    }
    
    
    
}
