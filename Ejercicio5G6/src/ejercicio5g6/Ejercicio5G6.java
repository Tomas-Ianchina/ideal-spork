/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5g6;

import ejercicio5g6.Entidades.Entidades;
import ejercicio5g6.Service.Servicio;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio5G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Servicio v = new Servicio();
        Entidades m = v.IniciarSesion();
        int i;
        String rta = "Si";
        do {
            System.out.println("Bienvenido Ingrese lo que desea Hacer");
            System.out.println("1.Ingresar Dinero");
            System.out.println("2.Egresar Dinero");
            System.out.println("3.Egreso Rapido");
            System.out.println("4.Conocer Saldo");
            System.out.println("5.Conocer Datos");
            System.out.println("6.Salir");
            i = leer.nextInt();
            
            switch(i) {
                case 1:
                    v.IngresarD(m);
                    break;
                case 2: 
                    v.RetirarD(m);
                    break;
                case 3:
                    v.RetirarRa(m);
                    break;
                case 4:
                    v.ConsultarSaldo(m);
                    break;
                case 5:
                    v.ConsultarDatos(m);
                    break;
                case 6:
                    System.out.println("Saliendo de su cuenta");
            }
            
            
            
        } while(i != 6);
        
        
        
        
       
    }
    
}
