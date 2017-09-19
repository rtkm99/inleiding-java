package Java_Opdrachten;

import java.awt.*;
import java.applet.*;

public class h05_01_Variabelen extends Applet {

    Color opvulkleur;
    Color lijnkleur;


    public void init() {

        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
    }

    public void paint(Graphics g) {
        g.drawLine(50 , 30 , 250 , 30);
        g.drawString("Lijn" , 140 , 45);
        g.drawRect(50 , 60 , 200 , 100);
        g.drawString("Rechthoek" , 120 , 180);
        g.drawRoundRect(50 , 200 , 200 , 100 , 40 , 40);
        g.drawString("Afgeronde rechthoek" , 90 , 320);
        g.setColor(opvulkleur);
        g.fillRect(260 , 60 , 200 , 100);
        g.setColor(lijnkleur);
        g.drawOval(260 , 60 , 200 , 100);
        g.drawString("Gevulde rechthoek met ovaal" , 270 , 180);
        g.setColor(opvulkleur);
        g.fillOval(260 , 200 , 200 , 100);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal" , 320 , 320);
        g.setColor(opvulkleur);
        g.fillArc(470 , 60 , 200 , 100 , 0 , 60);
        g.setColor(lijnkleur);
        g.drawOval(470 , 60 , 200 , 100);
        g.drawString("Taartpunt met ovaal eromheen" , 480 , 180);
        g.drawOval(535 , 225 , 70 , 70);
        g.drawString("Cirkel" , 550 , 320);
    }
}
