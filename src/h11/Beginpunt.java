package h11;

import java.applet.Applet;
import java.awt.*;

public class Beginpunt extends Applet {

    public void init() {
        setSize(1000,1000);
    }

    public void paint(Graphics g) {
        int x = 50; int y = 50; int width = 50; int height = 50;
        for (int i = 0; i < 100; i++){
            g.drawOval(x, y, width, height);
            width += 5;
            height += 5;
        }


    }
}
