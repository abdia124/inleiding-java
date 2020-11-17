package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vakken extends Applet {
    TextField[] tekstvak = new TextField[5];

    public void init() {

    }


    public void paint(Graphics g) {
        for (int teller = 0; teller < tekstvak.length; teller++) {
            tekstvak[teller] = new TextField("" + teller);
            add(tekstvak[teller]);

        }
    }
    class VakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }
}
