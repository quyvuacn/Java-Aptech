public class TestSoccerPlayer {
    public static void main(String[] args) {
        SoccerPlayer SocP = new SoccerPlayer();
        SocP.run();
        System.out.println("ball(x,y): " + "(" + SocP.getxLocation() + "," + SocP.getyLocation() + ")");
    }
}
