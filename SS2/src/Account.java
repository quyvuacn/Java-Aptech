import java.util.SortedMap;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        balance=0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance+=amount;
        return balance;
    }

    public int debit(int amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("Rut tien thanh cong.");
        } else {
            System.out.println("Rut tien that bai");
        }
        return balance;
    }

    public int transferTo( Account another,int amount ){
        if(amount<=balance){
            another.balance += amount;
            balance-=amount;
            System.out.println("Chuyen tien thanh cong.");

        } else {
            System.out.println("Chuyen tien that bai");
        }
        return balance;
    }

    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        Account acc1 = new Account("3693636888888","Vu Viet Quy",1000);
        Account acc2 = new Account("1234567891011","Vu Viet Son",1000);
        acc1.transferTo(acc2,100);
        System.out.println(acc1);
        System.out.println(acc2);
    }


}
