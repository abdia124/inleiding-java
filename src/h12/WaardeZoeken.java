package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WaardeZoeken extends Applet {
TextField tekstvak;
Button knop;
int[] getallen = new int[10];
int index;
String tekst;

    public void init() {
        tekstvak =  new TextField();
        knop = new Button();
        add(knop);
        add(tekstvak);
        knop.addActionListener(new Intikken());
        tekstvak.addActionListener(new Intikken());
        setSize(1000,1000);
        for (int teller = 0; teller < getallen.length; teller++){
            getallen[teller] = teller ;
        }
    }


    public void paint(Graphics g) {
        if (tekst == null) tekst = "";
        g.drawString(tekst, 100, 100);


    }
    class Intikken implements ActionListener{
        public void actionPerformed(ActionEvent e){
            int input = Integer.parseInt(tekstvak.getText());
            boolean gevonden = false;
            for (int teller = 0; teller < getallen.length; teller++){
                if (getallen[teller] == input){
                    gevonden = true;
                    index = teller;
                    break;
                }
            }
            if (gevonden == true) {
                tekst = "ja gevonden op index number " + index;
            } else {
                tekst ="niet geovnden";
            }
            repaint();



        }
    }
}
