import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerEven implements KeyListener {
    private Snake snake = new Snake();

    public void keyTyped(KeyEvent e) {
    }
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 39 :
                if(Game.KeyCodeOld%2==0 && !Snake.checkSnake_1()){
                    snake.snakeRight();
                }
                break;
            case 37:
                if(Game.KeyCodeOld%2==0 && !Snake.checkSnake_1() ){
                    snake.snakeLeft();
                }
                break;
            case 38:
                if(Game.KeyCodeOld%2==1 && !Snake.checkSnake_1() ){
                    snake.snakeDown();
                }
                break;
            case 40:
                if(Game.KeyCodeOld%2==1 && !Snake.checkSnake_1() ){
                    snake.snakeUp();
                }
                break;
        }

    }

    public void keyReleased(KeyEvent e) {

    }

}
