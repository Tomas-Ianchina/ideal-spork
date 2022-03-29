/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.ex.jv;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class EXJv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int monto,desc,cuota,total;
        String clase;
        
        System.out.println("Ingrese la clase de socio");
        clase = leer.next();
        
        
        switch (clase) {
            case "a":
                cuota = 1500;
                System.out.println("Ingrese el monto de la operacion");
                monto = leer.nextInt();
                desc = (monto*50)/100;
                total = monto - desc;
                System.out.println("El valor de la cuota es "+cuota+" y el total es "+total);
                break;
            case "b":
                cuota = 1000;
                System.out.println("Ingrese el monto de la operacion");
                monto = leer.nextInt();
                desc = (monto*35)/100;
                total = monto - desc;
                System.out.println("El valor de la cuota es "+cuota+" y el total es "+total);
                break;
            case "c":
                cuota = 600;
                System.out.println("Ingrese el monto de la operacion");
                monto = leer.nextInt();
                desc = 0;
                total = monto - desc;
                System.out.println("El valor de la cuota es "+cuota+" y el total es "+total);
                break;
                
            
            
            
            
            
            
        }
        
        
        
        
    }
    
}
