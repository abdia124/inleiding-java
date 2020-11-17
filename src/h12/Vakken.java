package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vakken extends Applet {
    TextField[] tekstvak;
    Button knop;
    int teller;

    public void init() {
        tekstvak= new TextField[6];
        knop = new Button();
        add(knop);
        for (teller = 0; teller < tekstvak.length; teller++) {
            tekstvak[teller] = new TextField("" + teller);
            add(tekstvak[teller]);
            tekstvak[teller].addActionListener(new VakListener());

        }

    }

    public void paint(Graphics g) {

        }


    }

class VakListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    }
}
