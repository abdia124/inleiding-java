package hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class H4 extends Applet {
    public void init(){
        setSize(500,500);
        setBackground(Color.black);
    }



    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.drawLine(100,170, 200, 170);
        g.drawLine(100,170,180,240);
        g.drawLine(200,170,180,240);
    }
}