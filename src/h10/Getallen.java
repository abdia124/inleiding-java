package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Getallen extends Applet {
    Button knop;
    TextField tekstvak;
    Double cijfer;
    String a, tekst, tekst2;
    Double uitkomst;
    Label label;


    public void init() {
        label = new Label("voer cijfer in");
        add(label);
        tekstvak = new TextField();
        knop = new Button("OK");
        add(tekstvak);
        add(knop);
        tekstvak.addActionListener(new Ongeveer());
        tekstvak.addActionListener(new Geslaagd());
        tekst = "";
        tekst2 = "";

    }


    public void paint(Graphics g) {
        g.drawString("" + tekst, 50, 50);
        g.drawString("" + tekst2, 50, 100);
    }


    class Ongeveer implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            a = tekstvak.getText();
            cijfer = Double.parseDouble(a);
            if (cijfer > 5.45) {
                tekst = "je hebt een voldoende";
            } else {
                tekst = "je hebt een onvoldoende";
            }
            if (cijfer > 10) {
                tekst = "je cijfer kan niet hoger zijn dan 10";
            }

            repaint();


        }
    }

    class Geslaagd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = tekstvak.getText();
            cijfer = Double.parseDouble(a);
            if (cijfer > 5.45) {
                tekst2 = "je bent geslaagd";
            } else {
                tekst2 = "je bent gezakt";
            }
            if (cijfer > 10) {
                tekst2 = "";
            }

            repaint();


        }
    }

}
