package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Test extends Applet {

    Button knop;
    Button klikie;
    TextField Tekstvak;
    Color backgroundColor = Color.white;

    public void init() {
        setSize(1000, 1000);
        Tekstvak = new TextField("hey hoi",30);
        add(Tekstvak);
        Tekstvak.addActionListener(new Kladje());

        knop = new Button();
        knop.setLabel("Niet klikken dankje.");
        add(knop);
        knop.addActionListener(new Tekstklad());

        klikie = new Button();
        klikie.setLocation(150, 150);
        klikie.setLabel("Reset");
        add(klikie);
        klikie.addActionListener(new Kladtekst());

    }


    public void paint(Graphics g) {

    }

    class Tekstklad implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("Knopklik");
            setBackground(Color.pink);
            repaint();
        }
    }
    class Kladtekst implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.out.println("klik");
            setBackground(backgroundColor);

            repaint();

        }
    }
    class Kladje implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}
