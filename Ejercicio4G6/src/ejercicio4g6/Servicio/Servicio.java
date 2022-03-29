/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4g6.Servicio;

import ejercicio4g6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades(0, 0);
    
    
    public Entidades CrearRectangulo() {
        System.out.println("Ingrese el valor de la altura ");
        m.setAltura(leer.nextInt());
        System.out.println("Ingrese el valor del largo");
        m.setLargo(leer.nextInt());
        
        return m;
    }
    
    
    public void CrearPerimetro(Entidades m) {
       int perimetro = 0;
       perimetro = (m.getAltura(perimetro) * 2) + (m.getLargo(perimetro)*2);
        System.out.println("El perimetro del rectangulo es "+ perimetro);
        
        
    }
    
    public void CrearArea(Entidades m) {
        int area = 0;
        area = m.getAltura(area) * m.getLargo(area);
        System.out.println("El area del rectangulo es "+ area);
    }
    
    
    
    public void DibujarRectangulo(Entidades m) {
        String s =  "*";
        
        for(int i= 0;i<=m.getAltura(i);i++) {
            for(int j = 1;j <=m.getLargo(j);j++ ) {
                 if ((i==0 || i<m.getAltura(i) ) || ((j== 2 ) && (j == m.getLargo(j)) ) ) {
                    System.out.print(s);
                } else {
                    System.out.print(" ");
                }
            }
               
                
                System.out.println("");
                
                
                
                
                
        }
        
        
    }
    
    
}
