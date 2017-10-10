package h10_Beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class h10_Praktijkopdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst;
    int cijfer;

    public void init() {
        setBackground(Color.red);
        tekstvak = new TextField("", 20);
        label = new Label("Voer een cijfer in van 1 t/m 10");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );

    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt( s);
            switch(cijfer) {
                case 1:
                    tekst = "Je hebt een slecht cijfer.";
                    break;
                case 2:
                    tekst = "Je hebt een slecht cijfer.";
                    break;
                case 3:
                    tekst = "Je hebt een slecht cijfer.";
                    break;
                case 4:
                    tekst = "Je hebt een onvoldoende.";
                    break;
                case 5:
                    tekst = "Je hebt een matig cijfer.";
                    break;
                case 6:
                    tekst = "Je hebt een voldoende.";
                    break;
                case 7:
                    tekst = "Je hebt een voldoende.";
                    break;
                case 8:
                    tekst = "Je hebt een Goed.";
                    break;
                case 9:
                    tekst = "Je hebt een Goed.";
                    break;
                case 10:
                    tekst = "Je hebt een Goed.";
                    break;
                default:
                    tekst = "Je hebt een verkeerd nummer ingetikt!!!";
                    break;
            }
            repaint();
        }
    }

}

