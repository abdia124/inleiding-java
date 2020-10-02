package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Tekstvakken extends Applet {

    Button knop;
    Button klikie;
    TextField Tekstvak;
    Color backgroundColor = Color.white;
    String message;

    public void init() {
        setSize(1000, 1000);
        Tekstvak = new TextField("hey hoi", 30);
        add(Tekstvak);
        Tekstvak.addActionListener(new Kladje());

        message = "Hallo";
        knop = new Button();
        knop.setLabel("Niet klikken dankje.");
        add(knop);
        knop.addActionListener(new OkListener());

        klikie = new Button();
        klikie.setLocation(150, 150);
        klikie.setLabel("Reset");
        add(klikie);
        klikie.addActionListener(new ResetListener());

    }


    public void paint(Graphics g) {
        g.drawString(message, 50, 100);
    }

    class OkListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("Knopklik");
            setBackground(Color.pink);
            message=Tekstvak.getText();
            repaint();
        }
    }

    class ResetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("klik");
            setBackground(backgroundColor);
            Tekstvak.setText("");
            repaint();

        }
    }

    class Kladje implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}
