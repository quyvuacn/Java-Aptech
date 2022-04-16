package EX2;

/*
Author : Quy Vu
*/

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void greets();
}
