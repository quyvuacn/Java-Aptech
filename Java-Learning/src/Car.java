public class Car {
    private int carID;
    private String carName;

    public Car(){
        carID = 0;
        carName = "No name";
    }
    public  Car(int carID,String carName){
        this.carID = carID;
        this.carName = carName;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public  void displayCar(){
        System.out.println("ID Car " + carID );
        System.out.println("ID Name " + carName );
    }
}
