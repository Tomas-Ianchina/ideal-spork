/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String numero;
       int n;
        System.out.println("Ingrese el numero");
        n = leer.nextInt();
       numero ="";
       
       switch(n) {
           case 1 :
               numero = "I";
               break;
           case 2 :
               numero = "II";
               break;   
           case 3 :
               numero = "III";
               break;
          case 4 :
               numero = "IV";
               break;       
           case 5 :
               numero = "V";
               break;
             case 6 :
               numero = "VI";
               break;
                case 7 :
               numero = "VII";
               break;
                case 8 :
               numero = "VIII";
               break;
                case 9 :
               numero = "IX";
               break;
            case 10 :
               numero = "X";
               break;
           
       }
       
       
        System.out.println("Se transformo el numero "+n+" al numero romano   "+numero);
       
       
       
       
       
       
    }
    
}
