package h11;

import java.applet.Applet;
import java.awt.*;

public class Schaakbord extends Applet {

    public void init() {

        setSize(1000, 1000);

    }


    public void paint(Graphics g) {
        int x = 50;
        int y = 40;
        int breedte = 35;
        int hoogte = 50;
        int kolom;

        for (kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, breedte, hoogte);


            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {


                g.setColor(Color.black);
                g.fillRect(x, y, breedte, hoogte);

            } else {

                g.setColor(Color.white);
                g.fillRect(x, y, breedte, hoogte);


            }

            x += breedte;
        }
        x = 50;
        y += hoogte;

        for (kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.white);
            } else {
                g.setColor(Color.black);

            }
            g.fillRect(x, y, breedte, hoogte);
            x += breedte;

        }
    }

}
