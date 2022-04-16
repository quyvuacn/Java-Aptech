package EX1;

/*
Author : Quy Vu
*/
public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }
    public void greets(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "EX.Cat["+super.toString()+"]";
    }
}
