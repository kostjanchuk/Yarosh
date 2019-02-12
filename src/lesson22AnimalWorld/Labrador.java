package lesson22AnimalWorld;

import lesson22.Dog;

public class Labrador extends Dog {
    public Labrador(int age, int weight, String color, String name) {
        super(age, weight, color, name);
    }

    public void loudSay(){
        System.out.println(say());
        System.out.println(say());
        System.out.println(say());
    }
}
