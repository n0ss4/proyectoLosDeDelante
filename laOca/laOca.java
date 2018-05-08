package com.proyectoLosDeDelante;

//import java.util.Random;

import acm.graphics.GImage;
import acm.program.GraphicsProgram;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

    public static void main(String[] args) {
        new com.proyectoLosDeDelante.Main.HelloGraphics().start(args);
    }
    public static class HelloGraphics extends GraphicsProgram {
        public void run() {
            GImage rect = new GImage("..\\imagenes\\dados\\d1.jpg");
            add(rect);
            rect.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent arg0) {
                    // TODO Auto-generated method stub
                }
            });
        }
    }
}
