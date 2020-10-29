package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Schrikkelkalender extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    Label label2;
    String b;
    String tekst;
    String tekst2;
    int maand;
    int jaar;

    public void init() {
        setBackground(Color.white);
        setSize(1000, 1000);
        tekstvak= new TextField();
        tekstvak2= new TextField();
        add(tekstvak2);
        add(tekstvak);
        label2=new Label("typ het jaar in");
        label=new Label("typ hier het maandnummer in");
        add(label);
        add(label2);


        tekstvak.addActionListener(new Maanden());
        tekstvak2.addActionListener(new Jaren());


    }


    public void paint(Graphics g) {
        g.drawString(tekst,100,100);
        g.drawString(tekst2,100,150);
        tekstvak.setLocation(150,200);
        tekstvak2.setLocation(150,250);
        tekstvak.setSize(100,100);
        tekstvak2.setSize(100,100);
        label.setLocation(150,170);
        label2.setLocation(150,220);
    }

    class Maanden implements ActionListener {
        public void actionPerformed(ActionEvent e) {


            b = tekstvak.getText();
            maand = Integer.parseInt(b);
            switch (maand) {
                case 1:
                    tekst = "januari, 31 dagen";
                    break;
                case 2:
                    tekst = "februari, 28 dagen";
                    break;
                case 3:
                    tekst = "maart, 31 dagen";
                    break;
                case 4:
                    tekst = "april, 30 dagen";
                    break;
                case 5:
                    tekst = "mei, 31 dagen";
                    break;
                case 6:
                    tekst = "juni, 30 dagen";
                    break;
                case 7:
                    tekst = "juli, 31 dagen";
                    break;
                case 8:
                    tekst = "augustus, 31 dagen";
                    break;
                case 9:
                    tekst = "september, 30 dagen";
                    break;
                case 10:
                    tekst = "oktober, 31 dagen";
                    break;
                case 11:
                    tekst = "november, 30 dagen";
                    break;
                case 12:
                    tekst = "december, 31 dagen";
                    break;
                default:
                    tekst = "Deze maand bestaat niet";
                    break;


            }
        }
    }
class Jaren implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        jaar=Integer.parseInt(b);
        b=tekstvak2.getText();
        if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                jaar % 400 == 0 ) {
            tekst2 = ""+ jaar + " is een schrikkeljaar";
        }
        else {
            tekst2 = ""+ jaar + " is geen schrikkeljaar";
        }
       repaint();

    }

}

}
