package Show;


import java.awt.*;
import java.applet.*;

public class h05 extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;



    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 290;
    
    }

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.BLACK);

        //Lijnen
        g.drawString("gewicht in kilo's" , 550 , 85);
        g.drawLine(600 , 290 , 600 , 90);
        g.drawLine(600 , 290 , 820 , 290);

        //Maten
        g.drawString("100" , 565 , 105);
        g.drawLine(595 , 100 , 605 , 100);
        g.drawString("80" , 575 , 145);
        g.drawLine(595 , 140 , 605 , 140);
        g.drawString("60" , 575 , 185);
        g.drawLine(595 , 180 , 605 , 180);
        g.drawString("40" , 575 , 225);
        g.drawLine(595 , 220 , 605 , 220);
        g.drawString("20" , 575 , 265);
        g.drawLine(595 , 260, 605 , 260);
        g.drawString("0" , 575 , 305);

        //Diagram "Valerie"
        g.drawString("Valerie" , 620 , 310);
        g.setColor(Color.green);
        g.fillRect(621 , 221 , 39 , 69);
        g.setColor(lijnkleur);
        g.drawRect(620 , 220 , 40 , 70);

        //Diagram "Jeroen"
        g.drawString("Jeroen" , 695 , 310);
        g.setColor(Color.blue);
        g.fillRect(694 , 101 , 39 , 189);
        g.setColor(lijnkleur);
        g.drawRect(693 , 100 , 40 , 190);

        //Diagram "Hans"
        g.drawString("Hans" , 770 , 310);
        g.setColor(Color.red);
        g.fillRect(766 , 141 , 39 , 149);
        g.setColor(lijnkleur);
        g.drawRect(765 , 140 , 40 , 150);










        





    }

}
