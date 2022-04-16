package EX1;

/*
Author : Quy Vu
*/
public class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "EX.Mammal["+super.toString()+"]";
    }
}
