package com.DAW1;

import acm.graphics.GImage;

import javax.swing.*;
import java.util.Random;

/**
 * Created by divad on 07/05/2018.
 */
public class Jugador {
    private GImage ficha;
    private int numero;

    public Jugador() {
        this.ficha = new GImage("a.png");
    }

    public GImage getFicha() {
        return ficha;
    }


    public void tirada() {
        Random dados = new Random();
        this.numero = dados.nextInt(6) + 1;
    }

    public int getNumero() {
        return numero;
    }
}
