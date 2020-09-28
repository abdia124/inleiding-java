package h6;

import java.applet.Applet;
import java.awt.*;

public class Seconden extends Applet {
    int a, b, c, d;
    double uurInSeconden;
    double dagInSeconden;
    double jaarInSeconden;

    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        a = 60;
        b = 60;
        c = 24;
        d = 365;
        uurInSeconden = a * b;
        dagInSeconden = a * b * c;
        jaarInSeconden = a * b * c * d;
        System.out.println(jaarInSeconden);
    }

    public void paint(Graphics g) {
        g.drawString("een uur heeft zoveel seconden " + uurInSeconden, 100, 100);
        g.drawString("een dag heeft zoveel seconden " + dagInSeconden, 100, 150);
        g.drawString("een jaar heeft zoveel seconden" + jaarInSeconden, 100, 200);
    }
}
