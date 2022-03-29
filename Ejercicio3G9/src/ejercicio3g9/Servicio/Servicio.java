/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3g9.Servicio;

import ejercicio3g9.Baraja.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author TOMI
 */
public class Servicio {

    ArrayList<Carta> Baraja = new ArrayList();
    ArrayList<Carta> Jugador = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void CrearBaraja() {

        for (int i = 0; i < 4; i++) {

            for (int j = 1; j < 13; j++) {
                if (j == 8 || j == 9) {

                } else {
                    Carta m = new Carta();
                    switch (i) {
                        case 0:
                            m.setPalo("Espadas");
                            m.setNro(j);
                            Baraja.add(m);
                            break;
                        case 1:
                            m.setPalo("Basto");
                            m.setNro(j);
                            Baraja.add(m);
                            break;
                        case 2:
                            m.setPalo("Copas");
                            m.setNro(j);
                            Baraja.add(m);
                            break;
                        case 3:
                            m.setPalo("Oro");
                            m.setNro(j);
                            Baraja.add(m);
                            break;
                    }

                }
            }
        }
    }

    public void Mostrar() {
        System.out.println("Las cartas que quedan son");
        for (Carta aux : Baraja) {
            System.out.println(aux.toString());
        }
    }

    public void Barajar() {
        Collections.shuffle(Baraja);
    }

    public void SiguienteCarta() {
        if (Baraja.size() == 0) {
            System.out.println("No hay cartas disponibles en la baraja");
        } else {
            for (int i = 0; i < Baraja.size(); i++) {
                System.out.println("///////////////");
                System.out.println(Baraja.get(i).toString());
                System.out.println("///////////////");
                Jugador.add(Baraja.get(i));
                Baraja.remove(i);
                break;
            }
        }

    }

    public void Disponible() {
        System.out.println(Baraja.size() + " Son las cartas disponibles");
    }
//    

    public void DarCartas() {

        System.out.println("Cuantas cartas desea entregar?");

        int c = 0;
        int rta = leer.nextInt();
        if (rta > Baraja.size()) {
            System.out.println("Quedan solo " + Baraja.size() + " Cartas");
        }

        System.out.println("Las cartas entregadas son");
        Iterator<Carta> it = Baraja.iterator();
        while (it.hasNext()) {
            if (c < rta) {
                System.out.println(Baraja.get(0).toString());
                Jugador.add(Baraja.get(0));
                Baraja.remove(0);
                c++;

            } else {
                break;
            }

        }

    }

    public void MostrarMonton() {
        System.out.println("Las cartas del jugador son");
        if (Jugador.size() == 0) {
            System.out.println("El jugador no tiene cartas");
        } else {
            for (Carta aux : Jugador) {
                System.out.println(aux.toString());
            }
            System.out.println("/////////////////////");
        }

    }

    public void Menu() {
        String rta2 = "no";
        int opcion;
         do {
        System.out.println(" Indique la opcion a ejecutas");
        System.out.println("1.Mezclar");
        System.out.println("2.Dar Primera carta");
        System.out.println("3.Cartas disponibles");
        System.out.println("4.Pedir Cartas");
        System.out.println("5.Cartas en mano");
        System.out.println("6.Mostrar Baraja");
        System.out.println("7.Salir");
        opcion = leer.nextInt();
        
        
        
        switch(opcion) {
            case 1:
                 Barajar();
                 break;
            case 2:
                SiguienteCarta();
                 break;
            case 3:
                Disponible();
                 break;
            case 4:
                DarCartas();
                 break;
            case 5:
              MostrarMonton();
               break;
            case 6:
                Mostrar();
                 break;
            case 7:
                System.out.println("Seguro que desea salir?");
                rta2 = leer.next();
                break;
        }
         } while(!rta2.equalsIgnoreCase("Si"));
       

    }

}
