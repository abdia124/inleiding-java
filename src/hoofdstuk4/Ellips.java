package hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Ellips extends Applet {
    public void init() {
        setBackground(Color.blue);


    }
public void paint (Graphics g) {
        g.drawOval(150,200,150,200);
        g.setColor(Color.yellow);
        g.fillArc(150,200,150,200,20,50);

}

}
