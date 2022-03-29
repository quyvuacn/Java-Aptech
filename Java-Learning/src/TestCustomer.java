public class TestCustomer {
    public static void main(String[] args) {
        Customer2 objCustomer = new Customer2();

        objCustomer.customerID = 100;
        objCustomer.customerName = "Vu Viet Quy";
        objCustomer.customerAge = 19;
        objCustomer.changeCustomerAddress("Thai Binh");
        objCustomer.displayCustomerInformation();



    }
}
