/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5g6.Service;

import ejercicio5g6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner (System.in);
    Entidades m = new Entidades(0, 0, 0);
    
    public Entidades IniciarSesion() {
        System.out.println("Ingrese su Dni");
        m.setDni(leer.nextInt());
        System.out.println("Ingrese su numero de cuenta");
        m.setNumeroDeCuenta(leer.nextInt());
        m.setSaldo(0);
        
        return m;
    }
    
    public void IngresarD(Entidades m) {
        System.out.println("Indique cuanto dinero desea ingresar");
        double suma = leer.nextDouble();
        double i = m.getSaldo();
        double ingreso = suma + i;
        m.setSaldo(ingreso);
       
        
        
        
    }
    
    public void RetirarD(Entidades m) {
        System.out.println("Indique cuanto dinero quiere retirar");
        double resta = leer.nextDouble();
        double i = m.getSaldo();
        if(m.getSaldo()< resta ) {
            System.out.println("La cantidad es insuficiente ");
            System.out.println("Se extrajo "+m.getSaldo());
            m.setSaldo(0);
        } else {
            double retirar = i - resta;
            m.setSaldo(retirar);
        }
        
      
        
    }
    
    public void RetirarRa(Entidades m) {
        System.out.println("Usted desea la extraccion rapida");
        double resta  = m.getSaldo()*0.2;
        double i = m.getSaldo();
        System.out.println("Ingrese la cantidade que desea retirar");
        double extra = leer.nextDouble();
        if( extra > resta  ) {
            System.out.println("Usted mas de lo que puede egresar de este metodo ");
            m.setSaldo(i);
        } else {
            System.out.println("Extracto de forma exitosa");
            m.setSaldo(i - extra);
        }
        
        
        
    }
    
   public void ConsultarSaldo(Entidades m) {
       System.out.println("Su saldo es "+m.getSaldo());
   }
   public void ConsultarDatos(Entidades m) {
       System.out.println("Sus Dni es "+m.getDni());
       System.out.println("Su Numero de cuenta es "+m.getNumeroDeCuenta());
   }
  
}
