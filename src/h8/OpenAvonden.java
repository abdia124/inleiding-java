package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenAvonden extends Applet {
    int counter;
    int counter2;
    int counter3;
    int counter4;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    int mannen;
    int vrouwen;
    int jongens;
    int meisjes;

    public void init() {
        counter = 0;
        counter2 = 0;
        counter3 = 0;
        counter4 = 0;
        setBackground(Color.white);
        setSize(1000, 1000);
        knop = new Button();
        knop.setLabel("Mannen");
        knop.addActionListener(new Mannen());
        knop2 = new Button();
        knop2.setLabel("Vrouwen");
        knop2.addActionListener(new Vrouwen());
        knop3 = new Button();
        knop3.setLabel("Jongens");
        knop3.addActionListener(new Jongens());
        knop4 = new Button();
        knop4.setLabel("Meisjes");
        knop4.addActionListener(new Meisjes());
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        mannen = 0;
        vrouwen = 0;
        jongens = 0;
        meisjes = 0;


    }

    public void paint(Graphics g) {


        g.drawString("Het aantal mannen zijn " + counter, 150, 150);
        g.drawString("Het aantal vrouwen zijn " + counter2, 150, 170);
        g.drawString("Het aantal jongens zijn " + counter3, 150, 190);
        g.drawString("Het aantal meisjes zijn " + counter4, 150, 210);

    }

    class Mannen implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            counter++;
            System.out.println("klik" + counter);
            repaint();

        }

    }

    class Vrouwen implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            counter2++;
            repaint();

        }
    }

    class Jongens implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            counter3++;
            repaint();
        }
    }

    class Meisjes implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            counter4++;
            repaint();
        }
    }
}
