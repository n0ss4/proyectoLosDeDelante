package com.DAW1;

import acm.graphics.GImage;
import java.util.Random;

/**
 * Jugadro es la persona que participa al joc
 */
public class Jugador {
    private GImage ficha;
    private int numero;
    private int posiciondondeesta=0;
    private int turnodeespera=0;
    /**
     * @param colorficha El Jugador tindra una color de ficha
     */
    public Jugador(String colorficha) {
        this.ficha = new GImage(colorficha);
    }
    /**
     * @return Retornarem la ficha
     */
    public GImage getFicha() {
        return ficha;
    }

    /**
     * Tirada sera el numero random
     */
    public void tirada() {
        Random dados = new Random();
        this.numero = dados.nextInt(6) +1;
    }
    /**
     * @return Retornem el Numero que ens dongui la tirada
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @return Tornem la poscio on estarem en el tablero
     */
    public int getPosiciondondeesta() {
        return posiciondondeesta;
    }

    /**
     * @param posiciondondeesta Actualitzem la poscio on estem al tablero
     */
    public void setPosiciondondeesta(int posiciondondeesta) {
        this.posiciondondeesta = posiciondondeesta;
    }

    /**
     * @return En cas que tinguem torns de espera els agafarem de aqui
     */
    public int getTurnodeespera() {
        return turnodeespera;
    }

    /**
     * @param turnodeespera Actualitzarem els torns de espera
     */
    public void setTurnodeespera(int turnodeespera) {
        this.turnodeespera = turnodeespera;
    }


}
