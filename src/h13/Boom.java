package h13;

import java.applet.Applet;
import java.awt.*;

public class Boom extends Applet {
    int teller;

    public void paint(Graphics g) {
        setSize(1500, 1500);
        BruineBoom(g, 100, 100);
        BruineBoom2(g, 100, 300);
    }

    void BruineBoom(Graphics g, int x, int y) {
        for (teller = 0; teller < 5; teller++) {
            g.setColor(new Color(0xB4322803, true));
            g.drawRect(x, y, 40, 100);
            g.fillRect(x, y, 40, 100);
            g.drawArc(x - 30, y - 30, 100, 70, 0, 360);
            g.setColor(new Color(0x589242));
            g.fillArc(x - 30, y - 30, 100, 70, 0, 360);
            x += 120;
        }

    }

    void BruineBoom2(Graphics g, int x2, int y2) {
        for (teller = 0; teller < 5; teller++) {
            g.setColor(new Color(0xB4322803, true));
            g.drawRect(x2, y2, 40, 100);
            g.fillRect(x2, y2, 40, 100);
            g.drawArc(x2 - 30, y2 - 30, 100, 70, 0, 360);
            g.setColor(new Color(0x589242));
            g.fillArc(x2 - 30, y2 - 30, 100, 70, 0, 360);
            x2 += 120;


        }
    }
}
/*
            dit is de simpele manier
            g.setColor(new Color(0xB4322803, true));
            g.drawRect(x,y,40,100);
            g.fillRect(x,y,40,100);
            g.drawArc(x-30,y-30,100,70,0,360);
            g.setColor(new Color(0x589242));
            g.fillArc(x-30,y-30,100,70,0,360);
            x +=120;

 */