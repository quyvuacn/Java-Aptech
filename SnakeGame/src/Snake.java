import java.awt.*;

public class Snake {
    private int dot_x;
    private int dot_y;

    public Snake(){
        dot_x = 6;
        dot_y = 6;
    }
    public Snake(int dot_x,int dot_y){
        this.dot_x =dot_x;
        this.dot_y = dot_y;
    }

    public int getDot_x() {
        return dot_x;
    }

    public int getDot_y() {
        return dot_y;
    }

    public int[] getDot(){
        return new int[] {dot_x,dot_y};
    }

    public void setDot_x(int dot_x) {
        this.dot_x = dot_x;
    }

    public void setDot_y(int dot_y) {
        this.dot_y = dot_y;
    }

    public void setDot(int dot_x, int dot_y) {
        this.dot_y = dot_y;
        this.dot_x = dot_x;
    }
    public static void  snakeRight(){
        if(Game.KeyCodeOld !=37){
            Snake dot_0 = new Snake(0,0);
            dot_0.setDot( Game.snakes.get(0).getDot_x()+1, Game.snakes.get(0).getDot_y());
            Game.snakes.add(0,dot_0);
            Game.snakes.remove(Game.snakes.size()-1);
            Snake.checkSnake_1();
            Snake.checkSnake_2();
            Snake.checkFood();
            Game.KeyCodeOld = 39;
        }
    }
    public static void snakeLeft(){
        if(Game.KeyCodeOld !=39){
            Snake dot_0 = new Snake(0,0);
            dot_0.setDot( Game.snakes.get(0).getDot_x()-1, Game.snakes.get(0).getDot_y());
            Game.snakes.add(0,dot_0);
            Game.snakes.remove(Game.snakes.size()-1);
            Snake.checkSnake_1();
            Snake.checkSnake_2();
            Snake.checkFood();
            Game.KeyCodeOld = 37;
        }
    }
    public static void snakeUp(){
        if(Game.KeyCodeOld !=38){
            Snake dot_0 = new Snake(0,0);
            dot_0.setDot( Game.snakes.get(0).getDot_x(), Game.snakes.get(0).getDot_y()+1);
            Game.snakes.add(0,dot_0);
            Game.snakes.remove(Game.snakes.size()-1);
            Snake.checkSnake_1();
            Snake.checkSnake_2();
            Snake.checkFood();
            Game.KeyCodeOld = 40;
        }
    }

    public static  void  snakeDown(){
            if(Game.KeyCodeOld !=40){
                Snake dot_0 = new Snake(0,0);
                dot_0.setDot( Game.snakes.get(0).getDot_x(), Game.snakes.get(0).getDot_y()-1);
                Game.snakes.add(0,dot_0);
                Game.snakes.remove(Game.snakes.size()-1);
                Snake.checkSnake_1();
                Snake.checkSnake_2();
                Snake.checkFood();
                Game.KeyCodeOld = 38;
            }
    }

    public static  boolean checkSnake_1(){
        for (int i=1;i<Game.snakes.size();i++){
            if(Game.snakes.get(0).getDot_x()==Game.snakes.get(i).getDot_x()
                && Game.snakes.get(0).getDot_y()==Game.snakes.get(i).getDot_y()){
                return true;
            }
        }
        return false;
    }
//Check rắn đi qua lề
    public static void checkSnake_2(){
        if(Game.snakes.get(0).getDot_x()==14){
            Game.snakes.get(0).setDot_x(0);
        } else if(Game.snakes.get(0).getDot_y()==14){
            Game.snakes.get(0).setDot_y(0);
        }else if(Game.snakes.get(0).getDot_y()<0){
            Game.snakes.get(0).setDot_y(13);
        }else if(Game.snakes.get(0).getDot_x()<0){
            Game.snakes.get(0).setDot_x(13);
        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Game.f.add(Game.draw);
    }


    public static void checkFood(){
        if(Game.food.getFood()[0]==Game.snakes.get(0).getDot()[0] && Game.food.getFood()[1]==Game.snakes.get(0).getDot()[1]){
            Game.snakes.add(new Snake(-100,-100));
            Game.food = new Food();
            Game.point++;
        }
    }





    public static void snakeMove(){
        while (true){
            try {
                 if(Snake.checkSnake_1()){
                     break;
                 }
                Thread.sleep(Game.Level);
                if(Game.KeyCodeOld==39){
                    Snake.snakeRight();
                } else if(Game.KeyCodeOld==37){
                    Snake.snakeLeft();
                } else if (Game.KeyCodeOld==40){
                    Snake.snakeUp();
                } else if (Game.KeyCodeOld==38){
                    Snake.snakeDown();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


    }


}
