/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20jv;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,n2,n3,n4,n5,i,j,k;
        n = 0;
        n2 = 0;
        n3 = 0;
        n4 = 0;
        n5 = 0;
        System.out.println("Ingrese el tamaño del arreglo");
        k = leer.nextInt();
        
        
        int[] numeros;
        numeros = new int[k];
        
        for(i = 0; i < k;i++ ) {
            
            numeros[i] = leer.nextInt();
            
            
            
     
        }
        
        for(int var:numeros) {
            
            if (var < 10) {
                n++;
            } else if (var < 100) {
                n2++;
            } else if (var < 1000) {
               n3++;
            } else if (var < 10000) {
               n4++;
            } else if (var < 100000) {
                n5++;
            }
            
            
            
            
            
            
            
        }
        
        System.out.println(n + "Es la cantidad de numero de 1 digito");
        System.out.println(n2 + "Es la cantidad de numero de 2 digito");
        System.out.println(n3 + "Es la cantidad de numero de 3 digito"); 
        System.out.println(n4 + "Es la cantidad de numero de 4 digito");
        System.out.println(n5 + "Es la cantidad de numero de 5 digito");
        
        
    }
    
}
