package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Vakken extends Applet {
    int[] getallen = new int[5];
    TextField[] tekstvakken = new TextField[5];
    Button knop;
    Label label;

    public void init() {
        setSize(500, 500);
        label = new Label("zet 5 getallen in de tekstvakken");
        knop = new Button("volgorde");
        add(knop);
        add(label);
        for (int teller = 0; teller < tekstvakken.length; teller++) {
            tekstvakken[teller] = new TextField("" + teller);
            add(tekstvakken[teller]);
            tekstvakken[teller].addActionListener(new VakListener());
        }
    }

    public void paint(Graphics g) {
        knop.addActionListener(new VakListener());
        int x = 20;
        for (int teller2 = 0; teller2 < getallen.length; teller2++) {
            g.drawString("" + getallen[teller2], x * teller2 + 50, 50);
        }
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String a;
            for (int cijfer = 0; cijfer < tekstvakken.length; cijfer++) {
                a = tekstvakken[cijfer].getText();
                tekstvakken[cijfer].setText("");
                getallen[cijfer] = Integer.parseInt(a);
            }
            Arrays.sort(getallen);
            repaint();

        }

    }

}
