package com.DAW1;

import acm.graphics.GImage;

import java.util.ArrayList;

/**
 * La Partida es porta a terme en aquesta clase
 */
public class Partida {//clase
    String[] caselles = new String[64];

    int[] separatint = new int[2];

    /**
     * @param caselles El que fem es indicar on esta cada poscio
     */
    public static void llenar(String[] caselles) {
        caselles[62]="0;0";
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

    /**
     * @param posicion comprobem si a la casella on estem tenim efecte
     * @return retornem si es true o false
     */
    public static boolean casillaconefecto(int posicion) {
        boolean escasillaespecial = false;
        int[] posiconesespeciales = {5, 6, 9, 12, 14, 18, 19, 23, 26, 27, 31, 32, 41, 42, 45,50, 52, 53, 54, 58, 59};
        for (int i = 0; i < posiconesespeciales.length; i++) {
            if (posicion == posiconesespeciales[i]) {
                escasillaespecial = true;
            }
        }
        return escasillaespecial;
    }

    /**
     * Aqui es on es produeix el joc
     * @param arrayjugadors Guardem els diferents jugadors
     * @param llegar guardem si algun jugadro ha arribat
     * @param tablero aqui esta la imatge del tablero
     * @param numero_jugadors el numero de Jugadors que jugen
     * @param aquinletoca a la persona que li toca jugar
     * @return retornem la poscio
     */
    public int partida(ArrayList<Jugador> arrayjugadors, boolean[] llegar, GImage tablero, int numero_jugadors, int[] aquinletoca) {
        int posicio = 0;
        llenar(caselles);
        System.out.println("Turnos de espera: " + arrayjugadors.get(aquinletoca[0]).getTurnodeespera());

        //arrayjugadors.get(aquinletoca[0]).tirada();//tirem el dau
        //En el cas que tinguis que esperate et descontem un.
        if (arrayjugadors.get(aquinletoca[0]).getTurnodeespera() != 0) {
            arrayjugadors.get(aquinletoca[0]).setTurnodeespera(arrayjugadors.get(aquinletoca[0]).getTurnodeespera() - 1);
        } else {
            //tirem el dau i actualitzem la poscio on estem
            arrayjugadors.get(aquinletoca[0]).tirada();
            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta() + arrayjugadors.get(aquinletoca[0]).getNumero());
            System.out.println("Ha salido el numero"+arrayjugadors.get(aquinletoca[0]).getNumero());
            //si la poscio on estem es igual a 63 parem
            if (arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta()== 62) {
                llegar[0] = true;
                //Tood lo sigueinte es para mover para atras
            } else if ((arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta() > 63)) {
                int diferencia=arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta()-63;
                arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(diferencia);
                System.out.println("La diferencia es de "+diferencia);
                switch (diferencia){
                    case 1: arrayjugadors.get(aquinletoca[0]).getFicha().setLocation(112*2,112*4);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(62);break;
                    case 2: arrayjugadors.get(aquinletoca[0]).getFicha().setLocation(112*2,112*3);
                        arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(61);break;
                    case 3: arrayjugadors.get(aquinletoca[0]).getFicha().setLocation(112*2,112*2);
                        arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(60);break;
                    case 4: arrayjugadors.get(aquinletoca[0]).getFicha().move(110 * 1.5, 110 * 1.5);
                        arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(63);
                        llegar[0] = true;
                        posicio = 1;
                    case 5: arrayjugadors.get(aquinletoca[0]).getFicha().setLocation(336 + 36, (tablero.getHeight() - arrayjugadors.get(aquinletoca[0]).getFicha().getHeight() - 36));
                        arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(0);
                }

                //has aqui
            } else {
                arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta() - arrayjugadors.get(aquinletoca[0]).getNumero());
                for (int i = 0; i < arrayjugadors.get(aquinletoca[0]).getNumero(); i++) {
                    System.out.println(arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta()+" devuelve eso");
                    strintotint(separatint, caselles, arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta());
                    arrayjugadors.get(aquinletoca[0]).getFicha().move(separatint[0], separatint[1]);
                    arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta() + 1);
                }
                if (Partida.casillaconefecto(arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta())) {
                    switch (arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta()) {
                        case 5:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(5, -112 * 4);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(9);
                            posicio = 1;
                            break;
                        case 6:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(5, -112 * 6);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(12);
                            posicio = 2;

                            break;
                        case 9:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(-110 * 2, -112 * 3);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(14);
                            posicio = 1;

                            break;
                        case 12:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(0, 110 * 6);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(6);
                            posicio = 2;

                            break;
                        case 14:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(-110 * 4, 0);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(18);
                            posicio = 1;

                            break;
                        case 18:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(-110 * 2, 110 * 3);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(23);
                            posicio = 1;

                            break;
                        case 19:
                            arrayjugadors.get(aquinletoca[0]).setTurnodeespera(2);
                            posicio = 3;
                            System.out.println("Pierde " + arrayjugadors.get(aquinletoca[0]).getTurnodeespera());

                            break;
                        case 23:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(110, 110 * 3);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(27);
                            posicio = 1;

                            break;
                        case 26:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(110 * 5, -110);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(52);
                            arrayjugadors.get(aquinletoca[0]).setTurnodeespera(3);
                            posicio = 4;

                            break;

                        case 27:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(110 * 5, 0);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(32);
                            posicio = 1;

                            break;
                        case 31:
                            arrayjugadors.get(aquinletoca[0]).setTurnodeespera(2);
                            posicio = 8;
                            System.out.println("Pierde " + arrayjugadors.get(aquinletoca[0]).getTurnodeespera());

                            break;
                        case 32:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(-110 * 2, -110 * 5);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(41);
                            posicio = 1;

                            break;
                        case 41:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(-110 * 3, 110);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(45);
                            posicio = 1;

                            break;
                        case 42:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(110, 110 * 5);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(30);
                            posicio = 5;

                            break;
                        case 45:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(110 * 2, 110 * 3);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(50);
                            posicio = 1;

                            break;
                        case 50:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(110 * 3, -110);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(54);
                            posicio = 1;
                            System.out.println("De oca en oca");

                            break;
                        case 52:
                            arrayjugadors.get(aquinletoca[0]).setTurnodeespera(3);
                            posicio = 6;
                            System.out.println("Pierde " + arrayjugadors.get(aquinletoca[0]).getTurnodeespera());
                            break;
                        case 53:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(-110 * 6, -110 * 2);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(23);
                            posicio = 9;

                            break;
                        case 54:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(-110 * 3, -110 * 2);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(59);
                            posicio = 1;

                            break;
                        case 58:
                            arrayjugadors.get(aquinletoca[0]).getFicha().setLocation(336 + 36, (tablero.getHeight() - arrayjugadors.get(aquinletoca[0]).getFicha().getHeight() - 36));
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(0);
                            posicio = 7;

                            break;
                        case 59:
                            arrayjugadors.get(aquinletoca[0]).getFicha().move(110 * 1.5, 110 * 1.5);
                            arrayjugadors.get(aquinletoca[0]).setPosiciondondeesta(63);
                            llegar[0] = true;
                            posicio = 1;
                            break;
                        case 63:
                            llegar[0] = true;
                            posicio = 1;
                            break;
                    }
                }
            }
            System.out.println("El jugador " + (aquinletoca[0] + 1) + " le ha salido el " + arrayjugadors.get(aquinletoca[0]).getNumero() + " i estara a la poscion " + arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta());
        }
        if (aquinletoca[0] == numero_jugadors - 1) {
            aquinletoca[0] = 0;
        } else {
            aquinletoca[0]++;
        }
        if (arrayjugadors.get(aquinletoca[0]).getPosiciondondeesta()==63) llegar[0]=true;
        return posicio;

    }

    /**
     * @param separatint array de dos del x i y
     * @param caselles   al arry de totes les x i y de les caselles
     * @param posicion   poscio on estic
     */
    public static void strintotint(int[] separatint, String[] caselles, int posicion) {
        String[] separat = caselles[posicion].split(";");
        for (int j = 0; j < separatint.length; j++) {
            separatint[j] = Integer.parseInt(separat[j]);
        }
    }

}