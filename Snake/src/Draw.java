
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Draw extends  Canvas{

    public void paint(Graphics g) {
        g.fillRect(130, 30, 00, 80);
        g.setColor(Color.BLACK);
        for (int i=0;i<=14;i++){
            g.drawLine(20,20+i*40,580,20+i*40);
            g.drawLine(580-i*40,20,580-i*40,580);

        }
        DrawSnake(g);
    }

    public void DrawSnake(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(20, 20, 40, 40);
    }





}
