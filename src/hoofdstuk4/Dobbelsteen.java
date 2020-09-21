package hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {
    public void init() {
     setSize(500,500);
       setBackground(Color.white);

    }
    public void paint(Graphics g) {
    g.drawRoundRect(20, 20, 200, 200, 10, 10);
    g.drawOval(30,30,50,50);
    g.fillOval(30,30,51,51);
    g.drawOval(30,160,50,50);
    g.fillOval(30,160,51,51);
    g.drawOval(160,30,50,50);
    g.fillOval(160,30,51,51);
    g.drawOval(160,160,50,50);
    g.fillOval(160,160,51,51);
    }


}
