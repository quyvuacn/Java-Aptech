public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;

    public static void main(String[] args) {
        Customer objCustomer = new Customer();

        objCustomer.customerID = 100;
        objCustomer.customerName = "Vu Viet Quy";
        objCustomer.customerAddress = "Thai Binh";
        objCustomer.customerAge = 19;

        System.out.println("Id cus1" + objCustomer.customerID);
        System.out.println("Name cus1" + objCustomer.customerName);
        System.out.println("Address cus1" + objCustomer.customerAddress);
        System.out.println("Age cus1" + objCustomer.customerAge);

    }
}
