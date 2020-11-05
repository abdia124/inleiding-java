package h11;

import java.applet.Applet;
import java.awt.*;

public class Cirkel extends Applet {

    public void init() {

    }



    public void paint(Graphics g) {
        int x=50;
        int y=50;
        int breedte=10;
        int hoogte=10;

        for (int teller = 1; teller < 6; teller++) {
            g.drawOval(x,y,breedte,hoogte);
            breedte+=10;
            hoogte+=10;
            x-=5;
            y-=5;

        }


    }
}
