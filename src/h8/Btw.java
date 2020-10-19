package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Btw extends Applet {

    Button knop;
    TextField tekstvak;
    Double getal;

    public void init() {
        System.out.println();
        knop = new Button("Ok");
        setBackground(Color.white);
        setSize(1000, 1000);
        tekstvak = new TextField("", 50);
        add(knop);
        add(tekstvak);
        tekstvak.addActionListener(new Waarde());
        knop.addActionListener(new Waarde());
        getal = 0.0;

    }


    public void paint(Graphics g) {
        g.drawString("De btw is" + getal, 100, 100);
    }

    class Betaling implements ActionListener {


        public void actionPerformed(ActionEvent e) {

        }
    }

    class Waarde implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String imput = tekstvak.getText();
            System.out.println(imput);
            getal = Double.parseDouble(imput);
            getal *= 1.21;
            System.out.println(getal);


            repaint();
        }
    }
}
