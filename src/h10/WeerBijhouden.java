package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WeerBijhouden extends Applet {
    TextField tekstvak;
    int invoer;
    int maxGetal;
    int minGetal;
    String a,b;


    public void init() {
        setSize(1000, 1000);
        setBackground(Color.white);
        tekstvak = new TextField();
        add(tekstvak);
        maxGetal = 0;
        minGetal = 0;
        tekstvak.addActionListener(new Nummer());
        tekstvak.addActionListener(new Nummer2());

    }


    public void paint(Graphics g) {
g.drawString("het hoogste getal is " + maxGetal,100,100);
g.drawString("het laagste getal is " + minGetal,100,150);

    }

    class Nummer implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = tekstvak.getText();
            System.out.println(a);
            invoer = Integer.parseInt(a);
            if (invoer > maxGetal) {
                maxGetal = invoer;
            } else {


            }
            repaint();
        }
    }
    class Nummer2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            b = tekstvak.getText();
            invoer = Integer.parseInt(a);
            if (minGetal<invoer) {
                minGetal = invoer;
            } else {

            }
            repaint();
        }

    }
}
