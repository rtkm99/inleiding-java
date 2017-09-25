package h08_KnoppenEnTekstvlakken;

import javax.swing.text.TextAction;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class h08_01 extends Applet {
    TextField tekstvak;
    Label label;
    String s;
    Button knop;
    Button knop2;


    public void init() {
        tekstvak = new TextField("'Gebruikersnaam'");
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener());
        knop2 = new Button("Reset");
        knop2.addActionListener(new KnopListener());
        label = new Label("Gebruikersnaam:");
        tekstvak.addActionListener(new TekstvakListener());
        add(label);
        add(tekstvak);
        add(knop);
        add(knop2);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 50);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }


    }


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }


}

