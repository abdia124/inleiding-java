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
    int teller;

    public void init() {
        tekstvak = new TextField();
        label = new Label("voer tafel 1 t/m 10 in");
        add(label);
        add(tekstvak);
        knop = new Button("OK");
        add(knop);
        tekstvak.addActionListener(new Tafel());
        knop.addActionListener(new Tafel());
        getal = 1;
    }

    public void paint(Graphics g) {
        int y = 20;
        for (teller = 1; teller < 10; teller++) {
            uitkomst = getal * teller;
            y += 20;
            g.drawString(getal + "X" + teller + "=" + uitkomst, 50, y);

        }
    }

    class Tafel implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            a = tekstvak.getText();
            getal = Integer.parseInt(a);
            repaint();
        }
    }
}
