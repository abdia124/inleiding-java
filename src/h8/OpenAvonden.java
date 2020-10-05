package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpenAvonden extends Applet {
    Button knop;
    Button knop2;
    Button knop3;
    Button knop4;
    int mannen;
    int vrouwen;
    int jongens;
    int meisjes;


    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        knop = new Button();
        knop.setLabel("Mannen");
        knop2 = new Button();
        knop2.setLabel("Vrouwen");
        knop3 = new Button();
        knop3.setLabel("Jongens");
        knop4 = new Button();
        knop4.setLabel("Meisjes");
        add(knop);
        add(knop2);
        add(knop3);
        add(knop4);
        knop.addActionListener(new Avond());


    }

    public void paint(Graphics g) {
g.drawString("Het aantal mannen zijn"+ mannen,150,150);
g.drawString("Het aantal vrouwen zijn"+ 0,150,170);
g.drawString("Het aantal jongens zijn"+ 0,150,190);
g.drawString("Het aantal meisjes zijn"+ 0,150,210);
    }

    class Avond implements ActionListener {


        public void actionPerformed(ActionEvent e) {
        }
    }


}
