/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv16.ex;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv16Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] edades;
        String[] nombres;
        int n;
        
        System.out.println("Ingrese la cantidad de personas");
        n = leer.nextInt();
        
        edades = new int[n];
        nombres = new String[n];
        
        Llenado(nombres,edades,n);
       
        mostrado(nombres,edades,n);
        
        
        System.out.println("Buenas noches");

    }
    
    
    
    
    
    
    
    
    
    public static void Llenado( String[] nombres,int[] edades , int n) {
        int i;
         Scanner leer = new Scanner(System.in);
        for(i = 0;i < n;i++) {
            System.out.println("Ingrese el nombre de la persona");
            nombres[i] = leer.next();
            System.out.println("Ingrese la edad de "+nombres[i]);
            edades[i] = leer.nextInt();
        }
        
    } 
    
    
    
     
        public static void mostrado (String[] nombres,int[] edades , int n  ){
             int i;
             String rta,m;
         Scanner leer = new Scanner(System.in);
        for(i = 0;i < n;i++) {
            System.out.println("Desea ver el perfil de la siguiente persona ");
            rta = leer.next();
            if (edades[i] > 18 ){
                m = "Es Mayor de 18";
            } else {
                m = "Es menor de 18";
            }
            if (rta.equals("Si")) {
                System.out.println("Su nombre es "+nombres[i]);
                System.out.println("Tiene "+edades[i]+" años"+m);
        
                
                
            } else {
                break;
                
                
                
            }
        }
            
        }
    
    
    
    
    
    
    
    
    
    
    
    
}
