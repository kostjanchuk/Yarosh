package lesson22;

public class Dog extends Animal{
    private String name;

    public Dog(int age, int weight, String color, String name) {
        super(age, weight, color);
        this.name = name;
    }

    public String say(){
        String a = "Hello.My name is "+name+". Woof!";
        return a;
    }
}
