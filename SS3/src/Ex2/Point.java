package Ex2;

public class Point {
    private int x,y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        return new  int[] {x,y};
    }

    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    public double distance(int x,int y){
        return Math.abs(x-y);
    }

    public double distance(Point another){
        return Math.abs(another.getX()-another.getY());
    }

    public double distance(){
        return Math.sqrt(x*x+y*y);
    }

}
