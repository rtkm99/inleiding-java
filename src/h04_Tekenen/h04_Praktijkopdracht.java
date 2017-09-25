package h04_Tekenen;

import java.awt.*;
import java.applet.*;

public class h04_Praktijkopdracht extends Applet {


    public void paint(Graphics g) {
        g.drawLine(50 , 30 , 250 , 30);
        g.drawString("Lijn" , 140 , 45);
        g.drawRect(50 , 60 , 200 , 100);
        g.drawString("Rechthoek" , 120 , 180);
        g.drawRoundRect(50 , 200 , 200 , 100 , 40 , 40);
        g.drawString("Afgeronde rechthoek" , 90 , 320);
        g.setColor(Color.magenta);
        g.fillRect(260 , 60 , 200 , 100);
        g.setColor(Color.black);
        g.drawOval(260 , 60 , 200 , 100);
        g.drawString("Gevulde rechthoek met ovaal" , 270 , 180);
        g.setColor(Color.magenta);
        g.fillOval(260 , 200 , 200 , 100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal" , 320 , 320);
        g.setColor(Color.magenta);
        g.fillArc(470 , 60 , 200 , 100 , 0 , 60);
        g.setColor(Color.black);
        g.drawOval(470 , 60 , 200 , 100);
        g.drawString("Taartpunt met ovaal eromheen" , 480 , 180);
        g.drawOval(535 , 225 , 70 , 70);
        g.drawString("Cirkel" , 550 , 320);
    }
}