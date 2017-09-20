package Java_Opdrachten;

import java.awt.*;
import java.applet.*;


public class h06_01_Getallen extends Applet {
    double a;
    double b;
    double uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = (a) / b;
    }

    public void paint(Graphics g) {

        g.drawString("Jan krijgt €" + uitkomst, 20, 20);
        g.drawString("Ali krijgt €" + uitkomst, 20, 40);
        g.drawString("Jeannette krijgt €" + uitkomst, 20, 60);
        g.drawString("Kevin krijgt €" + uitkomst, 20, 80);


    }
}
