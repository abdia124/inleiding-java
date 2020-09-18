package hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class vlag extends Applet {
             public void init() {
                 setSize(500,500);
                 setBackground(Color.white);
             }

public void paint (Graphics g) {
            g.drawLine(250,50,250,250);
            g.setColor(Color.red);
            g.drawRect(251,50,125,25);
            g.fillRect(251,50,125,25);
            g.setColor(Color.white);
            g.drawRect(251,100,125,25);
            g.fillRect(251,100,125,25);
            g.setColor(Color.blue);
            g.drawRect(251,100,125,25);
            g.fillRect(251,100,125,25);


}





}
