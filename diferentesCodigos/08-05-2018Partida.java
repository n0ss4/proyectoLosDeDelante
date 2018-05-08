package com.DAW1;

import java.util.Random;

/**
 * Created by divad on 07/05/2018.
 */
public class Partida {//clase


        public static void llenar(String []caselles){
        int x=0;int y=0;
        int contador=0;
            for (int i = 0; i <5 ; i++) {
                x+=112;y+=0;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <7 ; i++) {
                x+=0;y+=-110;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <8 ; i++) {
                x+=-112;y+=0;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <6 ; i++) {
                x+=0;y+=110;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <7 ; i++) {
                x+=112;y+=0;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <5 ; i++) {
                x+=0;y+=-110;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <6 ; i++) {
                x+=-112;y+=0;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <4 ; i++) {
                x+=0;y+=110;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <5 ; i++) {
                x+=112;y+=0;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <3 ; i++) {
                x+=0;y+=-110;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <4 ; i++) {
                x+=-112;y+=0;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            for (int i = 0; i <2 ; i++) {
                x+=0;y+=110;
                caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
                contador++;
            }
            x+=112*1.5;y+=0;
            caselles[contador]=String.valueOf(x)+";"+String.valueOf(y);
        }
}
