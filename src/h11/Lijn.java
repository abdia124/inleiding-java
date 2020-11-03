package h11;

import java.applet.Applet;
import java.awt.*;

public class Lijn extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        int teller;
        int x = 0;

        for (teller = 0; teller < 11; teller++) {
            x += 20;
            g.drawLine(x , 20, x, 250 );
            g.drawString("" + teller, x,40  );

        }
    }
    }