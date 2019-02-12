package lesson22;

public abstract class Animal {
    private int age;
    private int weight;
    private String color;


    public Animal(int age, int weight, String color) {
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    abstract protected String say();

}
