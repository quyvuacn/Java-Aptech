package EX2;

public class TestFight {
    public static void main (String args []) {
        Flight gl = new Flight (857, "Toronto");
        gl.display ();
        System.out.println("Flight number is: " + gl.getNumber());
        System.out.println("Destination is: "+gl.getDestination());
    }
}