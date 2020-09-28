package h6;

import java.applet.Applet;
import java.awt.*;

public class Rekenen extends Applet {
    int a;
    double b, uitkomst;

    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        a = 113;
        b = 4;
        uitkomst = a / b;
    }

    public void paint(Graphics g) {
        g.drawString("de uitkomst is " + uitkomst, 150, 50);
        g.drawString("Jan krijgt" + uitkomst, 150, 70);
        g.drawString("Ali krijgt" + uitkomst, 150, 90);
        g.drawString("Jeannette krijgt" + uitkomst, 150, 110);
        g.drawString("Abdi krijgt" + uitkomst, 150, 130);
    }


}
