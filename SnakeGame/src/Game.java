import javax.swing.*;
import java.util.ArrayList;



public class Game{
    public static ArrayList<Snake> snakes = new ArrayList<>();
    public  static   JFrame f = new JFrame();
    public  static Draw draw = new  Draw();
    public  static  KeyListenerEven keyListenerEven = new KeyListenerEven();
    public  static  int KeyCodeOld = 39;
    public  static int Level = 200;
    public static Food food = new Food();
    public  static int point = 0;
    public void StartGame() {
        f.setSize(615, 630);
        f.setVisible(true);
        f.addKeyListener(keyListenerEven);
        snakes.add(new Snake(6,6));
        snakes.add(new Snake(5,6));
        snakes.add(new Snake(4,6));
        f.add(draw);

        Snake.snakeMove();

    }

}
