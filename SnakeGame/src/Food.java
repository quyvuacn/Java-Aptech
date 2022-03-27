import java.util.Arrays;
import java.util.Random;

public class Food {
    private int XFood;
    private int YFood;
    public Food(){

        do {
            Random r = new Random();
            XFood = r.nextInt(13) + 1;
            YFood = r.nextInt(13) + 1;
//           Check moi khong == than
            int q=0;
            for(int i=0;i<Game.snakes.size();i++){
                if(!(XFood==Game.snakes.get(i).getDot_x() && YFood==Game.snakes.get(i).getDot_y() )){
                    q++;
                }
            }
            if (q==Game.snakes.size()){
                break;
            }

        }while (true);

    }

    public int[] getFood() {
        return new int[] {XFood,YFood};
    }

}
