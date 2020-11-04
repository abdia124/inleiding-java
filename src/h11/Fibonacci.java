package h11;

import java.applet.Applet;
import java.awt.*;

public class Fibonacci extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        int x = 0;
        int antwoord=0;
        int antwoord2=1;
        int uitkomst= antwoord+antwoord2;


        for (int teller = 0; teller < 40; teller++) {

            x+=20;
            g.drawString(""+uitkomst,100,x);

            antwoord=antwoord2;
            antwoord2=uitkomst;
            uitkomst=antwoord+antwoord2;
        }


    }
}
