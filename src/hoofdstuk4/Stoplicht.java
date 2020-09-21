package hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Stoplicht extends Applet {
    public void init() {
      setSize(500,500);
        setBackground(Color.white);
    }
public void paint (Graphics g) {
    g.drawRoundRect(250, 300, 20, 120, 100, 10);
    g.drawLine(260,420,260,550);
    g.setColor(Color.green);
    g.fillOval(250,310, 19, 19);
    g.drawOval(250,310, 19, 19);
    g.setColor(Color.orange);
    g.fillOval(250,350, 19, 19);
    g.drawOval(250,350, 19, 19);
    g.setColor(Color.red);
    g.fillOval(250,390, 19, 19);
    g.drawOval(250,390, 19, 19);
}



}
