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
public class Arma {
    private Integer posiAC;
    private Integer posiAG;

    public Arma() {
    }
    

    public Integer getPosiAC() {
        return posiAC;
    }

    public void setPosiAC(Integer posiAC) {
        this.posiAC = posiAC;
    }

    public Integer getPosiAG() {
        return posiAG;
    }

    public void setPosiAG(Integer posiAG) {
        this.posiAG = posiAG;
    }
    
    
    public void CargarArma () {
        Arma m = new Arma();
        System.out.println("Cargando....");
        m.setPosiAG((int) Math.random()*6);
        m.setPosiAC(0);
    }
    
    public void SiguienteChorro () {
        Arma m = new Arma();
        System.out.println("girando el tambor");
        m.setPosiAC(m.getPosiAC() + 1);
        if(m.getPosiAC() > 5) {
            m.setPosiAC(0);
        }
    }
    
    public void Mojar () {
        Arma m = new Arma();
        Juegadores j = new Juegadores();
        if(m.getPosiAC() == m.getPosiAG()) {
            System.out.println("Disparando");
            System.out.println("Mojado");
            j.setMojado(true);
        } else {
            System.out.println("Disparando");
            System.out.println("No ha pasado nada");
            j.setMojado(false);
        }
    }

    @Override
    public String toString() {
        return "Arma{" + "posiAC=" + posiAC + ", posiAG=" + posiAG + '}';
    }
    
}
