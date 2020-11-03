package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {
    TextField tekstvak;
    Label label;
    int cijfer;
    String a, tekst;

    public void init() {
        tekstvak = new TextField();
        add(tekstvak);
        label = new Label("voer hier het getal in");
        add(label);
        tekstvak.addActionListener(new Gemiddelde());
tekst="";
    }


    public void paint(Graphics g) {
g.drawString("je hebt een"+tekst,50,50);
    }

    class Gemiddelde implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = tekstvak.getText();
            cijfer = Integer.parseInt(a);
            switch (cijfer) {
                case 1:
                case 2:
                case 3:
                    tekst = " slecht";
                    break;
                case 4:
                    tekst = " onvoldoende";
                    break;
                case 5:
                    tekst = " matig";
                    break;
                case 6:
                case 7:
                    tekst = " voldoende";
                    break;
                case 8:
                case 9:
                case 10:
                    tekst = " goed";
                    break;
                default:
                    tekst = " niet van toepassing";

            }
            repaint();
        }
    }
}
