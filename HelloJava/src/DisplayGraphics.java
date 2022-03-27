
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class DisplayGraphics extends Canvas {
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.fillRect(130, 30, 00, 80);
        g.setColor(Color.BLACK);
        for (int i=0;i<=14;i++){
            g.drawLine(20,20+i*40,580,20+i*40);
            g.drawLine(580-i*40,20,580-i*40,580);
        }
        g.setColor(Color.RED);
        g.fillRect(20,20,40,40);
    }

    public static void main(String[] args) {
        DisplayGraphics m = new DisplayGraphics();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(615, 630);
        f.setVisible(true);
    }
}