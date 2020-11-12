package h12;

import java.applet.Applet;
import java.awt.*;

public class Knopjes extends Applet {
    Button[] knoppen =new Button[25];

    public void init() {

    }

    public void paint(Graphics g) {

        for (int teller = 0; teller < knoppen.length; teller++) {
            knoppen[teller]=new Button(""+teller);
            add(knoppen[teller]);
        }
    }
}
