package com.DAW1;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;


class Main {
        public static void main(String[] args) {
                new App().start(args);

        }

        public static class App extends GraphicsProgram {
                public final void run() {
                        GImage imagen = new GImage("tablero.jpg");
                        Random aleatorio = new Random();

                        add(imagen);
                        setSize(800, 833);
                        GImage azul = new GImage("a.png");
                        add(azul);
                        azul.setSize(50, 50);
                        azul.setLocation(10, 690);
                        GImage roja = new GImage("r.png");
                        add(roja);
                        roja.setSize(45, 45);
                        roja.setLocation(70, 690);
                        GImage verde = new GImage("v.png");
                        add(verde);
                        verde.setSize(45, 45);
                        verde.setLocation(140, 690);
                        int[] ocah = new int[50];
                        int[] ocav = new int[50];
                        int[] CasillaOca = new int[]{5, 9, 14, 18, 23, 27, 32, 36, 41, 45, 50, 54, 59, 63}; //Todas las Casillas que tienen una oca
                        int posicion = 0;
                        int tirada = 0;
                        int suma = 0;
                        ocah[0] = 440;ocav[0] = 0;
                        ocah[1] = 250;ocav[1] = -30;
                        ocah[2] = 0;ocav[2] = -330;
                        ocah[3] = 0;ocav[3] = -250;
                        ocah[4] = -310;ocav[4] = -45;
                        ocah[5] = -250;ocav[5] = 0;
                        ocah[6] = -130;ocav[6] = 240;
                        ocah[7] = 0;ocav[7] = 280;
                        ocah[8] = 320;ocav[8] = 40;
                        ocah[9] = 270;ocav[9] = -50;
                        ocah[10] = 0;ocav[10] = -380;
                        ocah[11] = -280;ocav[11] = -30;
                        ocah[12] = -200;ocav[12] = 210;
                        ocah[13] = 200;ocav[13] = 0;

                        for (int i = 0; i <ocah.length ; i++) {
                                azul.pause(500);
                                azul.move(ocah[i],ocav[i]);
                        }
                       
                }


                }
        }



