public class SoccerPlayer {
    private String name;
    private int number;
    private float xLocation;
    private float yLocation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getxLocation() {
        return xLocation;
    }

    public void setxLocation(float xLocation) {
        this.xLocation = xLocation;
    }

    public float getyLocation() {
        return yLocation;
    }

    public void setyLocation(float yLocation) {
        this.yLocation = yLocation;
    }

    public SoccerPlayer(){
        name = "Vũ Viết Quý";
        xLocation = 0;
        yLocation = 0;

    }
    public  void run(){
        xLocation++;
        yLocation++;
    }
    public  void jump(){
        xLocation+=5;
        yLocation+=5;
    }
    public  void kickBall(){
        xLocation+=10;
        yLocation+=10;
    }


}
