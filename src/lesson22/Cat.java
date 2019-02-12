package lesson22;

public class Cat extends Animal {
    private String name;

    public Cat(int age, int weight, String color, String name) {
        super(age, weight, color);
        this.name = name;
    }

    public String say(){

        String a = "Hello.My name is "+name+". Meow!";
return a;
    }


}
