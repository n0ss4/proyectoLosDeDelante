package com.DAW1;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;


class Main {
        public static void main(String[] args) {
                new App().start(args);

        }

        public static class App extends GraphicsProgram {
                public final void run() {
                        Scanner teclado = new Scanner(System.in);
                        GImage tablero = new GImage("t.png");
                        ArrayList<Jugador> arrayjugadors = new ArrayList<Jugador>();
                        String[] caselles = new String[63];

                        System.out.println("Quants jugadors jugaran");
                        int numero_jugadors = 1;
                        add(tablero);
                        tablero.setSize((int) tablero.getWidth()-200, (int) tablero.getHeight()-200 );
                        Partida.llenar(caselles);
                        System.out.println(caselles[2]);
                        setSize((int) tablero.getWidth()+20, (int) tablero.getHeight()+70 );


                        for (int i = 0; i < numero_jugadors; i++) {

                                arrayjugadors.add(new Jugador());
                                add(arrayjugadors.get(i).getFicha());
                                arrayjugadors.get(i).getFicha().setSize(40,40);
                                arrayjugadors.get(i).getFicha().setLocation(336,tablero.getHeight()-arrayjugadors.get(i).getFicha().getHeight());
                        }
                        boolean llegar=false;
                        /*for (int i = 0; i <2 ; i++) {
                                String[] separat= caselles[i].split(";");
                                int [] separatint=new int[2];
                                for (int j = 0; j <separat.length ; j++) {
                                        separatint[j]=Integer.parseInt(separat[j]);
                                }
                                arrayjugadors.get(0).getFicha().move(separatint[i],separatint[i]);
                                arrayjugadors.get(0).getFicha().pause(1000);
                        }*/






                }


        }
}


