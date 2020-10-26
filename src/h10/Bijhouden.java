package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bijhouden extends Applet {
    TextField tekstvak;
    boolean invoer;
    int maxGetal;
    int minGetal;

    String A;

    public void init(){
        setBackground(Color.white);
        setSize(1000,1000);
        tekstvak=new TextField();
        add(tekstvak);
        minGetal=0;

    }


    public void paint(Graphics g) {


    }
    class Statement implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }

}
