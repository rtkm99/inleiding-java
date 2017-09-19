package Show;


import java.awt.*;
import java.applet.*;

public class Variabelen_h05_02 extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int hoogteXAs;
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;


    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        hoogteXAs = 250;
        gewichtValerie = 40;
        gewichtJeroen = 100;
        gewichtHans = 80;

    }

    public void paint(Graphics g) {

        //X & Y as
        g.drawLine(50, hoogteXAs, 350, hoogteXAs);
        g.drawLine(50, hoogteXAs, 50, 10);

        //Valerie
        g.setColor(Color.green);
        g.fillRect(60, hoogteXAs - gewichtValerie, 30, gewichtValerie);

        //Jeroen
        g.setColor(Color.blue);
        g.fillRect(110, hoogteXAs - gewichtJeroen, 30, gewichtJeroen);

        //Hans
        g.setColor(Color.red);
        g.fillRect(160, hoogteXAs - gewichtHans, 30, gewichtHans);

        //Getallen
        g.setColor(lijnkleur);
        g.drawString("0", 20, 255);
        g.drawString("20", 20, 235);
        g.drawLine(45, 230, 55, 230);
        g.drawString("40", 20, 215);
        g.drawLine(45, 210, 55, 210);
        g.drawString("60", 20, 195);
        g.drawLine(45, 190, 55, 190);
        g.drawString("80", 20, 175);
        g.drawLine(45, 170, 55, 170);
        g.drawString("100", 15, 155);
        g.drawLine(45, 150, 55, 150);
    }

}




