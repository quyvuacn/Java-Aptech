import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Game{
    public static ArrayList<Snake> snakes = new ArrayList<>();
    public  static   JFrame f = new JFrame();
    public  static Draw draw = new  Draw();
    public  static  KeyListenerEven keyListenerEven = new KeyListenerEven(); // Để sử dụng thì cần khai báo
    public  static  int KeyCodeOld = 39;
    public  static int Level = 500; // delay càng thấp thì càng khó
    public static Food food = new Food();
    public  static int point = 0;
    public void Game() {
        Snake sn = new Snake();

        f.setSize(615, 630);
        f.setVisible(true);
        f.addKeyListener(keyListenerEven);
        this.snakes.add(new Snake(6,6));
        this.snakes.add(new Snake(5,6));
        this.snakes.add(new Snake(4,6));
        f.add(draw);
        sn.snakeMove();
    }

}
