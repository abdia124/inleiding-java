package h10;

import java.applet.Applet;
import java.awt.*;

public class Gemiddelde extends Applet {
    Button knop;
    TextField tekstvak;
    int cijfer;
    public void init() {
        tekstvak = new TextField();
        knop = new Button("OK");
        add(tekstvak);
        add(knop);


    }


    public void paint(Graphics g) {
g.drawString("Het gemiddelde is ",50,50);
    }
}
