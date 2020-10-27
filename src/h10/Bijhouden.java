package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bijhouden extends Applet {
    TextField tekstvak;

    int maxGetal;
    int invoer;
    String a;

    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        tekstvak = new TextField();
        add(tekstvak);
        maxGetal = 0;
        tekstvak.addActionListener(new Statement());

    }


    public void paint(Graphics g) {
        g.drawString("Hoogste getal is: " + maxGetal, 50, 50);

    }

    class Statement implements ActionListener {
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

}
