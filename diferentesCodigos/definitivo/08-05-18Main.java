package com.DAW1;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;


class Main {
        Scanner teclado = new Scanner(System.in);

        public static void main(String[] args) {
                new App().start(args);
        }

        public static class App extends GraphicsProgram {
                public final void run() {
                        GImage tablero = new GImage("tablero.jpg");
                        ArrayList<Jugador> arrayjugadors = new ArrayList<Jugador>();
                        String[] caselles = new String[63];
                        int posicion = 0;
                        int[] turnos= new int[3];

                        Partida.llenar(caselles);
                        int[] separatint = new int[2];

                        System.out.println("Quants jugadors jugaran");
                        int numero_jugadors = 1;
                        add(tablero);
                        tablero.setSize((int) tablero.getWidth() - 200, (int) tablero.getHeight() - 200);
                        setSize((int) tablero.getWidth() + 20, (int) tablero.getHeight() + 70);


                        for (int i = 0; i < numero_jugadors; i++) {
                                arrayjugadors.add(new Jugador());
                                add(arrayjugadors.get(i).getFicha());
                                arrayjugadors.get(i).getFicha().setSize(40, 40);
                                arrayjugadors.get(i).getFicha().setLocation(336, tablero.getHeight() - arrayjugadors.get(i).getFicha().getHeight());
                                arrayjugadors.get(i).getFicha().move(36,-36);

                        }

                        Random random = new Random();


                        //while (posicion <= 63) {
                                int dado = random.nextInt(6) + 1;
                                dado=59;
                                System.out.println(dado);
                                for (int i = 0; i <dado ; i++) {
                                        strintotint(separatint, caselles, posicion);
                                        arrayjugadors.get(0).getFicha().move(separatint[0], separatint[1]);
                                        arrayjugadors.get(0).getFicha().pause(250);
                                        posicion++;
                                }

                                if (Partida.casillaconefecto(posicion)) {
                                        switch (posicion) {
                                                case 5:
                                                        arrayjugadors.get(0).getFicha().move(5, -112*4);
                                                        posicion = 9;
                                                        System.out.println("De Oca en oca");
                                                        break;
                                                case 6:
                                                        arrayjugadors.get(0).getFicha().move(5, -112*6);
                                                        posicion = 12;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 9:
                                                        arrayjugadors.get(0).getFicha().move(-110*2, -112*3);
                                                        posicion = 14;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 12:
                                                        arrayjugadors.get(0).getFicha().move(0, 110*6);
                                                        posicion = 6;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 14:
                                                        arrayjugadors.get(0).getFicha().move(-110*4, 0);
                                                        posicion = 18;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 18:
                                                        arrayjugadors.get(0).getFicha().move(-110*2, 110*3);
                                                        posicion = 23;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 23:
                                                        arrayjugadors.get(0).getFicha().move(110, 110*3);
                                                        posicion = 27;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 26:
                                                        arrayjugadors.get(0).getFicha().move(110*5, -110);
                                                        posicion = 52;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 27:
                                                        arrayjugadors.get(0).getFicha().move(110*5, 0);
                                                        posicion = 32;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 32:
                                                        arrayjugadors.get(0).getFicha().move(-110*2, -110*5);
                                                        posicion = 41;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 41:
                                                        arrayjugadors.get(0).getFicha().move(-110*3, 110);
                                                        posicion = 45;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 42:
                                                        arrayjugadors.get(0).getFicha().move(110, 110*5);
                                                        posicion = 30;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 45:
                                                        arrayjugadors.get(0).getFicha().move(110*3, 110*2);
                                                        posicion = 50;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 50:
                                                        arrayjugadors.get(0).getFicha().move(110*3, -110);
                                                        posicion = 54;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 53:
                                                        arrayjugadors.get(0).getFicha().move(-110*6, -110*2);
                                                        posicion = 23;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 54:
                                                        arrayjugadors.get(0).getFicha().move(-110*2, -110*3);
                                                        posicion = 59;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 58:
                                                        arrayjugadors.get(0).getFicha().setLocation(336+36, (tablero.getHeight() - arrayjugadors.get(0).getFicha().getHeight()- 36));
                                                        posicion = 0;
                                                        System.out.println("De puente en puente");
                                                        break;
                                                case 59:
                                                        arrayjugadors.get(0).getFicha().move(110*1.5, 110*1.5);
                                                        posicion = 63;
                                                        System.out.println("De puente en puente");
                                                        break;




                                        }
                                }
                        //}

                }

                public static void strintotint(int[] separatint, String[] caselles, int posicion) {
                        String[] separat = caselles[posicion].split(";");
                        for (int j = 0; j < separatint.length; j++) {
                                separatint[j] = Integer.parseInt(separat[j]);
                        }
                }

        }
}

