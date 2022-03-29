/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7ex.jv;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double i,n,m,mi,p,num,s;
        System.out.println("Ingrese la cantdad de numeros");
        n = leer.nextDouble();
        i = 0;
        m = 0;
        mi = 0;
        s = 0;
                
        
        while(i <n) {
            System.out.println("Ingrese el numero ");
            num = leer.nextDouble();
            if (i == 0 ) {
                m = num;
                mi = num;
            } else if(num > m ) {
                m = num;
                
            } else if(num <mi){
                mi = num;
            }
             s = s + num;
            
            i++;
                
                
                
            
            
            
            
            
        }
        
        p = s / n;
        System.out.println("El numero mayor es "+m);
        System.out.println("El numero menor es "+mi);
        System.out.println("El promedio es "+p);
        
        
    }
    
}
