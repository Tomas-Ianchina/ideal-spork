/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4xg6.Servicio;

import ejercicio4xg6.Entidades.Entidades;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {
    Scanner leer = new Scanner(System.in);
    Entidades m = new Entidades();
    
    
    
    public Entidades CrearDni(){
        int resto;
        System.out.println("Ingrese su numero de Dni");
        m.setDni(leer.nextInt());
        resto = (int) m.getDni()%23;
        Llenado(resto);
        return m;
    }
  
    
    
    
   
    public void MostrarNif(Entidades m){
        System.out.println("El dni es "+m.getDni()+"--"+m.getLetra());
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void Llenado(int resto) {
        int i;
        String[] letra;
        letra = new String[22];
        
        for(i = 0;i<21;i++) {
            switch(i) {
                case 0: letra[i] ="t";
                break;
                case 1: letra[i] ="r";
                break;
                case 2: letra[i] ="w";
                break;
                case 3: letra[i] ="a";
                break;
                case 4: letra[i] ="g";
                break;
                case 5: letra[i] ="m";
                break;
                case 6: letra[i] ="y";
                break;
                case 7: letra[i] ="f";
                break;
                case 8: letra[i] ="p";
                break;
                case 9: letra[i] ="d";
                break;
                case 10: letra[i] ="x";
                break;
                case 11: letra[i] ="b";
                break;
                case 12: letra[i] ="n";
                break;
                case 13: letra[i] ="j";
                break;
                case 14: letra[i] ="z";
                break;
                case 15: letra[i] ="s";
                break;
                case 16: letra[i] ="q";
                break;
                case 17: letra[i] ="h";
                break;
                case 18: letra[i] ="l";
                break;
                case 19: letra[i] ="c";
                break;
                case 20: letra[i] ="k";
                break;
                case 21: letra[i] ="e";
                break;
            }
            
        }
        m.setLetra(letra[resto]);
    }
    
    
    
}
