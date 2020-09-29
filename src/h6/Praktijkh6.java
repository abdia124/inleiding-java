package h6;

import java.applet.Applet;
import java.awt.*;

public class Praktijkh6 extends Applet {
    double a, b, c;
    double uitkomst;
    double gemiddelde;

    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a + b + c);
        gemiddelde = uitkomst / 3;
    }

    public void paint(Graphics g) {
        g.drawString("Het antwoord is " + uitkomst, 100, 150);
        g.drawString("Het gemiddelde is (5,9+6,3+6,9):3 " + gemiddelde, 100, 200);
    }
}
