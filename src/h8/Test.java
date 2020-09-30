package h8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Test extends Applet {
    Button knop;
    String schermtekst;

    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        knop = new Button();
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        knop.setLabel("NEE");
        add(knop);
    }


    public void paint(Graphics g) {

    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            schermtekst = "Ja, deze knop doet wel iets";
        }
    }
}
