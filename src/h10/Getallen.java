package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Getallen extends Applet {
    Button knop;
    TextField tekstvak;
    int cijfer;
    String a;
    int gemiddelde;
    Label label;


    public void init() {
        label= new Label("voer cijfer in");
        tekstvak = new TextField();
        knop = new Button("OK");
        add(tekstvak);
        add(knop);
        tekstvak.addActionListener(new Ongeveer());


    }


    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is ", 50, 50);
    }


    class Ongeveer implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            a = tekstvak.getText();
            cijfer = Integer.parseInt(a);







            }
        }


    }
}