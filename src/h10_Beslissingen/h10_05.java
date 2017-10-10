package h10_Beslissingen;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class h10_05 extends Applet {

    TextField tekstvak;
    int aantalcijfers;
    Button knop;
    String s, s2, bepaling;
    Double total, gemiddelde, invoer;
    Boolean bepaling2;


    public void init() {
        tekstvak = (new TextField("", 10));
        add(tekstvak);
        tekstvak.addActionListener(new KnopListener());

        knop = (new Button("Ok"));
        add(knop);
        total = 0.0;
        bepaling = "";
        gemiddelde = 0.0;
        aantalcijfers = 0;
    }


    public void paint(Graphics g) {
        setBackground(Color.green);
        g.setColor(Color.black);
        g.drawString("" + bepaling, 50, 100);
        g.drawString("Het gemiddelde cijfer is: " + gemiddelde, 50, 150);
        g.drawString("Het aantal cijfers is: " + aantalcijfers, 50, 165);
    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            {
                s = tekstvak.getText();
                invoer = Double.parseDouble(s);

                aantalcijfers++;
                total = invoer + total;
                gemiddelde = total / aantalcijfers;


                if (invoer >= 5.5) {
                    bepaling = "Voldoende.";
                } else
                    bepaling = "Onvoldoende.";

                tekstvak.setText("");
                repaint();
            }
        }
    }
}
