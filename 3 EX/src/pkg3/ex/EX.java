/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3.ex;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String letra;
        System.out.println("Ingese la letra");
        letra = leer.next();
       
       
        switch(letra) {
            case "a": 
                System.out.println("Es la vocal A");
                break;
            case "e":
                System.out.println("Es la vocal E");
                break;
            case "i":
                System.out.println("Es la vocal I");
                break;
             case "o":
                System.out.println("Es la vocal O");
                break;
            case "u":
                System.out.println("Es la vocal U");
                break;
           
        }
        
        if(letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("Es una vocal efectivamente");
        } else {
            System.out.println(" No es una vocal");
        }
        
    }
    
}
