package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RodeMuur extends Applet {
    Button BetonKnop;
    Button SteenKnop;
    Color color = Color.gray;
    boolean draw = false;

    public void init() {
        setSize(1500, 1500);
        BetonKnop = new Button("Beton");
        SteenKnop = new Button("Steen");
        add(BetonKnop);
        add(SteenKnop);
        BetonKnop.addActionListener(new Betonlistener());
        SteenKnop.addActionListener(new Steenlistener());

    }

    public void paint(Graphics g) {
        if (draw) drawWall(g, 50, 50, 200, 150, color);

    }

    void drawWall(Graphics g, int x, int y, int breedte, int hoogte, Color color) {
        int y2 = y;
        g.setColor(color);
        g.fillRect(x, y, breedte * 22 / 10, hoogte / 10 * 7);
        g.setColor(Color.black);
        int hoogte2 = hoogte / 10;
        int breedte2 = breedte / 10;
        for (int teller = 0; teller < hoogte * breedte / hoogte2; teller += breedte / 15) {
            g.drawRect(x, y, breedte2, hoogte2);
            y += hoogte2;
            while (y >= hoogte) {
                y = y2;
                x += breedte2;

            }
        }
    }


    class Betonlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            color = Color.red;
            draw = true;
            repaint();
        }
    }

    class Steenlistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            color = Color.gray;
            draw = true;
            repaint();
        }
    }
}