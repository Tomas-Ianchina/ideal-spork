/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6g6.Entidades;

/**
 *
 * @author TOMI
 */
public class Entidades {
    private int CantidadMax;
    private int CantidadActual;
    
    
    public Entidades() {
        
    }
    
    public Entidades(int CantidadMax, int CantidadActual) {
        this.CantidadMax = CantidadMax;
        this.CantidadActual = CantidadActual;
        
        
    }
    
    public void setCantidadMax(int CantidadMax){
        this.CantidadMax= CantidadMax;
        
    }
    
    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }
    
    public int getCantidadMax(int CantidadMax) {
        return this.CantidadMax;
    }
    
    public int getCantidadActual(int CantidadActual) {
        return this.CantidadActual;
    }
}
