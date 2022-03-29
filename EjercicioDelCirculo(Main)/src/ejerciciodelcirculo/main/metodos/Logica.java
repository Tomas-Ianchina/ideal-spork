/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodelcirculo.main.metodos;

import ejerciciodelcirculo.main.EntidadesElementos.EntidadesCircunferencia;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Logica {
    Scanner leer = new Scanner(System.in);
        EntidadesCircunferencia m  = new EntidadesCircunferencia(0);
    public  EntidadesCircunferencia CrearCircunferencia() {
       
        
        System.out.println("Ingrese el valor del radio");
        m.setRadio(leer.nextDouble());
        
        
        
        
        
        
        
        
        return m;
    }
   
    public void  CrearArea(EntidadesCircunferencia m) {
        System.out.println("Ahora se creara el area ");
        double area = 0 ;
        double pi  = 3.14;
       area = (m.getRadio(area) * m.getRadio(area) *pi) ;
       
        System.out.println("El area es "+ area );
       
       
        
    
        
        
    }
    public void CrearDiametro(EntidadesCircunferencia m) {
        System.out.println("Ahora debemos hacer el diametro");
        double diametro = 0;
        double pi = 3.14;
        
        diametro =(m.getRadio(diametro)*pi*2);
        System.out.println("El diametro es "+ diametro);
        
    }
    
    
}
