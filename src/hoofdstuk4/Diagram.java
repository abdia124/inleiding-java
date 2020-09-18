package hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Diagram extends Applet {
    public void init() {
        setSize(500, 500);
        setBackground(Color.white);


    }
public void paint (Graphics g) {
        g.drawRect(150,200,50,150);
        g.setColor(Color.pink);
        g.fillRect(151,285,49,65);
        g.setColor(Color.black);
        g.drawRect(215,200,50,150);
        g.setColor(Color.blue);
        g.fillRect(215,200,50,150);
        g.drawRect(290,200,50,150);
        g.setColor(Color.black);
        g.fillRect(290,240,50,110);
        g.drawString("Valerie",150,380);
        g.drawString("Jeroen",220,380);
        g.drawString("Hans",300,380);
}

}