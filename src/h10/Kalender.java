package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalender extends Applet {
    TextField tekstvak;
    Label label;
    String a, tekst;
    int maand;


    public void init() {
        tekstvak = new TextField();
        label = new Label("Typ het maandnummer in.");
        add(label);
        add(tekstvak);
        tekstvak.addActionListener(new Maanden());

    }


    public void paint(Graphics g) {
g.drawString(tekst,100,100);
    }

    class Maanden implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = tekstvak.getText();
            maand = Integer.parseInt(a);
            switch (maand) {
                case 1:
                    tekst = "januari, 31 dagen";
                    break;
                case 2:
                    tekst = "februari, 28 dagen";
                    break;
                case 3:
                    tekst = "maart, 31 dagen";
                    break;
                case 4:
                    tekst = "april, 30 dagen";
                    break;
                case 5:
                    tekst = "mei, 31 dagen";
                    break;
                case 6:
                    tekst = "juni, 30 dagen";
                    break;
                case 7:
                    tekst = "juli, 31 dagen";
                    break;
                case 8:
                    tekst = "augustus, 31 dagen";
                    break;
                case 9:
                    tekst = "september, 30 dagen";
                    break;
                case 10:
                    tekst = "oktober, 31 dagen";
                    break;
                case 11:
                    tekst = "november, 30 dagen";
                    break;
                case 12:
                    tekst = "december, 31 dagen";
                    break;
                default:
                    tekst = "Deze maand bestaat niet";
                    break;


            }
            repaint();
        }
    }
}