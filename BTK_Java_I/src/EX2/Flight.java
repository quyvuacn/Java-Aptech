package EX2;

public class Flight {
    private int number;
    private String destination;

    public Flight() {
        destination = "";
        number =0;
    }
    public Flight(int number, String destination) {
        if(number>0 && !destination.equals(null)){
            this.number = number;
            this.destination = destination;
        }else {
            this.number = 0;
            this.destination = "";
        }

    }

    public void display(){
        System.out.println(number+","+destination);
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }
}
