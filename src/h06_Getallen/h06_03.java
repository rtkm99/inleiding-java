package h06_Getallen;

import java.awt.*;
import java.applet.*;


public class h06_03 extends Applet {

    double a, b, c, uitkomst;


    public void init() {
        a = 8;
        b = 8;
        c = -2;
        uitkomst = (a + b) / c;
    }

    public void paint(Graphics g) {

        g.drawString("Ik heb twee positieve getallen bij elkaar opgeteld", 20, 20);
        g.drawString("en de uikomst gedeeld door een negatief getal en de ", 20, 35);
        g.drawString("en de uitkomst daarvan is : " + uitkomst, 20, 50);
    }
}