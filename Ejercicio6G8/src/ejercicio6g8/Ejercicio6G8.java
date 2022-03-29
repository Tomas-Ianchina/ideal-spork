/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6g8;

import ejercicio6g8.Entidades.Entidades;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Ejercicio6G8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String,Double> inventario = new HashMap();
        String rta1 = "",rta2 = "no";
       
        System.out.println("Indique que desea Hacer?");
        System.out.println("1.Agregar productos");
        System.out.println("2.Remover Productos");
        System.out.println("3.Ver Productos");
        System.out.println("4.Modificar precio");
        System.out.println("5.Salir");
        
        
        do {
            System.out.println("Indique que desea hacer");
            rta1 = leer.next();
             Entidades m = new Entidades();
            switch(rta1) {
                case "1":
                    System.out.println("Indique el nombre del producto que desea agregar");
                    m.setProducto(leer.next());
                    System.out.println("Indique el procio del producto");
                    m.setPrecio(leer.nextDouble());
                    inventario.put(m.getProducto(),m.getPrecio());
                    break;
                case "2":
                    System.out.println("Indique el producto que desea eliminar");
                    String k = leer.next();
                    for (Map.Entry<String, Double> aux : inventario.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        if(k.equals(aux.getKey())) {
                            inventario.remove(aux.getKey());
                            System.out.println("Se elimino "+k);
                        } 
                    }
                    break;
                case "3":
                     for (Map.Entry<String, Double> aux : inventario.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                         System.out.println(aux.getKey() +" Con un precio de "+aux.getValue()+" Pesos");
                        } 
                     break;
                case "4":
                     System.out.println("Indique el producto que desea modificar el precio");
                     String l = leer.next();
                    for (Map.Entry<String, Double> aux : inventario.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        if(l.equals(aux.getKey())) {
                            System.out.println("Indique el precio del "+aux.getKey());
                            m.setPrecio(leer.nextDouble());
                            inventario.put(l,m.getPrecio());
                        } 
                    }
                     break;
                case "5": 
                    System.out.println("Seguro desea salir?");
                    rta2 = leer.next();        
                    break;   
                 
            }
          
        } while(rta2.equals("no"));
        
        
        
        
    }
    
    
    
    
    
    
}
