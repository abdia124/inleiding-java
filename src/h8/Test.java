package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends Applet {
    Button knop;
    TextField tekstvak;

    public void init() {
        knop = new Button("Ok");
        setBackground(Color.white);
        setSize(1000, 1000);
        tekstvak = new TextField("", 50);
        add(knop);
        add(tekstvak);
        tekstvak.addActionListener(new Btw());
        knop.addActionListener(new Waarde());

    }


    public void paint(Graphics g) {

    }

    class Btw implements ActionListener {



        public void actionPerformed(ActionEvent e) {

        }
    }
    class Waarde implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        }
    }
}
