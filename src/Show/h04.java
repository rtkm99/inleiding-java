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
        g.setColor(Color.black);
        g.drawLine(600 , 290 , 600 , 90);
        g.drawLine(600 , 290 , 820 , 290);
        g.drawString("gewicht in kilo's" , 550 , 85);
        g.drawLine(595 , 100 , 605 , 100);
        g.drawLine(595 , 140 , 605 , 140);
        g.drawLine(595 , 180 , 605 , 180);
        g.drawLine(595 , 220 , 605 , 220);
        g.drawLine(595 , 260 , 605 , 260);
        g.drawString("Valerie" , 620 , 310);
        g.drawString("Jeroen" , 695 , 310);
        g.drawString("Hans" , 770 , 310);
        g.drawString("0" , 575 , 305);
        g.drawString("20" , 575 , 265);
        g.drawString("40" , 575 , 225);
        g.drawString("60" , 575 , 185);
        g.drawString("80" , 575 , 145);
        g.drawString("100" , 565 , 105);
        g.setColor(Color.green);
        g.fillRect(621 , 221 , 39 , 69);
        g.setColor(Color.blue);
        g.fillRect(694 , 101 , 39 , 189);
        g.setColor(Color.red);
        g.fillRect(766 , 141 , 39 , 149);
        g.setColor(Color.black);
        g.drawRect(620 , 220 , 40 , 70);
        g.drawRect(693 , 100 , 40 , 190);
        g.drawRect(765 , 140 , 40 , 150);
        g.setColor(Color.blue);
        g.fillRect(125 , 375 , 300 , 100);
        g.setColor(Color.yellow);
        g.fillArc(175 , 400 , 200 , 50 , 0 , 360);
        g.setColor(Color.black);
        g.fillRoundRect(530 , 350 , 50 , 140 , 20 , 20);
        g.setColor(Color.red);
        g.fillOval(535 , 355 , 40 , 40);
        g.setColor(Color.orange);
        g.fillOval(535 , 400 , 40 ,40);
        g.setColor(Color.green);
        g.fillOval(535 , 445 , 40 ,40);
        g.setColor(Color.black);
        g.drawRoundRect(650 , 400 , 100 , 100 , 20 , 20);
        g.setColor(Color.black);
        g.fillOval(665 , 415 , 20 , 20);
        g.fillOval(716 , 415 , 20 , 20);
        g.fillOval(665 , 464 , 20 , 20);
        g.fillOval(716 , 464 , 20 , 20);
        

    }

}
