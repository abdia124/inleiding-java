package h12;

import java.applet.Applet;
import java.awt.*;

public class Getallen extends Applet {
    double gemiddelde;
    int beginWaarde;
    int eindWaarde;
    int[] nummer;
    int tabelWaarde;
    int teller;

    public void init() {

        beginWaarde = 482;
        eindWaarde = 0;
        tabelWaarde = 8769;
        nummer = new int[10];
        for (teller = 0; teller < nummer.length; teller++) {
            nummer[teller] = tabelWaarde * teller + beginWaarde;
            eindWaarde += nummer[teller];

        }

    }


    public void paint(Graphics g) {
        int y=20;
        gemiddelde = eindWaarde / nummer.length;
        for (teller = 0; teller< nummer.length; teller++) {
            g.drawString("" + nummer[teller],50,y*teller);
            g.drawString("het gemiddelde is"+gemiddelde,100,y);
        }


    }

}