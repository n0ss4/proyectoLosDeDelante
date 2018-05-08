import acm.graphics.GImage;
import acm.program.GraphicsProgram;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        new HelloGraphics().start(args);
    }

    public static class HelloGraphics extends GraphicsProgram {
        public void run() {
            String arrayImagenes [] = new String[6];
            //For para almacenar la ruta de las imagenes dentro de un array
            for (int i = 0; i < arrayImagenes.length; i++){
                String f = "..\\imagenes\\dados\\"+Integer.toString(i+1)+".png";
                arrayImagenes[i] = f;
            }
            Random rand = new Random();
            int x = rand.nextInt(6);
            GImage rect = new GImage(arrayImagenes[x]);
            add(rect);
            rect.setSize(100,100);
            //Aquí esta el codigo interesante:
            rect.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent arg0) {
                    Random rand2 = new Random();
                    int x = rand2.nextInt(6);
                    rect.setImage(arrayImagenes[x]);
                    rect.setSize(100,100);
                    System.out.println(x+1);
                }
            });
        }
    }
}
