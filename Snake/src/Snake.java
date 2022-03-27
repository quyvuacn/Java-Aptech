public class Snake {
    public int[][] snake;

    public  Snake(){
        snake = new  int[][] {{4,5}};
    }

    public void setSnake(int[][] snake) {
        this.snake = snake;
    }

    public int[][] getSnake() {
        return snake;
    }
}
