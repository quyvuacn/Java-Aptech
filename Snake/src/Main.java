import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Draw draw = new Draw();
//
//
//        JFrame f = new JFrame();
//        f.setSize(615, 630);
//        f.setVisible(true);
//
//       f.add(draw);
        Snake snake = new Snake();
        
        System.out.println(Arrays.toString(snake.getSnake()));
        

    }
}
