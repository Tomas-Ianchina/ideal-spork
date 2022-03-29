/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5g6.Entidades;

/**
 *
 * @author TOMI
 */
public class Entidades {
    
    private int dni;
    private int NumeroDeCuenta;
    private double Saldo ;
    
    public Entidades() {
        
    }
    
    
    public Entidades(int dni,int NumeroDeCuenta,double Saldo) {
        this.dni = dni;
        this.NumeroDeCuenta = NumeroDeCuenta;
        this.Saldo = Saldo;
        
        
        
        
        
        
        
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNumeroDeCuenta(int NumeroDeCuenta) {
        this.NumeroDeCuenta = NumeroDeCuenta;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public int getDni() {
        return dni;
    }

    public int getNumeroDeCuenta() {
        return NumeroDeCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }
    
    
    
    
    
    
}
