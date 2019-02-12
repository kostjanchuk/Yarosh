package lesson22;

public class Fish extends Animal{
    private String name;

    public Fish(int age, int weight, String color, String name) {
        super(age, weight, color);
        this.name = name;
    }

    public String say(){
        String a = ".........";
        return a;
    }
}
