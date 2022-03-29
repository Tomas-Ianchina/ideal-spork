/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jv12;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Jv12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int i,n,j;
       
       for(i = 0;i <=9;i++){
           for(j = 0;j <=9;j++){
               for(n = 0;n <=9;n++) {
                   if (i == 3 && j == 3 && n == 3) {
                       System.out.println("e-e-e");
                   } else if (i == 3 && j == 3 ) {
                       System.out.println("e-e-"+n);
                   } else if (i == 3 && n == 3){
                       System.out.println("e-"+j+"-e");
                   } else if(i == 3) {
                       System.out.println("e-"+j+"-"+n);
                   } else if(j == 3 && n == 3 ){
                       System.out.println(i+"-e-e");
                   } else if (j == 3 ) {
                       System.out.println(i+"-e-"+n);
                   } else if (n == 3 ) {
                       System.out.println(i+"-"+j+"-e");
                   } else {
                       System.out.println(i+"-"+j+"-"+n);
                   }
                   
                   
                   
                   
                   
                   
                   
               }
           }
       }
       
       
     
    }
    
}
