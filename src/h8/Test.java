package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Test extends Applet {

    Button knop;
    Button klikie;
    TextField Tekstvak;
    Color backgroundColor = Color.orange;

    public void init() {
        setSize(1000, 1000);

        knop = new Button();
        knop.setLabel("Niet klikken dankje.");
        add(knop);
        knop.addActionListener(new Tekstklad());

        klikie = new Button();
        klikie.setLocation(150, 150);
        klikie.setLabel("Ok!");
        add(klikie);


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
}
