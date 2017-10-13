package ChallangeJava_h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tabel extends Applet{
    TextField tekstvak;
    TextField tekstvak2;
    TextField tekstvak3;
    int Valerie;
    int Jeroen;
    int Hans;

    public void init() {
        setSize(500, 500);
        Label valerielabel = new Label("Valerie");
        Label jeroenlabel = new Label("Jeroen");
        Label hanslabel = new Label("Hans");
        tekstvak = new TextField(5);
        tekstvak2 = new TextField(5);
        tekstvak3 = new TextField(5);
        Button knop = new Button("Toon");
        knop.addActionListener(new KnopListener());
        add(valerielabel);
        add(tekstvak);
        add(jeroenlabel);
        add(tekstvak2);
        add(hanslabel);
        add(tekstvak3);
        add(knop);
    }

    public void paint( Graphics g){
        g.drawLine(60, 70, 60, 200);
        g.drawLine(60, 200, 300, 200);
        g.drawLine(55, 180, 65, 180);
        g.drawLine(55, 160, 65, 160);
        g.drawLine(55, 140, 65, 140);
        g.drawLine(55, 120, 65, 120);
        g.drawLine(55, 100, 65, 100);
        g.drawLine(55, 80, 65, 80);
        g.drawString("0", 35, 205);
        g.drawString("20", 35, 185);
        g.drawString("40", 35, 165);
        g.drawString("60", 35, 145);
        g.drawString("80", 35, 125);
        g.drawString("100", 30, 105);
        g.drawString("120", 30, 85);
        g.drawString("Valerie", 85, 220);
        g.drawString("Jeroen", 165, 220);
        g.drawString("Hans", 245, 220);
        Color color1 = new Color(51, 214, 255);
        g.setColor(color1);
        g.fillRect(80, 200 - Valerie,50, Valerie);
        g.fillRect(160, 200 - Jeroen,50, Jeroen);
        g.fillRect(240, 200 - Hans,50, Hans);
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

            Valerie = Integer.parseInt(tekstvak.getText());
            Jeroen = Integer.parseInt(tekstvak2.getText());
            Hans = Integer.parseInt(tekstvak3.getText());
            repaint();
        }
    }
}



