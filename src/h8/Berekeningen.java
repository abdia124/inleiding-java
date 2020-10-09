package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Berekeningen extends Applet {
    Button knop;
    TextField tekstvak;


    public void init() {
        knop=new Button();
        setBackground(Color.white);
        setSize(1000, 1000);
        tekstvak = new TextField("nee", 50);
        add(knop);
        add(tekstvak);
        tekstvak.addActionListener(new Btw());

    }


    public void paint(Graphics g) {

    }

    class Btw implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        }
    }
}
