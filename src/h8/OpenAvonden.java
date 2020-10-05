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


    public void init() {
        setBackground(Color.white);
        setSize(1000,1000);
        knop=new Button();
        knop.setLabel("");
        knop2=new Button();
        knop2.setLabel("");
        knop3=new Button();
        knop3.setLabel("");
        knop4=new Button();
        knop4.setLabel("");
        add (knop);
        add(knop2);
        add(knop3);
        add(knop4);

    }
    public void paint(Graphics g){




    }
    class Avond implements ActionListener{

        public void actionPerformed(ActionEvent e) {

        }
    }



}
