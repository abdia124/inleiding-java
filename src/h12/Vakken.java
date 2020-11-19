package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Vakken extends Applet {
    int[] getallen = new int[6];
    TextField[] tekstvakken = new TextField[6];
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
        for (int i = 0; i < getallen.length; i++) {
            g.drawString("" + getallen[i], x * i + 50, 50);
        }
    }


    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TextField[] tekstvakken = new TextField[6];
            int[] getallen = new int[6];
            String a;
            for (int cijfer = 0; cijfer < tekstvakken.length; cijfer++) {
                a = tekstvakken[cijfer].getText();
                getallen[cijfer] = Integer.parseInt(a);


            }
            Arrays.sort(getallen);
            repaint();

        }

    }

}
