package EX1;

public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank(1000,10);
        System.out.println("Monthly interest is: " + bank.calculateInterest() );
    }
}
