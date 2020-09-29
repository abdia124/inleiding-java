package h6;

import java.applet.Applet;
import java.awt.*;

public class Negatief extends Applet {
    int a,b;
    double uitkomst;
    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        a=2147483647;
        b=100;
        uitkomst=a+b;
    }

    public void paint(Graphics g) {
        g.drawString("het antwoord is" + uitkomst,200,250);

    }


}



