package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Knoppen extends Applet {
    Button knop;

    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        knop = new Button();
        knop.setLabel("Ok");
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("deze knop doet niks :)", 50, 60);
class Knopvoorbeeld implements ActionListener {



    public void actionPerformed(ActionEvent e) {
System.out.println("knop");
    }
}

    }
}
