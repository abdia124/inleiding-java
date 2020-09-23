package hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Praktijk extends Applet {
    public void init() {
    setBackground(Color.white);
    setSize(500,500);



    }
    public void paint (Graphics g) {
    g.drawLine(50,100,250,100);
    g.drawString("lijn",50,125);
    g.drawRect(50,150,200,100);
    g.drawString("Rechthoek",50,265);
    g.drawString("Afgeronde rechthoek",50,415);
    g.drawRoundRect(50,300,200,100,30,30);
    g.fillRect(300,150,200,100);
        g.drawString("Gevulde ovaal",300,415);
        g.drawString("Taartpunt met ovaal eromheen",550,265);
    g.drawString("gevulde rechthoek met ovaal",300,265);
    g.drawString("Cirkel",575,425);
        g.setColor(Color.magenta);
    g.drawOval(300,150,200,100);
    g.fillOval(300,150,200,100);
    g.fillOval(300,300,200,100);
    g.setColor(Color.black);
    g.drawOval(550,150,200,100);
    g.setColor(Color.magenta);
    g.fillArc(550,150,200,100,0,45);
    g.setColor(Color.black);
    g.drawOval(550,300,100,100);


    }
}
