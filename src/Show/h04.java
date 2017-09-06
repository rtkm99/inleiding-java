package Show;


//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class h04 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);
        g.drawLine(210, 35 , 360 , 35);
        g.drawLine(290, 130 , 430 , 130);
        g.drawLine(360 , 35 , 430 , 130);
        g.drawLine(290 ,290 ,430 , 290);
        g.drawRect(130 , 130 , 160 , 160);
        g.drawLine(130 , 130 , 210 , 35);
        g.drawLine(290 , 130 , 210 , 35);
        g.drawRect(150 , 240 , 30 , 50);
        g.drawRect(210, 210 , 50 , 30);
        g.drawOval(172 , 265 , 4 , 4);
        g.drawLine(430 , 290 , 430 , 130);
        g.drawLine(450 , 290 , 450 , 130);
        g.setColor(Color.red);
        g.fillRect(450 , 110 , 90 , 20);
        g.setColor(Color.black);
        g.drawRect(450 , 110 , 90 , 60);
        g.setColor(Color.blue);
        g.fillRect(450 , 150 , 90 , 20);

    }

}
