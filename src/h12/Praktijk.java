package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {
    TextField naam;
    TextField telefoon;
    Button knop;
    Label label;
    Label label2;

    public void init() {
        knop = new Button("Bevestig");
        naam = new TextField();
        telefoon = new TextField();
        label = new Label("voer je naam in");
        label2 = new Label(" voer je telefoonnummer in");
        add(label);
        add(label2);
        add(naam);
        add(telefoon);
        add(knop);
        naam.addActionListener(new Listener());
        telefoon.addActionListener(new Listener());
        knop.addActionListener(new Listener());
    }


    public void paint(Graphics g) {
        label.setLocation(100, 50);
        naam.setLocation(200, 50);
        label2.setLocation(100, 100);
        telefoon.setLocation(270, 100);

    }
    class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }
}
