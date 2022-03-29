/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4g6.Entidades;

/**
 *
 * @author TOMI
 */
public class Entidades {
    
    private int altura;
    private int largo;
    
    public Entidades() {
        
    }
    
    public Entidades (int altura, int largo) {
        this.altura = altura;
        this.largo = largo;
        
        
        
    }
    
    
    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    
    public int getAltura(int altura) {
        return this.altura;
    }
    
    public int getLargo(int largo) {
        return this.largo;
    }
    
    
    
    
    
}
