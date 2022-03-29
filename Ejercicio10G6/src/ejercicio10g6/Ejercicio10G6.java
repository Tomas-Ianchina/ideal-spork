/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10g6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio10G6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double[] Numeros;
       double[] num;
       Numeros = new double[50];
       num = new double[20];
       int i;
       int k;
       
       for( i = 0;i<49;i++) {
           Numeros[i] = Math.random()*10;
       }
        System.out.println(Arrays.toString(Numeros));
        Arrays.sort(Numeros);
        System.out.println(Arrays.toString(Numeros));
        for(i = 0;i<9;i++) {
          num[i] = Numeros[i];
        }
        i = 10;
            for( k = 0;k<49;k++) {
                if((Numeros[k]>1 && Numeros[k]<2 )|| (Numeros[k]>2 && Numeros[k]<3 )|| (Numeros[k]>3 && Numeros[k]<4 )|| (Numeros[k]>4 && Numeros[k]<5 )|| (Numeros[k]>5 && Numeros[k]<6 )||(Numeros[k]>6 && Numeros[k]<7 )||(Numeros[k]>7 && Numeros[k]<8 )){
                    num[i] = Numeros[k];
                    i++;
                    if(i == 19) {
                       break;
                    }
                    
                }
            }
        System.out.println("Ultimo array");
            System.out.println(Arrays.toString(num));
    }
       
    }
    
    

