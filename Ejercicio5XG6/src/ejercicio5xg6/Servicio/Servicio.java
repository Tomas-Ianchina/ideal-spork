/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5xg6.Servicio;

import ejercicio5xg6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades();
  
    public Entidades CrearMes(){
        m.setMesScT((int) (Math.random()*12)-1);
        
        System.out.println(m.getMesScT());
        return m;
        
    }
    
    public void Adivinanza(Entidades m) {
        int i;
        String[] meses;
        meses = new String[12];
        
        for(i =0;i<11;i++) {
            switch(i) {
                case 0: meses[i]="Enero";
                break;
                case 1: meses[i]="Febrero";
                break;
                case 2: meses[i]="Marzo";
                break;
                case 3: meses[i]="Abril";
                break;
                case 4: meses[i]="Mayo";
                break;
                case 5: meses[i]="Junio";
                break;
                case 6: meses[i]="Julio";
                break;
                case 7: meses[i]="Agosto";
                break;
                case 8: meses[i]="Septiembre";
                break;
                case 9: meses[i]="Octubre";
                break;
                case 10: meses[i]="Noviembre";
                break;
                case 11: meses[i]="Diciembre";
                break;
            }
        }
        Juego(meses);
    }
    
    
    
    
    
    
    
    
    
    public void Juego(String meses[]){
        String rta;
        int i = m.getMesScT();
        String secret = meses[i];
        int c = 0;
        do {
            System.out.println("ingrese el nombre del mes");
            rta = leer.next();
            if (rta.equals(secret) ){
                System.out.println("Felicidades ");
                c++;
            } else {
                System.out.println("Incorrecto ");
                System.out.println("Intente nuevamente");
                
            }
        } while (c == 0);
        
        
        
    }
}
