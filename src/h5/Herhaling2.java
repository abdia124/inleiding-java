package h5;

import java.applet.Applet;
import java.awt.*;

public class Herhaling2 extends Applet {
    int hoogte;
    int breedte;
    public void init (){
      setBackground(Color.white);
      setSize(1000,1000);
      hoogte =150;
        breedte=50;

    }
    public void paint(Graphics g){
        g.drawRect(hoogte,200,breedte, hoogte);
        g.setColor(Color.pink);
        g.fillRect(hoogte,285,breedte,65);
        g.setColor(Color.black);
        g.drawRect(215,200,breedte, hoogte);
        g.setColor(Color.blue);
        g.fillRect(215,200,breedte, hoogte);
        g.drawRect(290,200,breedte, hoogte);
        g.setColor(Color.black);
        g.fillRect(290,240,breedte,110);
        g.drawString("Valerie",hoogte,380);
        g.drawString("Jeroen",220,380);
        g.drawString("Hans",301,380);


    }


}
