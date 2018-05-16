package com.DAW1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;


class Main {
        public static void main(String[] args) {
                new App().start(args);
        }
        public static class App extends GraphicsProgram {
                GImage klk;
                public void run() {
                        Partida partida = new Partida();
                        int[] aquinletoca = {0};
                        boolean[] llegar = {false};
                        /**
                         * Afegim el tablero
                         */
                        GImage tablero = new GImage("tablero.jpg");
                        add(tablero);
                        tablero.setSize((int) tablero.getWidth() - 200, (int) tablero.getHeight() - 200);
                        setSize((int) tablero.getWidth() + 750, (int) tablero.getHeight() + 70);
                        /**
                         * Arraylist de jugadors
                         */
                        ArrayList<Jugador> arrayjugadors = new ArrayList<Jugador>();
                        int numero_jugadors = 2;
                        for (int i = 0; i < numero_jugadors; i++) {
                                switch (i) {
                                        case 0:
                                                arrayjugadors.add(new Jugador("r.png"));//roja
                                                break;
                                        case 1:
                                                arrayjugadors.add(new Jugador("a.png"));//amarilla
                                                break;
                                        case 2:
                                                arrayjugadors.add(new Jugador("v.png"));//verde
                                                break;
                                }
                                add(arrayjugadors.get(i).getFicha());
                                arrayjugadors.get(i).getFicha().setSize(40, 40);
                                arrayjugadors.get(i).getFicha().setLocation(336, tablero.getHeight() - arrayjugadors.get(i).getFicha().getHeight());
                                arrayjugadors.get(i).getFicha().move(36, -36);

                        }


                        /**
                         * Booto daus
                         */
                        GImage go = new GImage("go.gif");
                        add(go, 1050, 20);
                        go.setSize(100, 100);
                        klk=new GImage("torn1.png");//rojo
                        add(klk);
                        klk.setSize(150*2,100*2);
                        klk.setLocation(getWidth()-300,20);
                        GImage hand = new GImage("hand.png");
                        add(hand, 1150, 50);
                        hand.setSize(300, 100);
                        /**
                         * Clic
                         */

                        go.addMouseListener(new MouseAdapter() {
                                @Override
                                public void mouseClicked(MouseEvent e) {
                                        tirajugadro(aquinletoca);
                                        int posicion = partida.partida(arrayjugadors, llegar, tablero, numero_jugadors, aquinletoca);
                                        afegirimatge(posicion);
                                        quiengana(llegar,aquinletoca);

                                }
                        });

                }
                /**
                 * @param po a la poscio que estigui li ficarem una imatge
                 */
                public void afegirimatge(int po) {
                        klk=new GImage("BLANCO.jpg");
                        add(klk);
                        klk.setSize(150*3,120*3);
                        klk.setLocation(getWidth()-600,300);
                        switch (po) {
                                case 1:klk=new GImage("deocaenoca.png");
                                        add(klk);
                                        klk.setSize(150*3,120*3);
                                        klk.setLocation(getWidth()-600,300);
                                        System.out.println("de oca en oca");
                                        break;
                                case 2:klk=new GImage("pp.png");
                                        add(klk);
                                        klk.setSize(150*3,120*3);
                                        klk.setLocation(getWidth()-600,300);
                                        System.out.println("de puente en puente");
                                        break;
                                case 3:klk=new GImage("bar.png");
                                        add(klk);
                                        klk.setSize(150*3,120*3);
                                        klk.setLocation(getWidth()-600,300);
                                        break;
                                case 4:klk=new GImage("dados26.png");
                                        add(klk);
                                        klk.setSize(150*3,120*3);
                                        klk.setLocation(getWidth()-600,300);
                                        break;
                                case 5:klk=new GImage("lab.png");
                                        add(klk);
                                        klk.setSize(150*3,120*3);
                                        klk.setLocation(getWidth()-600,300);
                                        break;
                                case 6:klk=new GImage("carcel.png");
                                        add(klk);
                                        klk.setSize(150*3,120*3);
                                        klk.setLocation(getWidth()-600,300);
                                        break;
                                case 7:klk=new GImage("cal.png");
                                        add(klk);
                                        klk.setSize(150*3,120*3);
                                        klk.setLocation(getWidth()-600,300);
                                        break;
                                case 8:klk=new GImage("poz.png");
                                        add(klk);
                                        klk.setSize(150*3,120*3);
                                        klk.setLocation(getWidth()-600,300);
                                        break;
                                case 9:klk=new GImage("dados.png");
                                        add(klk);
                                        klk.setSize(150*3,120*3);
                                        klk.setLocation(getWidth()-600,300);
                                        break;
                        }
                }

                /**
                 * @param aquinletoca comprobem a qui li toca i li afegim la imatge
                 */
                public void tirajugadro(int[] aquinletoca){
                        klk=new GImage("BLANCO.jpg");
                        add(klk);
                        klk.setSize(150*2,100*2);
                        klk.setLocation(getWidth()-300,20);
                        if (aquinletoca[0]==0){
                                klk=new GImage("torn2.png");
                                add(klk);
                                klk.setSize(150*2,100*2);
                                klk.setLocation(getWidth()-300,20);
                        }else if (aquinletoca[0]==1){
                                klk=new GImage("torn1.png");
                                add(klk);
                                klk.setSize(150*2,100*2);
                                klk.setLocation(getWidth()-300,20);
                        }/*else {
                                klk=new GImage("torn1.png");
                                add(klk);
                                klk.setSize(150*2,100*2);
                                klk.setLocation(getWidth()-300,20);
                        }*/
                }

                /**
                 * @param llegar aqui comporbem si algu a arribat
                 * @param aquinletoca i el jugador que ha arribat
                 */
                public void quiengana(boolean[] llegar,int[] aquinletoca){

                        if (aquinletoca[0]==0 && llegar[0]){
                                klk=new GImage("gana1.gif");
                                add(klk);
                                klk.setSize(700,500);
                                klk.setLocation((getWidth()-klk.getWidth())/2,200);
                        }else if (aquinletoca[0]==1 && llegar[0]){
                                klk=new GImage("gana2.gif");
                                add(klk);
                                klk.setSize(700,500);
                                klk.setLocation((getWidth()-klk.getWidth())/2,200);
                        }
                }
                }


}

