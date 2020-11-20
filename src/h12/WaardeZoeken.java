package h12;

import java.applet.Applet;
import java.awt.*;

public class WaardeZoeken extends Applet {
TextField tekstvak;
Button knop;
    public void init() {
        tekstvak =  new TextField();
        knop = new Button();
        add(knop);
        add(tekstvak);
        int index;
        int[] getallen = new int[]{};
        setSize(1000,1000);
    }


    public void paint(Graphics g) {

    }
}
