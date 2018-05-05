import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int turnos = 0;
        int x = 0;
        int i = 1;
        int resta = 0;
        boolean salir = true;
        while (salir == true) {
            resta = i - 63;
            if (turnos > 0) {
                turnos--;
            }
            else if (i == 63){
                salir = false;
            }
            else if (i > 63){
                i = 63 - resta;
            }else {
                x = rand.nextInt(6) + 1;
                i += x;
                boolean oca = true;
                boolean puente = true;
                switch (i) {
                    case 5:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 6:
                        if (puente == true) {
                            i = 12;
                            puente = false;
                        } else puente = true;
                        break; //Puente
                    case 9:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 12:
                        if (puente == true) {
                            i = 6;
                            puente = false;
                        } else puente = true;
                        break; //Puente
                    case 14:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 18:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 19:
                        turnos += 2;
                        break; //Posada
                    case 23:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 26:
                        i += 26;
                        break; //Dados
                    case 27:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 31:
                        turnos += 2;
                        break; //Pozo
                    case 32:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 36:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 41:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 42:
                        i = 30;
                        break; //Laberinto
                    case 45:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 50:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 52:
                        turnos += 3;
                        break; //Carcel
                    case 53:
                        i += 53;
                        break; //Dados
                    case 54:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    case 58:
                        i = 1;
                        break; //Calavera
                    case 59:
                        if (oca == true) {
                            i = i + 9;
                            oca = false;
                        } else oca = true;
                        break; //Oca
                    /*case 63:
                        break; // Meta / Oca*/
                    default:
                        break;
                }
                System.out.println(i);
            }
        }
    }
}
