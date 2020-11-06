package h11;

import java.applet.Applet;
import java.awt.*;

public class Schaakbord extends Applet {

    public void init() {
        setBackground(Color.gray);

    }


    public void paint(Graphics g) {
        int x=20; int x2=40;
        int y=20; int y2=40;
        int breedte=10;
        int hoogte=10;

        for (int zwart = 0; zwart < 8; zwart++) {

            g.drawRect(x, y, breedte, hoogte);
            g.setColor(Color.BLACK);
            g.fillRect(x, y, breedte, hoogte);
            x+=15;
            y+=15;
        }
        for (int wit = 0; wit < 8; wit++) {
            g.drawRect(x2, y2, breedte, hoogte);
            g.setColor(Color.white);
            g.fillRect(x2, y2, breedte, hoogte);
            x2+=15;
            y2+=15;
        }
        }

    }

