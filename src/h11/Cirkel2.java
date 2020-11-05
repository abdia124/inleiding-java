package h11;

import java.applet.Applet;
import java.awt.*;

public class Cirkel2 extends Applet {

    public void init() {
setSize(1000,1000);
    }


    public void paint(Graphics g) {
        int x = 400;
        int y = 400;
        int breedte = 10;
        int hoogte = 10;

        for (int teller = 1; teller < 51; teller++) {
            g.drawOval(x, y, breedte, hoogte);
            breedte += 10;
            hoogte += 10;
            x -= 5;
            y -= 5;

        }
    }
}
