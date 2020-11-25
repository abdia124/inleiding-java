package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//ik weet niet waarom, maar je moet de applet een beetje schuiven voordat de code pas werkt//

public class Praktijk extends Applet {
    TextField naam;
    Button knop;
    String a,tekst, tekst2;
    int telefoon;
    Label label;

    public void init() {
        label = new Label("voer een getal van 1 t/m 10 in");
        add(label);
        knop = new Button("Bevestig");
        naam = new TextField();
        setSize(1000,1000);
        add(naam);
        add(knop);
        naam.addActionListener(new Listener());
        knop.addActionListener(new Listener());

    }
    public void paint(Graphics g) {
        if (tekst == null) tekst = "";
        if (tekst2 == null)tekst2 = "";
        g.drawString(tekst,100,100 );
        g.drawString(tekst2,100,150);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = naam.getText();
            telefoon = Integer.parseInt(a);
            switch (telefoon) {
                case 1:
                    tekst ="naam Abdi" ;
                    tekst2 = "telefoonummer 0639294929";
                    break;
                case 2:
                    tekst = "naam Rick";
                    tekst2 = "telefoonummer 0629583958";
                    break;
                case 3:
                    tekst = "naam Foekas";
                    tekst2 = "telefoonummer 0610297548";
                    break;
                case 4:
                    tekst = "naam Jeff";
                    tekst2 = "telefoonummer 0638593859";
                    break;
                case 5:
                    tekst = "naam Rico";
                    tekst2 = "telefoonummer 0693758392";
                    break;
                case 6:
                    tekst = "naam Perry";
                    tekst2 = "telefoonummer 0649203947";
                    break;
                case 7:
                    tekst = "naam Ferb";
                    tekst2 = "telefoonummer 0673859385";
                    break;
                case 8:
                    tekst = "naam Roger";
                    tekst2 = "telefoonummer 0655938583";
                    break;
                case 9:
                    tekst = "naam Ace";
                    tekst2 = "telefoonummer 0692485927";
                    break;
                case 10:
                    tekst = "naam Monkey";
                    tekst2 = "telefoonummer 06155873947";
                    break;
                default:
                    tekst = "Dit nummer bestaat niet";
                    break;
            }
        }
    }
}