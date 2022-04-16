package EX1;

/*
Author : Quy Vu
*/
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EX.Animal[" +
                "name='" + name + '\'' +
                ']';
    }
}
