package h11;

import java.applet.Applet;
import java.awt.*;

public class Schaakbord extends Applet {

    public void init() {

        setSize(1000, 1000);

    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int breedte = 40;
        int hoogte = 40;

        for (int horizontaal = 0; horizontaal < 8; horizontaal++) {
            for (int verticaal = 0; verticaal < 8; verticaal++) {
                if ((verticaal + horizontaal) % 2 == 0) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);
                } else {

                }
                x += 40;
            }
            x = 50;
            y += 40;
        }
    }

}