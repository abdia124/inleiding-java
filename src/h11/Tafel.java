package h11;

import java.applet.Applet;
import java.awt.*;

public class Tafel extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        int teller = 1;
        int x = 1;



        while (teller < 15) {
            x += 20;
            g.drawString("" + teller * 3, 50, x);
            teller++;
        }
    }


}
