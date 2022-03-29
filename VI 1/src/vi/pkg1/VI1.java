/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vi.pkg1;

import java.util.Scanner;
import vi.pkg1.libro.Caracter;

/**
 *
 * @author TOMI
 */
public class VI1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Caracter m1 = new Caracter();
        
        
        m1.Autor = leer.next();
        m1.Isbn = leer.next();
        m1.Titulo = leer.next();

        
        
        
        System.out.println(m1.Autor+" "+m1.Titulo);
    }
    
}
