package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rekenmachine extends Applet {

    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    TextField tekstvak;
    TextField tekstvak2;
    Double getal;
    int uitkomst;
    int a;
    int b;


    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        knop = new Button("+");
        knop2 = new Button("-");
        knop3 = new Button("*");
        knop4 = new Button("/");
        tekstvak = new TextField();
        tekstvak2 = new TextField();
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        add(tekstvak);
        add(tekstvak2);
        tekstvak.addActionListener(new plus());
        tekstvak2.addActionListener(new plus());
        tekstvak.addActionListener(new min());
        tekstvak2.addActionListener(new min());
        tekstvak.addActionListener(new keer());
        tekstvak2.addActionListener(new keer());
        tekstvak.addActionListener(new gedeeld());
        tekstvak2.addActionListener(new gedeeld());
        getal = 0.0;
        a=tekstvak.getText(plus);
        b=tekstvak2.getText(plus);

    }


    public void paint(Graphics g) {

    }

    class plus implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String imput = tekstvak.getText();
            getal = Double.parseDouble(imput);
            System.out.println(imput);
            getal += 0;
            repaint();
        }
    }

    class min implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        }
    }

    class keer implements ActionListener {

        public void actionPerformed(ActionEvent e) {

        }
    }

    class gedeeld implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
