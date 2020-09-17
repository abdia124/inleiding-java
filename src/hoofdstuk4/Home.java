package hoofdstuk4;

import java.applet.Applet;
import java.awt.*;

public class Home extends Applet {
       public void init(){
           setSize(500,500);
           setBackground(Color.white);
       }


public void paint (Graphics g){
            g.setColor(Color.pink);
            g.drawRect(150,150,150,150);
            g.drawLine(150,150,250,50);
            g.drawLine(300,150,250,50);
            g.drawRect(160,180,40,40);
            g.drawRect(210,220,40,80);


}


}
