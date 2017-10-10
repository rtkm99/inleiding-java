package h10_Beslissingen;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;


public class h10_04 extends Applet {
    TextField tekstvak, jaarvak;
    Label label, labeljaar;
    String s, s2, tekst, tekst2;
    int dag, jaar;

    public void init() {
        setBackground(Color.cyan);
        tekstvak = new TextField("", 5);
        label = new Label("Type de maandnummer in");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
        labeljaar = new Label("Typ het jaar in");
        add(labeljaar);
        tekst2 = "";
        jaarvak = new TextField("", 5);
        jaarvak.addActionListener( new TekstvakListener2());
        add(jaarvak);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 50, 120);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari en deze maand heeft 31 dagen";
                    break;
                case 2:
                    tekst = "Februari en deze maand heeft 28 dagen, tenzij dit een schrikkeljaar is.";
                    break;
                case 3:
                    tekst = "Maart en deze maand heeft 31 dagen";
                    break;
                case 4:
                    tekst = "April en deze maand heeft 30 dagen";
                    break;
                case 5:
                    tekst = "Mei en deze maand heeft 31 dagen";
                    break;
                case 6:
                    tekst = "Juni en deze maand heeft 30 dagen";
                    break;
                case 7:
                    tekst = "Juli en deze maand heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus en deze maand heeft 31 dagen";
                case 9:
                    tekst = "September en deze maand heeft 30 dagen";
                case 10:
                    tekst = "Oktober en deze maand heeft 31 dagen";
                case 11:
                    tekst = "November en deze maand heeft 30 dagen";
                case 12:
                    tekst = "December en deze maand heeft 31 dagen";
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt!!!";
                    break;
            }
            repaint();
        }
    }

    class TekstvakListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s2 = jaarvak.getText();
            jaar = Integer.parseInt(s2);

            if ((jaar % 4 == 0 && !(jaar % 100 == 0)) ||
                    jaar % 400 == 0) {

                tekst2 = "" + jaar + " is een schrikkeljaar.";
            } else {
                tekst2 = "" + jaar + " is een schrikkeljaar.";

            }
            repaint();
        }
    }
}