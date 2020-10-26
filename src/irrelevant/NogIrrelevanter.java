package irrelevant;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NogIrrelevanter extends Applet {
    int leeftijd;
    TextField tekstvak;
    Label label;
    String tekst;

    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("Geef uw leeftijd in en druk op enter");

        add(label);
        add(tekstvak);


    }


    public void paint(Graphics g) {

    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            leeftijd = Integer.parseInt(s);
            if (leeftijd > 20) {
                tekst = "U bent meerderjarig.";
                repaint();
            }
        }
    }
}
