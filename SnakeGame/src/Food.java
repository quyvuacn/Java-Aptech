import java.util.Arrays;
import java.util.Random;

public class Food {
    private int XFood;
    private int YFood;
    public Food(){
        for (int i=0;i<Game.snakes.size();i++){
            do{
                Random r = new Random();
                XFood = r.nextInt(13)+1;
                YFood = r.nextInt(13)+1;
            }while (Game.food.getFood()==Game.snakes.get(i).getDot());
        }
    }

    public int[] getFood() {
        return new int[] {XFood,YFood};
    }

}
