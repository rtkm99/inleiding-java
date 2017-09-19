package Java_Opdrachten;

import java.awt.*;
import java.applet.*;


public class h06_02_Getallen extends Applet {

    int teller;
    int a;
    int b;
    int c;

    public void init() {

        teller = 1;
        a = teller * 60;
        b = a * 24;
        c = b * 365;


    }

    public void paint(Graphics g) {

        teller++;

        g.drawString("Er zitten " + a + " seconden in één uur.", 50, 60);
        g.drawString("Er zitten " + b + " seconden in één dag.", 50, 80);
        g.drawString("Er zitten " + c + " seconden in één dag.", 50, 100);
    }
}
