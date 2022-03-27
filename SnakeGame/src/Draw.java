
import java.awt.*;
import java.util.ArrayList;



import javax.swing.JFrame;

public class Draw extends  Canvas{

    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.setColor(Color.WHITE);
        g.clearRect(0,0,615,630);
        g.setColor(Color.BLACK);

        g.drawLine(20,20,580,20);
        g.drawLine(580,20,580,580);
        g.drawLine(580,580,20,580);
        g.drawLine(20,580,20,20);

        DrawSnake(g,Game.snakes);
        DrawFood(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.BOLD, 16));
        String point = "Point: " + Game.point;
        g.drawString(point , 20, 15);
        if(Snake.checkSnake_1()){
            DrawEnd(g);
        }
    }

    public void DrawSnake(Graphics g,ArrayList<Snake> snakes){
        for (int i =snakes.size()-1;i>=0;i--){
            if(i==0) {
                g.setColor(Color.RED);
            }
            else {
                g.setColor(Color.YELLOW);
            }

            int x = snakes.get(i).getDot_x();
            int y = snakes.get(i).getDot_y();
            g.fillRect(x*40+22, y*40+22, 36, 36);

        }
    }

    public void DrawFood(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(Game.food.getFood()[0]*40+22, Game.food.getFood()[1]*40+22, 36, 36);

    }

    public void DrawEnd(Graphics g){
        String s = "Game Over";
        g.drawString(s , 260, 15);
    }





}
