package h13;

import java.applet.Applet;
import java.awt.*;

public class RodeMuur extends Applet {


    public void paint(Graphics g) {
        setSize(1500,1500);
        BaksteenMuur(g, 50, 50, 300, 180);


    }

    void BaksteenMuur(Graphics g, int x, int y, int breedte, int hoogte) {

        int y2 = y;
        g.setColor(Color.red);
        g.fillRect(x, y, breedte, hoogte);
        g.setColor(Color.black);
        int hoogte2 = hoogte / 20;
        int breedte2 = breedte / 20;
        for (int teller = 0; teller < hoogte * breedte / hoogte2; teller += breedte / 15) {
            g.drawRect(x, y, breedte2, hoogte2);
            y += hoogte2;
            while (y >= hoogte) {
                y=y2;
                x += breedte2;

            }

        }


    }
}
