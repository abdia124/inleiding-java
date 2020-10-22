package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rekenmachine extends Applet {

    double getal;
    double getal2;
    double result;
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    TextField tekstvak;
    TextField tekstvak2;


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
        knop.addActionListener(new plus());
        knop2.addActionListener(new plus());
        knop3.addActionListener(new plus());
        knop4.addActionListener(new plus());
        knop.addActionListener(new min());
        knop2.addActionListener(new min());
        knop3.addActionListener(new min());
        knop4.addActionListener(new min());
        knop.addActionListener(new keer());
        knop2.addActionListener(new keer());
        knop3.addActionListener(new keer());
        knop4.addActionListener(new keer());
        knop.addActionListener(new gedeeld());
        knop2.addActionListener(new gedeeld());
        knop3.addActionListener(new gedeeld());
        knop4.addActionListener(new gedeeld());
        tekstvak2.addActionListener(new vak());
        knop.addActionListener(new vak());
        knop2.addActionListener(new vak2());
        knop3.addActionListener(new vak3());
        knop4.addActionListener(new vak4());



        getal = 0.0;


    }


    public void paint(Graphics g) {
        g.drawString("resultaat is: " + result, 250, 50);
    }

    class plus implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String imput = tekstvak.getText();
            String imput2 = tekstvak2.getText();
            getal = Double.parseDouble(imput);
            getal2 = Double.parseDouble(imput2);
            result = getal + getal2;
            System.out.println(result);
            repaint();
        }
    }

    class min implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String imput3 = tekstvak.getText();
            String imput4 = tekstvak2.getText();
            getal = Double.parseDouble(imput3);
            getal2 = Double.parseDouble(imput4);
            result = getal - getal2;
            System.out.println(result);
            repaint();
        }
    }

    class keer implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String imput4 = tekstvak.getText();
            String imput5 = tekstvak2.getText();
            getal = Double.parseDouble(imput4);
            getal2 = Double.parseDouble(imput5);
            result = getal * getal2;
            System.out.println(result);
            repaint();
        }
    }

    class gedeeld implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String imput6 = tekstvak.getText();
            String imput7 = tekstvak2.getText();
            getal = Double.parseDouble(imput6);
            getal2 = Double.parseDouble(imput7);
            result = getal / getal2;
            System.out.println(result);
            repaint();

        }
    }

    class vak implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }

    class vak2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            tekstvak2.setText("");
            repaint();

        }
    }

    class vak3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            tekstvak2.setText("");
            repaint();
        }
    }

    class vak4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            tekstvak2.setText("");
            repaint();


        }
    }
}
