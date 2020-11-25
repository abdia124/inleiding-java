package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk extends Applet {
    TextField naam;
    TextField tellie;
    Button knop;
    Label label;
    Label label2;
    int a = 0;
    boolean gevonden = false;
    String[] namen;
    int[] telefoon;

    public void init() {
        knop = new Button("Bevestig");
        naam = new TextField();
        tellie = new TextField();
        label = new Label("voer je naam in");
        label2 = new Label(" voer je telefoonnummer in");

        add(label);
        add(label2);
        add(naam);
        add(tellie);
        add(knop);

        naam.addActionListener(new Listener());
        tellie.addActionListener(new Listener());
        knop.addActionListener(new Listener());

        namen = new String[10];
        telefoon = new int[10];
    }


    public void paint(Graphics g) {

        label.setLocation(100, 50);
        naam.setLocation(200, 50);
        label2.setLocation(100, 100);
        tellie.setLocation(270, 100);

    }
    class Listener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }

}
