Como he dicho es un codigo bàsico hacen falta unas modificaciones
```
package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int posicion=0;
        int tirada=0;
        int suma = 0;
	    int[] CasillaOca = new int[] {1,5,9,14,18,23,27,32,36,41,45,50,54,59,63}; //Todas las Casillas que tienen una oca
        while (posicion!=63) {
            tirada=dado(); //Invoca el metodo para ver el resultado que da el dado
            posicion+=tirada;
            suma=posicion+tirada;
            for (int i = 0; i < CasillaOca.length-1; i++) {
                if (posicion == CasillaOca[i]) {
                    posicion = CasillaOca[i + 1];
                    System.out.println("De oca en oca y tiro porque me toca");
                    break;
                }
            }
            switch (posicion) {
                case 6:
                    posicion = 12; //En el caso de que caiga en el primer peunte;
                    System.out.println("De puente en puente y tiro porque me lleva la corriente");
                    break;
                case 19: //En el caso de que caigas en la posada
                    System.out.println("La posada pierdes 2 turnos");
                    break;
                case 31: //En el caso que caigas en el pozo
                    System.out.println("El pozo debes esperas hasta que otro jugador caiga en la misma casilla");
                    break;
                case 42:
                    posicion = 30; //En el caso de que caigas en el laberinto
                    System.out.println("Retrocedes hasta la casilla número 30");
                    break;
                case 53: //En el caso que caigas en la càrcel
                    System.out.println("La càrcel desbes esperar hasta que otro jugador caiga en la misma casilla");
                    break;
                case 58:
                    posicion = 0; //En el caso que caigas en la muerte
                    System.out.println("La muerte, pierdes la partida y vuelves a empezar");
                    break;
            }
            if (posicion == 26 && tirada == 3) {//En el caso de que caigas en los primeros dados;
                posicion= 53;
                System.out.println("De dado a dado y tiro porque me ha tocado");
            }
            if (suma>63) { //If que hace rebotar la ficha en caso de que el número para llegar a la meta no sea exacto
                int total = suma-63;
                posicion= 63-total;
            }
        }
    }
    public static int dado () { //Metodo que calcula el resultado obtenido al tirar el dado
        Random aleatorio = new Random();
        int resultado = aleatorio.nextInt(6);
        return resultado+1;
    }
}
```
