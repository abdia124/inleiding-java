package h5;

import java.applet.Applet;
import java.awt.*;
public class Herhaling extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;
    int abdi;
    public void init () {
      setSize(1000,1000);
      setBackground(Color.white);
        breedte=200;
        hoogte=300;
        abdi =50;
        opvulkleur=Color.magenta;

    }
    public void paint (Graphics g) {
        g.drawLine(abdi,100,250,100);
        g.drawString("lijn", abdi,125);
        g.drawRect(abdi,150,breedte,100);
        g.drawString("Rechthoek", abdi,265);
        g.drawString("Afgeronde rechthoek", abdi,415);
        g.drawRoundRect(abdi,hoogte,breedte,100,30,30);
        g.fillRect(hoogte,150,breedte,100);
        g.drawString("Gevulde ovaal",hoogte,415);
        g.drawString("Taartpunt met ovaal eromheen",550,265);
        g.drawString("gevulde rechthoek met ovaal",hoogte,265);
        g.drawString("Cirkel",575,425);
        g.setColor(opvulkleur);
        g.drawOval(hoogte,150,breedte,100);
        g.fillOval(hoogte,150,breedte,100);
        g.fillOval(hoogte,hoogte,breedte,100);
        g.setColor(Color.black);
        g.drawOval(550,150,breedte,100);
        g.setColor(opvulkleur);
        g.fillArc(550,150,breedte,100,0,45);
        g.setColor(Color.black);
        g.drawOval(550,hoogte,100,100);


    }
}
