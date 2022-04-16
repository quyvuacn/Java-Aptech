package EX2;

/*
Author : Quy Vu
*/
public class BigDog extends  Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Woooow");
    }
    public void greets(BigDog bigDog){
        System.out.println("Wooooooow");
    }
}
