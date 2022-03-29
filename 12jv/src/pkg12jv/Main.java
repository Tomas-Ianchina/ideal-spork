/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12jv;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
   
       
       
       int n;
       do{
       System.out.println(" Ingrese la nota ");
       
       n = leer.nextInt();
       
       } while(n < 1 || n > 10  );
       System.out.println("La nota es " + n);
}
}

