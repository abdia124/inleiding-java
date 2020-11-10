package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk11 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop;
    String a;
    int uitkomst;
    int getal;


    public void init() {
        tekstvak = new TextField();
        label = new Label("voer tafel 1 t/m 10 in");
        add(label);
        add(tekstvak);
        knop = new Button();
        add(knop);
        tekstvak.addActionListener(new Tafel());
    }


    public void paint(Graphics g) {
        for (int teller = 1; teller < 10; teller++) {
            uitkomst = getal * teller;
            int y = 20;


        }


    }

    class Tafel implements ActionListener {
        public void actionPerformed(ActionEvent e) {


        }
    }
}
