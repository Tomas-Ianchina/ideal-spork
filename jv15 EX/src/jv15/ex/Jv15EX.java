/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv15.ex;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv15EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double i,n,resultado;
        int num;
        boolean c;
        c = true;
        
    
       
        
        System.out.println("Hola");
        System.out.println("Ingresa los numeros");
         i = leer.nextDouble();
         n = leer.nextDouble();
       
       
       do {
           
            System.out.println("Que desea hacer?");
            System.out.println("1.Sumarlos");
            System.out.println("2.Restarlos");
            System.out.println("3.Multiplicarlos");
            System.out.println("4.Dividirlos");
             System.out.println("5.Salir");
           System.out.println("Que desea hacer");
           num = leer.nextInt();
           
           
           switch (num) {
               case 1:
              resultado =  suma(i,n);
                   System.out.println(resultado);
                   break;
               case 2:
              resultado = resta(i,n);   
              System.out.println(resultado);
                   break;
               case 3:
              resultado = multiplicacion(i,n);   
              System.out.println(resultado);
                   break;
               case 4:
               resultado = division(i,n);   
               System.out.println(resultado);
                   break;
               case 5:
                   System.out.println("seguro que quiere salir?");
                   System.out.println("1.Si /2.No");
                   num = leer.nextInt();
                   if (num == 1) {
                       num = 5;
                       
                   } else {
                       num = 0;
                   }
                   
                   
                   
           }
                   
   
           
       }while( num !=5);
       
    }
    
    
    
    
    
   public static double suma (double i ,double  n){
       double resul;
       
        resul = i + n;
        
        
        
        return resul;
    }
    
    
    public static double resta (double i ,double  n){
       double resul;
       
        resul = i - n;
        
        
        
        return resul;
    }
    
    
    
    public static double multiplicacion (double i ,double  n){
       double resul;
       
        resul = i *n;
        
        
        
        return resul;
    }
    
    
    
    
    public static double division (double i ,double  n){
       double resul;
       
        resul = i / n;
        
        
        
        return resul;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
