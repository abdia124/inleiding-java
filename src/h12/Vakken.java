package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vakken extends Applet {
    TextField[] tekstvakken = new TextField[6];
    int[] getallen;
    Button knop;
    Label label;


    public void init() {

        setSize(500,500);

        label = new Label("zet 5 getallen in de tekstvakken");
        knop = new Button("volgorde");
        knop.addActionListener(new VakListener());
        add(knop);
        add(label);
        for (int teller = 0; teller < 6; teller++) {
            tekstvakken[teller] = new TextField("" + teller);
            add(tekstvakken[teller]);
            tekstvakken[teller].addActionListener(new VakListener());

        }

    }

    public void paint(Graphics g) {

        }


    }

class VakListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String a;
        for (int cijfer = 0; cijfer <6 ; cijfer++) {





        }



    }
}
