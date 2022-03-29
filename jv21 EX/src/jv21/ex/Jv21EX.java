/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv21.ex;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv21EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int i,j;
        double[][] notas;
        String [] nombres;
        double sumatoria;
        sumatoria = 0;
       
        String palabras;
       
        notas = new double[10][5];
        nombres = new String[10];
        
        llenado(nombres);
        
        for(i = 0;i < 10; i++) {
            for(j = 0; j < 4; j++) {
                
                switch (j) {
                   case 1:
                        palabras = "Trabajo practico 1";
                        System.out.println("Ingrese la nota del "+palabras+"del alumno "+nombres[i]);
                 notas[i][j] = leer.nextDouble();
                 sumatoria = ((notas[i][j]*15)/100) + sumatoria;
                       break;
                   case 2:
                        palabras= "Trabajo practico 2";
                        System.out.println("Ingrese la nota del "+palabras+"del alumno "+nombres[i]);
                 notas[i][j] = leer.nextDouble();
                 sumatoria = ((notas[i][j]*10)/100) + sumatoria;
                       break;
                   case 3:
                        palabras = "Examen";
                        System.out.println("Ingrese la nota del "+palabras+"del alumno "+nombres[i]);
                 notas[i][j] = leer.nextDouble();
                 sumatoria = ((notas[i][j]*25)/100) + sumatoria;
                       break;
                   case 4:
                        palabras = "Integrador";
                        System.out.println("Ingrese la nota del "+palabras+"del alumno "+nombres[i]);
                 notas[i][j] = leer.nextDouble();
                 sumatoria = ((notas[i][j]*50)/100) + sumatoria;
                       break;
                }
                 
                
            }
            notas [i][4] = sumatoria;
            if (sumatoria >= 7 ) {
                System.out.println(nombres[i]+" Aprobo");
            } else {
                System.out.println(nombres[i]+" Desaprobo");
            }
                        
            
            
            
            
            
        }
        
        
    }
    
    public static void llenado(String []nombres) {
        Scanner leer = new Scanner(System.in);
        int i;
       for(i=0;i<9;i++) {
           System.out.println("Ingrese el nombre del alumno"+i);
         nombres[i] = leer.nextLine();
        
         }
       
    }
    
}
