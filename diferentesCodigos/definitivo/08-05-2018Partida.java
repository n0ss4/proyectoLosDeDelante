package com.DAW1;

import java.util.Random;

/**
 * Created by divad on 07/05/2018.
 */
public class Partida {//clase


    public static void llenar(String[] caselles) {
        int x = 0;
        int y = 0;
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            x = 112;
            y += 0;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 7; i++) {
            x = 0;
            y = -110;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 8; i++) {
            x = -112;
            y = 0;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 6; i++) {
            x = 0;
            y = 110;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 7; i++) {
            x = 112;
            y = 0;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 5; i++) {
            x = 0;
            y = -110;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 6; i++) {
            x = -112;
            y = 0;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 4; i++) {
            x = 0;
            y = 110;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 5; i++) {
            x = 112;
            y = 0;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 3; i++) {
            x = 0;
            y = -110;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 4; i++) {
            x = -112;
            y = 0;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        for (int i = 0; i < 2; i++) {
            x = 0;
            y = 110;
            caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
            contador++;
        }
        x = 0;
        x += 200 * 1.5;
        y = -100;
        caselles[contador] = String.valueOf(x) + ";" + String.valueOf(y);
    }

    public static boolean casillaconefecto(int posicion) {
        boolean escasillaespecial=false;
        int[] posiconesespeciales = {5, 6, 9, 12, 14, 18, 19, 23, 26, 27, 31, 32, 41, 42, 45, 52, 53, 54, 58, 59};
        for (int i = 0; i <posiconesespeciales.length ; i++) {
            if (posicion==posiconesespeciales[i]){
                escasillaespecial=true;
            }
        }
        return escasillaespecial;
    }
}
