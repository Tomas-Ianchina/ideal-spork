/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2g9;

/**
 *
 * @author TOMI
 */
public class Juegadores {
  
    private String nombres;
    private String Id;
    private boolean mojado;

    public Juegadores() {
    }

    
    
    
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

   
    public void Disparo() {
        Arma m = new Arma();
        System.out.println("Recogiendo el arma");
        m.Mojar();
        m.SiguienteChorro();
    }
    
    
}
