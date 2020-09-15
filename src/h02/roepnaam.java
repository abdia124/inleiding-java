package h02;
import java.applet.Applet;
import java.awt.*;


public class roepnaam extends Applet{
    public void init() {
        setBackground(Color.white);
    }
    public void paint (Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Abdi",200, 160);
        g.setColor(Color.red);
        g.drawString("Abdulqadir", 200,170);
    }


}
