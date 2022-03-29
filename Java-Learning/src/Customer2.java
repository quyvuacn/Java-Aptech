public class Customer2 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    public void changeCustomerAddress(String address){
        customerAddress = address;
    }

    public void  displayCustomerInformation(){
        System.out.println("Id cus1" + customerID);
        System.out.println("Name cus1" + customerName);
        System.out.println("Address cus1" + customerAddress);
        System.out.println("Age cus1" + customerAge);
    }
}
